package Intranet;

import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.Vector;

public class Student extends User{
	
	private int yearOfStudy;
	private String id;
	private Faculty faculty;
	private Transcript transcript;
	private Vector<Discipline> disciplines;
	private double gpa;
	private int sumOfCredits;
	
	public Student(String lastName, String firstName, Faculty faculty) {
		super(lastName, firstName, "Student");
		this.faculty = faculty;
		this.yearOfStudy = new Date().getYear();
		int num = yearOfStudy - 2000;
		this.id = num + "BD" + Database.students.size() + 1;
		disciplines = new Vector<Discipline>();
		gpa = 0;
		sumOfCredits = 0;
	}
	
	public int getYearOfStudy() {
		return yearOfStudy;
	}
	public String getId() {
		return id;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public Transcript getTranscript() {
		return transcript;
	}
	public Vector<Discipline> getDisciplines(){
		return disciplines;
	}
	public String toString() {
		return super.toString() + ". Id: " + this.id + ". Faculty: " + faculty + ". Registered disciplines: " 
				+ (disciplines.size() == 0?"No disciplines yet" : disciplines) + ". Gpa: " + gpa;
	}
	public int hashCode() {
	    return Objects.hash(this.yearOfStudy, this.id, this.faculty, this.transcript, this.disciplines, this.gpa);
	}
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof User)) return false;
		Student s = (Student)o;
	    return s.yearOfStudy == this.yearOfStudy && s.id.equals(this.id) &&
	    		s.faculty.equals(this.faculty) && s.transcript.equals(this.transcript) &&
	    		s.disciplines.equals(this.disciplines) && s.gpa == this.gpa;
	}
	public int compareTo(Object o) {
		Student s = (Student)o;
		return s.id.compareTo(this.id);
	}
	
	public void addDiscipline(Discipline d) {
		if (d.canAddStudent()) {
			disciplines.add(d);
			d.addStudent(this);
		}
	}
	public void updateGpa(double gpa, Discipline discipline) {
		if (disciplines.contains(discipline)) {
			sumOfCredits -= discipline.getCredit();
		}
		this.gpa = this.gpa * sumOfCredits + gpa * discipline.getCredit();
		sumOfCredits += discipline.getCredit();
		this.gpa /= sumOfCredits;
	}
	public double getGpa() {
		return gpa;
	}
	
	public Map<Date,AttendType> getAttandance(Discipline discipline) {
		if (disciplines.contains(discipline)) {
			Attendance a = new Attendance(new Date(), discipline, discipline.getTeacher());
			return a.viewJournal(this, discipline.getTeacher(), discipline);
		}
		return null; 
	}
	
	public Vector<String> viewTranscript() {
		Vector<String> v = new Vector<String>();
		for (Discipline d : disciplines) {
			v.add(transcript.toString());
		}
		return v;
	}
	
    public void setTranscript(Transcript t) {
    	transcript = t;
    }
}
