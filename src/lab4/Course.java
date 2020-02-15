package lab4;

public class Course {
	String courseTitle;
	Textbook textbook;
	Instructor instructor;
	
	public Course() {}
	
	public Course(String courseTitle, Textbook textbook, Instructor instructor) {
		this.courseTitle = courseTitle;
		this.textbook = textbook;
		this.instructor = instructor;
	}
	public String getCourseTitle() {
		return this.courseTitle;
	}
	public Textbook getTextbook() {
		return this.textbook;
	}
	public Instructor getInstructor() {
		return this.instructor;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public void setTextbook(Textbook textbook) {
		this.textbook = textbook;
	}
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
	public String toString() {
		return this.courseTitle + " " + this.textbook.toString() + " " + this.instructor.toString(); 
	}
	
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Course)) return false;
		Course c = (Course)o;
		return c.courseTitle.equals(courseTitle) && c.instructor.equals(instructor) && c.textbook.equals(textbook);
	}
	
	public int hashCode() {
		int code = 1;
		code = this.courseTitle.hashCode() * this.textbook.hashCode() * this.instructor.hashCode();
		return code;
	}
}
