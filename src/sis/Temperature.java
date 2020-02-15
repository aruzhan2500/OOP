package sis;

public class Temperature {
	private double value;
	private char scale;
	
	public Temperature() {
		value = 0;
		scale = 'C';
	}
	public Temperature(double value) {
		this.value = value;
		scale = 'C';
	}
	public Temperature (char scale) {
		this.scale = scale;
		value = 0;
	}
	public Temperature(double value, char scale) {
		this(value);
		this.scale = scale;
	}
	
	public double toCelsius() {
		value = 5 * (value - 32)/9;
		return value;
	}
	public double toFahrenheit() {
		value = 9 * (value / 5) + 32;
		return value;
	}
	
	public void setValue(double newValue) {
		value = newValue;
	}
	public void setScale(char newScale) {
		scale = newScale;
	}
	public void setTemperature(double newValue, char newScale) {
		value = newValue;
		scale = newScale;
	}
	
	public char getScale() {
		return scale;
	}
}
