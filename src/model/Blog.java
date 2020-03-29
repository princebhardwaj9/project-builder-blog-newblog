package model;

import java.time.LocalDate;

/*Create a class called Blog inside the model package with the following arguments
String title
int description
LocalDate postedOn
Generate appropriate getters and setters.
Generate a 3 argument constructor in the Blog class.*/
// Type your code

public class Blog{
	String title;
	String description;
	LocalDate postedOn;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(LocalDate postedOn) {
		this.postedOn = postedOn;
	}
	
	public Blog(String title, String description, LocalDate postedOn) {
		this.title = title;
		this.description = description;
		this.postedOn = postedOn;
	}	
	
}