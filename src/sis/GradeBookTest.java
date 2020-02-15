package sis;
import week2.Student;

public class GradeBookTest {

	public static void main(String[] args) {
		Course course = new Course();
		Student[] student = new Student[7];
		student[0] = new Student("Yelnara", "18BD1", 2018);
		student[1] = new Student("Alua", "18BD2", 2018);
		student[2] = new Student("Aizhar", "18BD3", 2018);
		student[3] = new Student("Bakhyt", "18BD4", 2018);
		student[4] = new Student("Zita", "18BD5", 2018);
		student[5] = new Student("Aigerim", "18BD6", 2018);
		student[6] = new Student("Inkar", "18BD7", 2018);
		GradeBook journal = new GradeBook();
		journal.displayMessage(student);
		journal.displayGradeReport();
		journal.outputBarChart();
	}

}
