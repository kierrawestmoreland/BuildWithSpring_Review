package reviewPackage;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Resource
	private ReviewRepository_2 reviewRepository_2;

	@Bean
	public CommandLineRunner populateReviews() {
		return new ReviewPopulator();
	}

	@Resource
	private CategoryRepository categoryRepository;
	
	public class ReviewPopulator implements CommandLineRunner {
		@Override
		public void run(String... args) throws Exception {
			
			Category nonfiction = categoryRepository.save(new Category ( "non fiction"));
			Category suspense = categoryRepository.save(new Category ("suspense"));
			Category selfhelp = categoryRepository.save(new Category ( "self help"));
			
			reviewRepository_2.save(new Review_Model("Men are from Mars, Women are from Venus pt.3", "Oprah Winfrey", "Men are from Mars.", new Date(), nonfiction));
			reviewRepository_2.save(new Review_Model("The Coldest Winter Ever", "Zane", "It was a very cold winter....", new Date(), suspense));
			reviewRepository_2.save(new Review_Model("Barack Obama, ahead of his time", "Kierra Westmoreland", "It was 2008, the start of the great recession.", new Date(), nonfiction));
			reviewRepository_2.save(new Review_Model("Fostering kittens made easy", "K. More", "Determine how much free time you'll be able to give.", new Date(), selfhelp));
			reviewRepository_2.save(new Review_Model("Make your first indoor garden", "J River", "First pick an area with natural sunlight.", new Date(), selfhelp));
}
	}
}