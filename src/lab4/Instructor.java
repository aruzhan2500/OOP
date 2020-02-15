package lab4;

public class Instructor {
	String firstName;
	String lastName;
	String department;
	String email;
	
	public Instructor() {}
	
	public Instructor(String firstName, String lastName, String department, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.email = email;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getDepartment() {
		return this.department;
	}
	public String getEmail() {
		return this.email;
	}
	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}
	public void setLastName(String newLastName) {
		this.lastName = newLastName;
	}
	public void setDepartment(String newDepartment) {
		this.department = newDepartment;
	}
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}
	public String toString() {
		return this.firstName + " " + this.lastName + " " + this.department + " " + this.email;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Instructor)) return false;
		Instructor i = (Instructor)o;
		return i.firstName.equals(firstName) && i.lastName.equals(lastName) 
				&& i.department.equals(department) && i.email.equals(email);
	}
	@Override
	public int hashCode() {
		int code = 1;
		code = this.firstName.hashCode() * this.lastName.hashCode() * this.department.hashCode() * this.email.hashCode();
		return code;
	}
}
