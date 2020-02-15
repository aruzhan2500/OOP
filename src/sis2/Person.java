package sis2;

public class Person {
	String name;
	
	public Person() {}
	
	public Person(String name) {
		this.name = name;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Person)
			return (this.name.equals(((Person)o).name));
		return false;
	}
	
	public String toString() {
		return this.name;
	}
	
	public int hashCode() {
		int result = 17;
		result = 31 * result + name.hashCode();
		return result;
	}
}
