package Intranet;

import java.io.Serializable;
import java.util.Objects;
import java.util.Vector;

public class Discipline implements Serializable{
	
	private String name;
	private Teacher teacher;
	private int credit;
	private int courseId;
	private int capacity;
	private Vector<Student> students;
	private Vector<File> files;

	public Discipline(String name) {
		this.name = name;
		this.credit = 3;
		this.courseId = Database.disciplines.size() + 1;
		this.capacity = 80;
		students = new Vector<Student>();
		files = new Vector<File>();
	}
	public int getCourseId() {
		return courseId;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setCredit(int c) {
		credit = c;
	}
	public int getCredit() {
		return credit;
	}
	public String getDisciplineName() {
		return name;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getCapacity() {
		return capacity;
	}
	public Vector<File> getFiles(){
		return files;
	}
	public void addFile(File file) {
		files.add(file);
	}
	public String toString() {
		if (teacher != null) {
			return "Discipline: " + name + ". Teacher: " + teacher.getName() + ". Credits: " 
					+ credit + ". Capacity: " + capacity;
		}
		else return "Discipline: " + name + ". Teacher: " + "No teacher yet" + ". Credits: " 
		+ credit + ". Capacity: " + capacity;
	}
	public int hashCode() {
		return Objects.hash(name, teacher, credit, courseId, capacity, students);
	}
	public boolean compareTo(Object o) {
		if (this == o) return true;
		if (!(o instanceof Discipline)) return false;
		Discipline d = (Discipline)o;
		return d.name.equals(this.name) && d.teacher.equals(this.teacher) &&
				d.credit == this.credit && d.courseId == this.courseId && 
				d.capacity == this.capacity && d.students.equals(this.students);
	}
	public Vector<Student> getStudents() {
		return students;
	}
	public void addStudent(Student s) {
		students.add(s);
	}
	public boolean canAddStudent() {
		if (capacity >= students.size()) {
			return true;
		}
		return false;
	}
}
 