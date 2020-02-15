package Intranet;

public class Admin extends Employee{

	public Admin(String firstName, String lastName, String kind, int salary) {
		super(firstName, lastName, "Manager", salary);
	}
	
	public void addUser(Object o) {
		User u = (User)o;
		Database.users.add(u);
		if (u.kind.equals("Student")) {
			Student s = (Student)o;
			Database.students.add(s);
		}
		else if (u.kind.equals("Teacher")) {
			Teacher s = (Teacher)o;
			Database.teachers.add(s);
		}
		else if (u.kind.equals("Manager")) {
			Manager s = (Manager)o;
			Database.managers.add(s);
		}
		else if (u.kind.equals("Admin")) {
			Admin s = (Admin)o;
			Database.admins.add(s);
		}
		else if (u.kind.equals("TechGuy")) {
			TechGuy s = (TechGuy)o;
			Database.techGuys.add(s);
		}
	}
	
	public void deleteUser(Object o) {
		User u = (User)o;
		Database.users.remove(u);
		if (u.kind.equals("Student")) {
			Student s = (Student)o;
			Database.students.remove(s);
		}
		else if (u.kind.equals("Teacher")) {
			Teacher s = (Teacher)o;
			Database.teachers.remove(s);
		}
		else if (u.kind.equals("Manager")) {
			Manager s = (Manager)o;
			Database.managers.remove(s);
		}
		else if (u.kind.equals("Admin")) {
			Admin s = (Admin)o;
			Database.admins.remove(s);
		}
		else if (u.kind.equals("TechGuy")) {
			TechGuy s = (TechGuy)o;
			Database.techGuys.remove(s);
		}

	}

	@Override
	public int compareTo(Object o) {
		Admin m = (Admin)o;
		if (m.getSalary() > this.getSalary()) return -1;
		if (m.getSalary() < this.getSalary()) return 1;
		return 0;
	}

}
