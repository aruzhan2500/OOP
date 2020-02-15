package week3;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		Animal bear = new Bear();
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int n = scan.nextInt();
		bear.makeSound();
		bear.feed(s);
		bear.feed(s, n);
	}

}
