package week1;

import java.util.Scanner;

public class Problem6 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		System.out.println(isPalindrome(text));
	}
	
	public static boolean isPalindrome(String text) {
		for (int i = 0; i < text.length()/2; i++) {
			if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}
}
