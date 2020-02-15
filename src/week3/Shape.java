package week3;

public abstract class Shape {
	int length;
	int width;
	int height;
	Color color;
	enum Color{
		Red,
		Black
	}
	
	public Shape(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.color = Color.Black;
	}
	public Shape(int length, int width, int height, Color color) {
		this(length, width, height);
		this.color = color;
	}
	
	abstract void draw();
	abstract double volume();
	abstract double surfaceArea();
}
