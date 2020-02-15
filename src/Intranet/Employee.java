package Intranet;

public abstract class Employee extends User{
	
	private int salary;
	public Employee(String firstName, String lastName, String kind, int salary) {
		super(firstName,lastName,"Employee");
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public String toString() {
		return super.toString() + ". Salary: " + salary;
	}
}
