package week4;
import java.io.*;
import java.util.HashMap;

public class ObjectStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("students.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			HashMap<String, Integer> hm = new HashMap<String, Integer>();
			hm.put("Gauhar", 69);
			hm.put("Symbat", 77);
			oos.writeObject(hm);
			oos.flush();
			oos.close();
			FileInputStream fis = new FileInputStream("students.out");
			ObjectInputStream ois = new ObjectInputStream(fis);
			HashMap<String, Integer> hm2 = (HashMap<String, Integer>)ois.readObject();
			System.out.println((Integer)hm2.get("Gauhar"));
		}
		catch (FileNotFoundException fe){
			System.out.println("File not found: + args[0]");
		}
		catch(IOException ioe) {
			System.out.println("Can't read from file: + args[0]");
		}
		catch (ClassNotFoundException ce) {
			System.out.println("Class not found: + args[0]");
		}
	}
	
}
