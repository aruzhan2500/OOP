package sis;

public class Person {
	Gender gender;
	String text;
	
	public Person() {
		
	}
	public Person(Gender gender) {
		this.gender = gender;
	}
	
	public Person(String text) {
		this.text = text;
	}
	
	public String toString() {
		return text;
	}
	
}
