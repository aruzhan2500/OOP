package week2;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
	}
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void add(Time time) {
		this.hour = time.hour;
		this.minute = time.minute;
		this.second = time.second;
	}
	
	public String toUniversal() {
		String hour = "0";
		String minute = "0";
		String second = "0";
		if (this.hour < 10) {
			hour += this.hour;
		}
		if (this.minute < 10) {
			minute += this.minute;
		}
		if (this.second < 10) {
			second += this.second;
		}
		if (this.hour >= 24 || this.minute >= 60 || this.second >= 60) {
			return "Invalid input";
		}
		else {
			hour = String.valueOf(this.hour);
			minute = String.valueOf(this.minute);
			second = String.valueOf(this.second);
		}
		return hour+":"+minute+":"+second;
	}
	
	public String toStandard() {
		String hour = "0";
		String minute = "0";
		String second = "0";
		String symbol = " AM";
		if (this.hour < 10) {
			hour += this.hour;
		}
		if (this.minute < 10) {
			minute += this.minute;
		}
		if (this.second < 10) {
			second += this.second;
		}
		if (this.hour >= 24 || this.minute >= 60 || this.second >= 60) {
			return "Invalid input";
		}
		if (this.hour > 12) {
			this.hour = this.hour - 12;
			hour = String.valueOf(this.hour);
			symbol = " PM";
		}
		else {
			hour = String.valueOf(this.hour);
			minute = String.valueOf(this.minute);
			second = String.valueOf(this.second);
		}
		return hour+":"+minute+":"+second+symbol;
	}
}
