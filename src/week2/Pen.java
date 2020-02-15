package week2;

public class Pen {
	Color newColor;
	int width;
	
	public Pen(){
		this.newColor = Color.Black;
		this.width = 1;
	}
	
	public Pen(Color newColor) {
		this();
		this.newColor = newColor;
	}
	
	public Pen(Color newColor, int width) {
		this(newColor);
		this.width = width;
	}
	
	public Color getColor(Color newColor) {
		return newColor;
	}
	
	public void setColor(final Color newColor) {
		this.newColor = newColor;
	}
	
	public String toString() {
		return newColor + " " + width;
	}
}
