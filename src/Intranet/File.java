package Intranet;

import java.io.Serializable;
import java.util.Objects;

public class File{
	private String name;
	private Discipline discipline;
	public File(String name, Discipline discipline) {
		this.name = name;
		this.discipline = discipline;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Discipline getDiscipline() {
		return discipline;
	}
	public int hashCode() {
		return Objects.hash(name, discipline);
	}
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof File)) return false;
		File f = (File)o;
		return f.name.equals(name) && f.discipline.equals(discipline);
	}
	
	public String toString() {
		return this.name + this.discipline;
	}
}
 