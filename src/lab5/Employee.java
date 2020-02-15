package lab5;


public class Employee extends Person implements Comparable{
	public Employee (String name, double salary, String insurance) {
		super(name, salary, insurance);
	}
	public String toString() {
		return super.toString();
	}
	public boolean equals (Object obj) {
		return super.equals(obj);
	}
	public int compareTo(Object otherObject) {
		Employee employee = (Employee) otherObject;
		if (salary < employee.salary) return -1;
		if (salary > employee.salary) return 1;
		return 0;
	}
}

