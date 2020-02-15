package week1;

import java.util.Scanner;

public class Problem4 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println(findRoots(a, b, c));
	}
	
	public static String findRoots(int a, int b, int c) {
		int d = b*b - 4*a*c;
		if (d > 0) {
			double x1 = (-b+Math.sqrt(d))/(2*a);
			double x2 = (-b-Math.sqrt(d))/(2*a);
			return "x1 = " + x1 + " " + "x2 = " + x2;
		}
		else if (d == 0) {
			double x = -b/(2*a);
			return "x = " + x;
		}
		else return "Error";
	}
}
