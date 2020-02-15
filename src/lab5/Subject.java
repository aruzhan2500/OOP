package lab5;

public abstract class Subject {
	String book;
	int credit;
	
	public Subject(String book) {
		this.book = book;
		this.credit = 3;
	}
	
	public Subject(String book, int kredit) {
		this.book = book;
		this.credit = kredit;
	}
	
	public abstract void read();
}
