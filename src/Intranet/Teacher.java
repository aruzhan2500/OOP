package Intranet;

import java.util.Vector;

public class Teacher extends Employee{
	private Vector<Discipline> disciplines;
	
	public Teacher(String firstName, String lastName, String kind, int salary) {
		super(firstName,lastName,"Teacher",salary);
		disciplines = new Vector<Discipline>();
	}
		 
	public Vector<Discipline> getDisciplines() {
		for (Discipline d : Database.disciplines) {
			if (d.getTeacher() == this) {
				disciplines.add(d);
			}
		}
		return disciplines;
	}
	public void addFile(File file) {
		if (disciplines.contains(file.getDiscipline())) {
			file.getDiscipline().addFile(file);
		}
	}
	public void putMarks(Discipline d, double points) {
		for (Student s : d.getStudents()) {
			s.getTranscript().getMark().setPoints(points);
		}
	}
	public int hashCode() {
		return super.hashCode();
	}

	public boolean equals(Object o) {
		if(o==this) return true;
		if(!(o instanceof Teacher)) return false;
		Teacher t = (Teacher) o;
		return super.equals(o);
	}
	public String toString() {
		return super.toString();
	}
	@Override
	public int compareTo(Object o) {
		Teacher t = (Teacher)o;
		if (t.getSalary() > this.getSalary()) return -1;
		if (t.getSalary() < this.getSalary()) return 1;
		return 0;
	}
}
