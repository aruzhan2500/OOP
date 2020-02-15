package week3;

import java.util.Vector;

public class Problem5 {
	public static void main(String[] args) {
	    Vector<Person5> v = new Vector<Person5>();
	    Person5 pers1 = new Person5("Aru", "Tole bi");
	    Person5 pers2 = new Person5("Alua", "Shalyapina");
	    Student st1 = new Student("Bakhyt", "Almaty", "computer science", 2, 2.2);
	    Student st2 = new Student("Aigerim", "Kramskogo", "IT infrastructure", 3,3.9);
	    Staff staff1 = new Staff("Ulzhan", "Shymkent", "RPhMSh", 45.5);
	    Staff staff2 = new Staff("Aruzhan", "taraz", "NIS", 54.5);
	    v.add(pers1);
	    v.add(pers2);
	    v.add(st1);
	    v.add(st2);
	    v.add(staff1);
	    v.add(staff2);
	    for (int i = 0; i<v.size();i++){
            System.out.println(v.get(i).toString());
        }
	}
}
