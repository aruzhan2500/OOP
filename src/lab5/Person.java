package lab5;

import java.util.Date;

public class Person {
	String name;
	double salary;
	Date hireDate;
	String insurance;
	
	public Person (String name, double salary, String insurance) {
		this.name = name;
		this.hireDate = new Date();
		this.salary = salary;
		this.insurance = insurance;
	}
	
	public String toString() {
		return name + " " + hireDate + " " + salary + " " + insurance;
	}
	
	public boolean equals (Object obj) {
		if(this == obj) return true;
		if (!(obj instanceof Person)) return false;
		Person p = (Person)obj;
		return p.name.equals(this.name) && p.salary == this.salary 
				&& p.hireDate.equals(this.hireDate) && p.insurance.equals(this.insurance);
	}
}
