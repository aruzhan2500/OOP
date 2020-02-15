package week1;

import java.util.Scanner;

public class Problem3 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println(displayGrade(number));
	}
	
	static String displayGrade(int n) {
		if (n>94) return "A";
		else if (n>89) return "A-";
		else if (n>84) return "B+";
		else if (n>79) return "B";
		else if (n>74) return "B-";
		else if (n>69) return "C+";
		else if (n>64) return "C";
		else if (n>59) return "C-";
		else if (n>54) return "D+";
		else if (n>49) return "D";
		else if (n>=0) return "F";
		else return "Error";
	}
}
