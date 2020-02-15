package week3;

import java.util.HashSet;
import java.util.Vector;

import lab5.Employee;
import lab5.Manager;
import lab5.Person;

public class Problem3 {

	public static void main(String[] args) {
		HashSet <Person> hs = new HashSet<Person>();
		Vector <Person> vc = new Vector<Person>();
		Person p1 = new Manager("Elnara", 3000000, 2019, "ins");
		Person p2 = new Manager("Aizhar", 2500000, 2018, "out");
		Person p3 = new Employee("Aru", 3500000, 2019, "ins");
		Person p4 = new Employee("Bakhyt", 5000000, 2019, "ins");
		Person p5 = new Employee("Bakhyt", 5000000, 2019, "ins");
		Person p6 = new Employee("Aru", 3500000, 2019, "ins");
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		hs.add(p4);
		hs.add(p5);
		hs.add(p6);
		for (Person e : hs) {
			System.out.println(e.toString());
		}
		vc.add(p1);
		vc.add(p2);
		vc.add(p3);
		vc.add(p4);
		vc.add(p5);
		vc.add(p6);
		for (Person e : vc) {
			System.out.println(e.toString());
		}
		for (int i = 0; i < vc.size(); i++) {
			for (Person per : hs)
				if (vc.get(i).equals(per)) {
					System.out.println(per.toString());
				}
				else {
					System.out.println("This person is duplicate");
				}
		}
	}
}
