package sis2;

import java.util.Comparator;

public class HireDateComparator implements Comparator<Object>{
	
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		return e1.getHireDate().compareTo(e2.getHireDate());
	}
}
