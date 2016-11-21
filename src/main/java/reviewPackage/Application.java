package reviewPackage;

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

	private class ReviewPopulator implements CommandLineRunner {
        @Override
        public void run(String... args) throws Exception {
            // code to populate reviews
        }
	}
	@Resource
	private CategoryRepository categoryRepository;
	
	public class ReviewPopulatorRunner implements CommandLineRunner {
		@Override
		public void run(String... args) throws Exception {
			String myReview = "All books were just ok";
			
			reviewRepository_2.save(new Review_Model("Men are from Mars, Women are from Venus pt.3", "Oprah Winfrey", "Men are from Mars.", new Date(), "non_ficton"));
			reviewRepository_2.save(new Review_Model("Men are from Mars, Women are from Venus pt.3", "Oprah Winfrey", "Men are from Mars.", new Date(), "non_ficton"));
			reviewRepository_2.save(new Review_Model("Men are from Mars, Women are from Venus pt.3", "Oprah Winfrey", "Men are from Mars.", new Date(), "non_ficton"));
			reviewRepository_2.save(new Review_Model("Men are from Mars, Women are from Venus pt.3", "Oprah Winfrey", "Men are from Mars.", new Date(), "non_ficton"));
			reviewRepository_2.save(new Review_Model("Men are from Mars, Women are from Venus pt.3", "Oprah Winfrey", "Men are from Mars.", new Date(), "non_ficton"));
}