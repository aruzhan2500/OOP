package sis2;

public class Account {
	  private double balance; 
	  private int accNumber;
	  
	  public Account(int a)  {       
		  balance = 0.0;    
		  accNumber = a;  
	  }  
	  
	  public void deposit(double sum) {
		  balance += sum;
	  }
	  
	  public void withdraw(double sum) {
		  if (sum <= this.balance) {
			  balance -= sum;
		  }
		  else return;
	  }
	  
	  public double getBalance() {
		  return balance;
	  }
	  
	  public double getAccountNumber() {
		  return accNumber;
	  }
	  
	  public void transfer(double amount, Account other) {
		  other.deposit(amount);
			withdraw(amount);
	  }
	  
	  public String toString() {
		  return this.balance + " " + this.accNumber;
	  }
	  
	  public final void print() {
		  System.out.println(toString());
	  }
	  
	  public void update() {}
}
