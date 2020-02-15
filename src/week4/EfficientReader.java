package week4;
import java.io.*;

public class EfficientReader {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("a.txt"));
			
			String line = br.readLine();
			while(line != null) {
				System.out.println("Read a line:");
				System.out.println(line);
				line = br.readLine();
			}
			
			br.close();
		}
		catch (FileNotFoundException fe){
			System.out.println("File not found: + args[0]");
		}
		catch(IOException ioe) {
			System.out.println("Can't read from file: + args[0]");
		}
	}

}
