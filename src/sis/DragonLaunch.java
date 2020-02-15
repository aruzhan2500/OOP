package sis;
import java.util.Scanner;
import java.util.Vector;
import java.lang.Character;

public class DragonLaunch {

	public DragonLaunch() {
	}
	
	public Vector<Character> vector = new Vector<Character>();
	Gender gen = Gender.Boy;
	
	public void kidnap(Person person) {
		for (int i = 0; i < person.toString().length(); i++) {
			if (person.toString().charAt(i) == 'B') {
				vector.add(person.toString().charAt(i));
			}
			else {
				if(vector.isEmpty()) {
					vector.add(person.toString().charAt(i));
				}
				else if(vector.contains('B')) {
					vector.remove(vector.lastElement());
				}
				else {
					vector.add(person.text.charAt(i));
				}
			}
		}
		if (vector.size() == 1) {
			if (vector.contains('B')) {
				gen = Gender.Boy;
			}
			else {
				gen = Gender.Girl;
			}
		}
	}
	public void willDragonEatOrNot() {
			if (vector.size() == 0) {
				System.out.println("Nothing to eat");
			}
			else if (vector.size() == 1) {
				if (gen == Gender.Boy) {
					System.out.println("Dragon will eat a boy");
				}
				else {
					System.out.println("Dragon will eat a girl");
				}
			}
			else {
				System.out.println("Dragon will eat: " + vector.size());
			}
		}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		Person person = new Person(text);
		DragonLaunch dr = new DragonLaunch();
		dr.kidnap(person);
		dr.willDragonEatOrNot();
	}

}
