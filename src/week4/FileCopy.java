package week4;
import java.io.*;

public class FileCopy {

	public static void main(String[] args) {
		RandomAccessFile f1 = null;
		RandomAccessFile f2 = null;
		long filesize = -1;
		byte[] buffer1;
		try {
			f1 = new RandomAccessFile("a.txt", "r");
			f2 = new RandomAccessFile("b.txt", "rw");
		}
		catch(FileNotFoundException fe) {
			System.out.println("File not found");
			System.exit(100);
		}
		try {
			filesize = f1.length();
			int bufsize = (int)filesize/2;
			buffer1 = new byte[bufsize];
			f1.readFully(buffer1, 0, bufsize);
			f2.write(buffer1, 0, bufsize);
		}
		catch(IOException ioe) {
			System.out.println("IO erroe occured");
			System.exit(200);
		}
	}

}
