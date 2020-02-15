package sis;

public class Course {
	String name;
	String description;
	int numberOfCredits;
	
	public Course() {
		name = "Object-oriented Programming and Design";
		description = "CS101";
		numberOfCredits = 3;
	}
	
	public int prerequisite(String s) {
		return 2;
	}
	
	public String toString() {
		return description + " " + name;
	}
}
