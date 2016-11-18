package reviewPackage;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {
	
	private Map<Long, Review_Model> Review_ModelById;
	
	public ReviewRepository(){
		
		Review_ModelById = new HashMap<Long, Review_Model>();
		Review_Model Review_Model1 = new Review_Model(1, "JavaScript", "Kierra", "MAjhhrhewowbddmdjbdejwejdbmsdm dsm dsm d sms dewmnejdmsm", new Date(2016,10,23));
		
		Review_ModelById.put(Review_Model1.getId(), Review_Model1);
		
		
        Review_Model Review_Model2 = new Review_Model(2, "JQuery", "Matthew", "MAjhhrhewowbddmdjbdejwejdbmsdm dsm dsm d sms dewmnejdmsm", new Date(2016,8,20));
		
		Review_ModelById.put(Review_Model2.getId(), Review_Model2);
		
		
        Review_Model Review_Model3 = new Review_Model(3, "JavaScript", "Seth", "MAjhhrhewowbddmdjbdejwejdbmsdm dsm dsm d sms dewmnejdmsm", new Date(2016,10,23));
		
		Review_ModelById.put(Review_Model3.getId(), Review_Model3);
		
		
		
		
	}
    public Review_Model findById(long id){
		return Review_ModelById.get(id);
    	
    }
	
	public Collection<Review_Model> findAll() {
		return Review_ModelById.values();
	}
}
