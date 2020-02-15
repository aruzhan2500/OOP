package Intranet;

public enum Faculty {
	FIT,
	MCM,
	BS,
	ISE,
	FENGI;
	
	private static Faculty[] list = Faculty.values();
	
	public static Faculty getFaculty(int i) {
		return list[i - 1];
	}
}
