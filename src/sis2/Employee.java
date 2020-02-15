package sis2;

import java.util.Date;
import java.util.Objects;

public class Employee extends Person implements Cloneable {
	private double salary;
	private Date hireDate;
	private String insuranceNumber;
	
	public Employee() {};
	
	public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}
	public boolean equals(Object o) {
		if(o instanceof Employee)
			return (super.equals((Person)o) && this.insuranceNumber.equals(((Employee)o).insuranceNumber) && this.hireDate == ((Employee)o).hireDate);
		return false;
	}
	
	public String toString() {
		return super.toString()+" "+this.insuranceNumber;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public Date getHireDate() {
		return this.hireDate;
	}
	
	public String getInsuranceNumber() {
		return this.insuranceNumber;
	}
	
	public int hashCode() {
		/*int result = 17;
		result = 31 * result + (int)salary;
		result = 31 * result + hireDate.hashCode();
		result = 31 * result + insuranceNumber.hashCode();
		return super.hashCode()+result;
		*/
		return Objects.hash(salary, hireDate,insuranceNumber);
	}
	
	public int compareTo(Object o) {
		Employee e = (Employee)o;
		if(salary < e.salary) return -1;
		if(salary > e.salary) return 1;
		return 0;
	}
	
	public Employee clone() throws CloneNotSupportedException {
		Employee cloneE = (Employee)super.clone();
		return cloneE;
	}

}
