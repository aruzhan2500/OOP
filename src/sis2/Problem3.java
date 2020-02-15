package sis2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public class Problem3 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Vector<Employee> employees = new Vector<Employee>();
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i=0;i<x;i++) {
			String n = sc.nextLine();
			Double s = sc.nextDouble();
			String d = sc.nextLine();
			Date h = new SimpleDateFormat("dd/mm/yyyy").parse(d);
			String in = sc.nextLine();
			Employee e = new Employee(n,s,h,in);
			employees.add(e);
		}
		String n1 = sc.nextLine();
		Double s1 = sc.nextDouble();
		String date1 = sc.nextLine();
		Date h1 = new SimpleDateFormat("dd/mm/yyyy").parse(date1); 
		String in1 = sc.nextLine();
		Manager m = new Manager(n1, s1, h1, in1, employees);
		m.giveBonus();
		
		sc.close();		
	}

}
