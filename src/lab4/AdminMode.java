package lab4;
import java.io.*;

public class AdminMode {
	public void start() {
		InputStreamReader irs = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(irs);
		System.out.println("Username:");
		String username = "";
		String password = "";
		try {
			username = br.readLine();
			System.out.print("Password: ");
			password = br.readLine();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
