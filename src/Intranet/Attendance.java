package Intranet;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.Vector;

public class Attendance implements Serializable{
	
	private Date date;
	private Map<Student, AttendType> studentAttend;
	private Vector<Discipline> disciplines;
	private Vector<Teacher> teachers;
	private Map<Date, AttendType> journal;
	
	public Attendance(Date date, Discipline discipline, Teacher teacher) {
		this.date = date;
		studentAttend = new TreeMap<Student, AttendType>();
		this.disciplines.add(discipline);
		this.teachers.add(teacher);
		journal = new TreeMap<Date, AttendType>();
	}
	
	public Date getDate() {
		return date;
	}
	public Map<Student, AttendType> getStudentAttend(){
		return studentAttend;
	}
	public Vector<Discipline> getDisciplines() {
		return disciplines;
	}
	public Vector<Teacher> getTeachers() {
		return teachers;
	}
	
	public String toString() {
		return "Attendance list for the Date:" + getDate() + "\nList of Students" + getStudentAttend();
	}
	public int hashCode() {
		return Objects.hash(date, studentAttend, disciplines, teachers);
	}
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Attendance)) return false;
		Attendance a = (Attendance)o;
		return a.date.equals(this.date) && a.studentAttend.equals(this.studentAttend) &&
				a.disciplines.equals(this.disciplines) && a.teachers.equals(this.teachers);
	}
	
	public void setJournal(Teacher t, Discipline d) {
		if (teachers.contains(t) && disciplines.contains(d)) {
			for (Student s : studentAttend.keySet()) {
				journal.put(this.date, this.studentAttend.get(s));
			}
		}
	}
	
	public Map<Date,AttendType> viewJournal(Student s, Teacher t, Discipline d) {
		if (studentAttend.containsKey(s) && teachers.contains(t) && disciplines.contains(d)) {
			return journal;
		}
		else return null;
	}
}
