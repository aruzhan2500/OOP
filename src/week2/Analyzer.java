package week2;

import java.util.Scanner;

public class Analyzer {
	public Analyzer() {
	}
	
	public void analyze() {
		Scanner scan = new Scanner(System.in);
		Data data = new Data();
		System.out.println("Enter number(Q to quit):");
		String str = scan.next();
		while(!str.equals("Q")) {
			System.out.println("Enter number(Q to quit):");
			data.add(Double.parseDouble(str));
			data.maximum(Double.parseDouble(str));
			str = scan.next();
		}
		System.out.println("Average = " + data.average());
		System.out.println("Maximum = " + data.getMax());
	}
}
