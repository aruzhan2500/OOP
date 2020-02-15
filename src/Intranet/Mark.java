package Intranet;

import java.util.Date;
import java.util.Objects;

public class Mark {
	private double points;
	private Date date;

	public Mark() {
		points = 0;
		date = new Date();
	}
	
	public void setDate(Date date){
		this.date = date;
	 }
	 
	public Date getDate(){
		return date;
	 } 
	
	public void setPoints(double points) {
		if (this.points + points < 100) {
			this.points += points;
		}
	}
	public double getPoints() {
		return points;
	}
	public String getMark() {
		if (points > 94) return "A";
		else if (points > 89) return "A-";
		else if (points > 84) return "B+";
		else if (points > 79) return "B";
		else if (points > 74) return "B-";
		else if (points > 69) return "C+";
		else if (points > 64) return "C";
		else if (points > 59) return "C-";
		else if (points > 54) return "D+";
		else if (points > 49) return "D";
		else if (points >= 0) return "F";
		else return "Error";
	}
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Mark)) return false;
		Mark m = (Mark)o;
		return m.points == points && m.date.equals(date);
	}
	public int hashCode() {
		return Objects.hash(points, date);
	}
	public String toString() {
		return "Mark: " + getPoints() + " ";
 	}
}
