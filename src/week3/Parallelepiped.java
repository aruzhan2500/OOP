package week3;

public class Parallelepiped extends Shape{
	
	public Parallelepiped(int length, int width, int height) {
		super(length, width, height);
	}
	public Parallelepiped(int length, int width, int height, Color color) {
		super(length, width, height, color);
	}
	
	@Override
	public void draw() {
		if (this.color == Color.Red) {
			System.err.println("[]_]");
		}
		else System.out.println("[]_]");
	}
	@Override
	public double volume() {
		return length * width * height;
	}
	@Override
	public double surfaceArea() {
		return 2 * (length * width + length * height + width * height);
	}
}
