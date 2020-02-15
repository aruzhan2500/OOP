package sis2;

public class CheckingAccount extends Account{
	private int counter;
	private int free_tr;
	
	public CheckingAccount(int accNumber, int free_tr) {
		super(accNumber);
		this.free_tr = free_tr;
	}
	
	public void deductFee() {
		if(this.counter > this.free_tr) {
			counter -= this.free_tr;
			super.withdraw(0.02*counter);
		}
		else return;
	}
	
	public void addCnt() {
		this.counter++;
	}
	
	public int getCnt() {
		return this.counter;
	}
	
	public String toString() {
		return super.toString() + " " + counter;
	}
	
	public void withdraw(double sum) {
		super.withdraw(sum);
		counter++;
	}
	
	public void deposit(double sum) {
		super.deposit(sum);
		counter++;
	}
	
	public void update() {
		deductFee();
	}
}
