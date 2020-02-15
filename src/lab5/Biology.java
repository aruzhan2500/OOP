package lab5;

public class Biology extends Subject{
	
	public Biology(String book) {
		super(book);
	}
	
	public Biology(String book, int credit) {
		super(book, credit);
	}
	
	public void read() {
		System.out.println("You should read: " + super.book);
	}
}
