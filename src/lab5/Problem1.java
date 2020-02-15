package lab5;

public class Problem1 implements Moveable, Alternating{
	int x;
	
	public void moveTo(int x) {
		this.x = x;
		for (int i = 0; i < x; i++) {
			System.out.print(" ");
		}
	}
	
	public void changeVelocity(int velocity) {
		this.x += velocity;
		moveTo(x);
	}
}
