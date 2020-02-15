package week3;

public abstract class Animal {
	private String food;
	
	public Animal() {}
	
	public Animal(String food) {
		this.food = food;
	}
	
	abstract void makeSound();

	abstract void feed(String s);

	abstract void feed(String s, int n);
}
