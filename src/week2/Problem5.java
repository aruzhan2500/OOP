package week2;

public class Problem5 {
	public static void main(String[] args) {
		Pen pen = new Pen();
		Pen pen2 = new Pen(Color.Black, 5);
		pen.setColor(Color.Blue);
		System.out.println(pen.toString());
		System.out.println(pen2.toString());
	}
}
