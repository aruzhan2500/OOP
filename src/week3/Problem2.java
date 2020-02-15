package week3;

import java.util.Vector;

import week3.Shape.Color;

public class Problem2 {

	public static void main(String[] args) {
		Vector<Shape> shapes = new Vector<Shape>();
		Shape p1 = new Parallelepiped(1, 2, 3);
		Shape e1 = new Ellipsoid(2, 4, 5);
		Shape p2 = new Parallelepiped(1, 2, 3, Color.Red);
		Shape e2 = new Ellipsoid(2, 4, 5, Color.Red);
		shapes.add(p1);
		shapes.add(e1);
		shapes.add(p2);
		shapes.add(e2);
		
		for (Shape shape : shapes) {
			if (shape instanceof Ellipsoid) {
				Ellipsoid e = (Ellipsoid)shape;
				e.draw();
				System.out.println(e.surfaceArea() + " " + e.volume());
			}
			else if(shape instanceof Parallelepiped) {
				Parallelepiped p = (Parallelepiped)shape;
				p.draw();
				System.out.println(p.surfaceArea() + " " + p.volume());
			}
		}
	}
}
