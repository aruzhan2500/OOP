package week1;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.next();
		System.out.println('+' + repeatMinus(name) + '+');
		System.out.println('|' + name + '|');
		System.out.println('+' + repeatMinus(name) + '+');
	}
	public static String repeatMinus(String name) {
		String minus = "-";
		minus = minus.repeat(name.length());
		return minus;
	}
}
