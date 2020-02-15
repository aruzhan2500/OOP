package lab5;


public class Manager extends Employee implements Comparable{
	int bonus;
	public Manager (String name, double salary, String insurance) {
		super(name, salary, insurance);
		bonus = 50000;
	}
	
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int getBonus() {
		return this.bonus;
	}
	
	public String toString() {
		return super.toString();
	}
	public boolean equals (Object obj) {
		return super.equals(obj);
	}
	
	public int compareTo(Object otherObject) {
		Manager manager = (Manager)otherObject;
		if (salary < manager.salary) return -1;
		if (salary > manager.salary) return 1;
		else if (salary == manager.salary) {
			if (bonus > manager.bonus) return 1;
			if (bonus < manager.bonus) return -1;
		}
		return 0;
	}
}

