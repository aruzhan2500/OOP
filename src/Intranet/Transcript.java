package Intranet;

public class Transcript {
	private Mark mark;
	private double gpa;
	
	public Transcript(Mark mark) {
		this.mark = mark;
		gpa = 0;
	}
	
	public void setGpa() {
		if (mark.getPoints() < 50) {
			gpa = 0;
		}
		mark.setPoints(mark.getPoints() - 50);
		mark.setPoints(mark.getPoints() / 50);
		gpa = Math.min(4.0, 1 + mark.getPoints() * 0.34);
	}
	
	public double getGpa() {
		return gpa;
	}
	public Mark getMark() {
		return mark;
	}
	
	public void setMark(double points) {
		mark.setPoints(points);
	}
	public String toString() {
		return mark.getMark() + " " + gpa;
	}
}
