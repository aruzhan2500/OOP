package sis2;

import java.util.Date;
import java.util.Vector;

public class Manager extends Employee{
	private int numberOfBonuses = 0;
	Vector<Employee> v;
	
	public Manager(String name, double salary, Date hireDate, String insuranceNumber, Vector<Employee> v) {
		super(name, salary, hireDate, insuranceNumber);
		this.v = v;
	}
	
	public void giveBonus() {
		numberOfBonuses++;
	}
	
	public int getNumberOfBonuses() {
		return numberOfBonuses;
	}
	
	public boolean equals(Object o) {
		if(o instanceof Employee)
			return (super.equals((Employee)o) && this.numberOfBonuses == ((Manager)o).numberOfBonuses);
		return false;
	}
	
	public int hashCode() {
		int result = 17;
		result = 31 * result + numberOfBonuses;
		return super.hashCode() + result;	 
	}
	
	public String toString() {
		return super.toString()+" "+this.numberOfBonuses;
	}
	
	public int compareTo(Object o) {
		Manager m = (Manager)o;
		if(super.compareTo(o)==0) {
			if(numberOfBonuses < m.numberOfBonuses) return -1;
			if(numberOfBonuses > m.numberOfBonuses) return 1;
			return 0;		
		}
		return super.compareTo(o);
	}
	
	public Manager clone() throws CloneNotSupportedException {
		Manager cloneM = (Manager)super.clone();
		return cloneM;
	}

}
