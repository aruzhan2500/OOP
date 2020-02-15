package Intranet;

import java.util.Vector;

public class Manager extends Employee{
	 private ManagerType manager;
	 private Vector<Student> students;
	 private Vector<News> news;
	 
	 public Manager(String firstName, String lastName, String kind, int salary, ManagerType manager) {
		 super(firstName, lastName, "Manager", salary);
		 this.manager = manager;
		 students = new Vector<Student>();
	 }
	 public void addDisciplines(Discipline discipline, Faculty faculty) {
		 for (Student s : students) {
			 if (s.getFaculty().equals(faculty)) {
				 s.addDiscipline(discipline);
			 }
		 }
	 }
	 public void setManagerType(ManagerType manager) {
	  this.manager = manager;
	  
	 }
	 public ManagerType getManagerType() {
	  return manager;
	 }
	 public Vector<News> showNews() {
		 return news;
	 }
	 public void addNews(News n) {
		 this.news.add(n);
	 }
	 public void removeNews(News n) {
		 this.news.remove(n);
	 }
	 public int hashCode() {
		 return super.hashCode();
	 }
	 
	 public boolean equals(Object o) {
	  if(o==this) return true;
	  if(!(o instanceof Manager)) return false;
	  Manager m = (Manager)o;
	  return super.equals(o) && m.manager.equals(manager);
	 }
	 
	 public String toString() {
	  return super.toString() + "Manager type is " + manager;
	 }
	 @Override
	 public int compareTo(Object o) {
		 Manager m = (Manager)o;
		 if (m.getSalary() > this.getSalary()) return -1;
		 if (m.getSalary() < this.getSalary()) return 1;
		 return 0;
	 }
}
