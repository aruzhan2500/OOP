package lab4;

public class Textbook {
	 String isbn;
	 String title;
	 String author;
	 
	 public Textbook() {}
	 
	 public Textbook(String isbn, String title, String author) {
		 this.isbn = isbn;
		 this.title = title;
		 this.author = author;
	 }
	 public String getIsbn() {
		 return this.isbn;
	 }
	 public String getTitle() {
		 return this.title;
	 }
	 public String getAuthor() {
		 return this.author;
	 }
	 public void setIsbn(String newIsbn) {
		 this.isbn = newIsbn;
	 }
	 public void setTitle(String newTitle) {
		 this.title = newTitle;
	 }
	 public void setAuthor(String newAuthor) {
		 this.author = newAuthor;
	 }
	 public String toString() {
		 return this.isbn + " " + this.title + " " + this.author;
	 }
	 @Override
	 public boolean equals(Object o) {
		 if (this == o) return true;
		 if (!(o instanceof Textbook)) return false;
		 Textbook t = (Textbook)o;
		 return t.isbn.equals(isbn) && t.title.equals(title) && t.author.equals(author);
	 }
	 @Override
	 public int hashCode() {
		 int code = 1;
		 code = this.isbn.hashCode() * this.title.hashCode() * this.author.hashCode();
		 return code;
	 }
}
