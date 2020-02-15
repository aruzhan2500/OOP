package week1;

import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int balance = scan.nextInt();
		int percent = scan.nextInt();
		System.out.println(balance*percent/100);
	}
}
