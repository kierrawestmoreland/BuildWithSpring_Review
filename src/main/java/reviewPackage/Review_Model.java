package reviewPackage;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;


@Entity
public class Review_Model {

	@Id 
	//The id property is annotated with @Id 
	//so that JPA will recognize it as the object’s ID. 
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	//The id property is also annotated with @GeneratedValue 
	//to indicate that the ID should be generated automatically.
	
	private long id;
	private String title;
	private Date date;
	private String author;
	private String content;
	@ManyToOne(cascade=CascadeType.MERGE)
	private Category category;
	
	public Review_Model(String title, String author, String content, Date date, Category category) {
	//	this.id = id;
		this.title = title;
		this.author = author;
		this.content = content;
		this.date = date;
		this.category = category;
		//constructor method
	}
	
	protected Review_Model(){}
	
	public long getId(){
		return id;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public String getContent(){
		return content;
	}
	
	public Date getDate(){
		return date;
	}
	
	public Category getCategory(){
		return category;
		
	}
	//point of this class is to hold the data for the IDs

}
