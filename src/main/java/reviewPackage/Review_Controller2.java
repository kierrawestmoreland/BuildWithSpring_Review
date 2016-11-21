package reviewPackage;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

	@Controller
	public class Review_Controller2 {

	@Resource
	private ReviewRepository_2 repository;

		
	    @RequestMapping("/reviewPackage")//package name
	    public String displayReview(@RequestParam("id") long id, Model model) {
	    	Review_Model reviewObject = repository.findOne(id);
			model.addAttribute("selectedReview", reviewObject);
	    	return "review_View";
	    }
	   
	    @RequestMapping("/reviewPackALL")
	    public String displayAll(Model model){
	    	Iterable<Review_Model> reviews = repository.findAll();
	    	model.addAttribute("reviews", reviews);
	    	return "all-reviews";
	    }
}