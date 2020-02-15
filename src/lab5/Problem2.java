package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem2 {

	public static void main(String[] args) {
		Employee e = new Employee("Arys", 300000, "a");
		Employee e2 = new Employee("Bakhyt", 500000, "b");
		Employee e3 = new Employee("Assem", 450000, "c");
		Employee m = new Manager("Luisa", 200000, "d");
		Employee m2 = new Manager("Almas", 700000, "d");
		Employee m3 = new Manager("Aslan", 200000, "d");
		List<Employee> l = new ArrayList<Employee>();
		l.add(e);
		l.add(e2);
		l.add(e3);
		l.add(m);
		l.add(m2);
		l.add(m3);
		Collections.sort(l);
		for (Employee a : l) {
			a.toString();
		}
		
	}

}
