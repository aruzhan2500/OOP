package week2;

public class Data {
	private double avg;
	private double max;
	private int count;
	
	public Data() {
	}
	
	public void add(double newNumber) {
		count = 0;
		count ++;
		avg += newNumber;
	}
	
	public double average() {
		double average;
		if(avg == 0) average = 0;
		else average = avg/count;
		return average;
	}
	
	public void maximum(double d) {
		if(d > max) max = d;
	}
	
	public double getMax() {
		return max;
	}
}
