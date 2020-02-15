package sis2;

import java.util.Vector;

public class Bank {
	Vector<Account> v;
	
	public Bank() {
		this.v = new Vector<Account>();
	}
	
	public void openAccount(Account account) {
		v.addElement(account);
	}
	
	public void closeAccount(Account account) {
		v.removeElement(account);
	}
	
	public void update() {
		for (int i = 0; i < v.size(); i++) {
			v.get(i).update();
		}
	}
	
}
