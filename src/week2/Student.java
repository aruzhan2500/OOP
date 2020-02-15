package week2;

public class Student {
	String name;
	String id;
	int yearOfStudy;
	
	public Student() {
	}
	public Student(String name, String id, int yearOfStudy) {
		this.name = name;
		this.id = id;
		this.yearOfStudy = yearOfStudy;
	}
	public void getAccess() {
		yearOfStudy ++;
		System.out.println(name);
		System.out.println(id);
		System.out.println(yearOfStudy);
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String toString() {
		return name + " " + id + " " + yearOfStudy;
	}
}
