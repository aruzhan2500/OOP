package Intranet;

import java.util.Objects;
import java.util.Vector;

public class TechGuy extends Employee{

	private Vector<Order> orders;
	public TechGuy(String firstName, String lastName, String kind, int salary) {
		super(firstName, lastName, "TechGuy", salary);
		orders = new Vector<Order>();
	}
	public void acceptOrder(Order order) {
		order.accepted = true;
	}
	public void rejectOrder(Order order) {
		order.accepted = false;
	}
	public void setOrder(Vector<Order> orders) {
		this.orders=orders;
	}
	public Vector<Order> getOrders() {
		return orders;
	}
	public String toString() {
		 return String.format("Your orders are   ", orders);
	}
	 public boolean equals(Object o) {
		 if(o==this) return true;
		 if(o==null || o.getClass()!=this.getClass() ) return false;
		 TechGuy guy= (TechGuy) o;
		 return orders.equals(guy.orders);
	 }
	 public int hashCode() {
		 return Objects.hash(orders);
	 }

	 @Override
	 public int compareTo(Object o) {
		 TechGuy t = (TechGuy)o;
		 if (t.getSalary() > this.getSalary()) return -1;
		 if (t.getSalary() < this.getSalary()) return 1;
		 return 0;
	 }


}
