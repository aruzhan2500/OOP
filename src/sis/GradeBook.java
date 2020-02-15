package sis;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import week2.Student;

public class GradeBook {
	Course course;
	List<Integer> grades = new ArrayList<Integer>();
	int grade = 0;
	int sum = 0;
	double average = 0;
	int min = 100;
	int max = 0;
	String name1 = "";
	String id1 = "";
	String name2 = "";
	String id2 = "";
	
	public GradeBook() {
		course = new Course();
	}
	public GradeBook(Course course) {
		this.course = course;
	}
	
	public void displayMessage(Student[] student) {
		System.out.println("Welcome to the grade book for " + course.toString() + "!");
		System.out.println();
		System.out.println("Please, input grades for students:");
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < student.length; i++) {
			System.out.println("Student " + student[i].getName() + ": ");
			grade = scan.nextInt();
			grades.add(grade);
			sum += grade;
			if (grade < min) {
				min = grade;
				name1 = student[i].getName();
				id1 = student[i].getId();
			}
			if (grade > max) {
				max = grade;
				name2 = student[i].getName();
				id2 = student[i].getId();
			}
		}
	}
	public void displayGradeReport() {
		System.out.println();
		System.out.print(determineClassAverage());
		System.out.print(determineLowestGrade());
		System.out.print(determineHighestGrade());
	}
	
	public String determineClassAverage() {
		average = sum / grades.size();
		return "Class average is " + average + ".";
	}
	public String determineLowestGrade() {
		return  " Lowest grade is " + min + " (Student " + name1 + ", id: " + id1 + ").";
	}
	public String determineHighestGrade() {
		return " Highest grade is " + max + " (Student " + name2 + ", id: " + id2 + ").";
	}
	public void outputBarChart() {
		System.out.println();
		System.out.println("Grades distribution:");
		String[] star = new String[11];
		for (int i = 0; i < star.length; i++) {
			star[i] = "";
		}
		for (int i = 0; i < grades.size(); i++) {
			if (grades.get(i) == 100) {
				star[0] += '*';
			}
			else if (grades.get(i) >= 90) {
				star[1] += '*';
			}
			else if (grades.get(i) >= 80) {
				star[2] += '*';
			}
			else if (grades.get(i) >= 70) {
				star[3] += '*';
			}
			else if (grades.get(i) >= 60 && grades.get(i) < 70) {
				star[4] += '*';
			}
			else if (grades.get(i) >= 50 && grades.get(i) < 60) {
				star[5] += '*';
			}
			else if (grades.get(i) >= 40 && grades.get(i) < 50) {
				star[6] += '*';
			}
			else if (grades.get(i) >= 30 && grades.get(i) < 40) {
				star[7] += '*';
			}
			else if (grades.get(i) >= 20 && grades.get(i) < 30) {
				star[8] += '*';
			}
			else if (grades.get(i) >= 10 && grades.get(i) < 20) {
				star[9] += '*';
			}
			else if (grades.get(i) >= 0 && grades.get(i) < 10) {
				star[10] += '*';
			}
		}
		System.out.println("00-09: " + star[10]);
		System.out.println("10-19: " + star[9]);
		System.out.println("20-29: " + star[8]);
		System.out.println("30-39: " + star[7]);
		System.out.println("40-49: " + star[6]);
		System.out.println("50-59: " + star[5]);
		System.out.println("60-69: " + star[4]);
		System.out.println("70-79: " + star[3]);
		System.out.println("80-89: " + star[2]);
		System.out.println("90-99: " + star[1]);
		System.out.println("100: " + star[0]);
	}
}
 