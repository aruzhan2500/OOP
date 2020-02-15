package week3;

public class Ellipsoid extends Shape{
	
	public Ellipsoid(int length, int width, int height) {
		super(length, width, height);
	}
	
	public Ellipsoid(int length, int width, int height, Color color) {
		super(length, width, height, color);
	}
	
	@Override
	public void draw() {
		if (this.color == Color.Red) {
			System.err.println("O");
		}
		else System.out.println("O");
	}
	@Override
	public double volume() {
		return (4 * Math.PI *  length * width * height) / 3;
	}
	@Override
	public double surfaceArea() {
		return 2 * Math.PI *(length * width + length * height + width * height);
	}
}
