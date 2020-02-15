package week3;

public class Bear extends Animal{
	public Bear() {
		super();
	}
	
	public Bear(String food) {
		super(food);
	}
	
	@Override
	public void makeSound() {
		System.out.println("RRRRRRR");
	}
	@Override
	public void feed(String fish) {
		System.out.println("Bear catched " + fish);
	}
	@Override
	public void feed(String fish, int n) {
		System.out.println("Bear catched " + n + " amount of " + fish);
	}
}
