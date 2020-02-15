package sis2;

public class SavingsAccount extends Account {
	
	private double interest;
	
	public SavingsAccount(int accNumber, double interest) {
		super(accNumber);
		this.interest = interest;
	}
	
	public void addInterest() {
		deposit(this.interest/100 * this.getBalance());
	}
	
	public String toString() {
		return super.toString() + " " + this.interest;
	}
	
	public void update() {
		this.addInterest();
	}
}
