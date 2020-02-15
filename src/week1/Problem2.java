package week1;

import java.util.Scanner;

public class Problem2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int side = scan.nextInt();
		System.out.println(calculateArea(side));
		System.out.println(calculatePerimeter(side));
		System.out.println(calculateDiagonal(side));
	}
	public static int calculateArea(int side) {
		int area = side * side;
		return area;
	}
	public static int calculatePerimeter(int side) {
		int perimeter = 4 * side;
		return perimeter;
	}
	public static double calculateDiagonal(int side) {
		double diagonal = Math.sqrt(side*side + side*side);
		return diagonal;
	}
}
