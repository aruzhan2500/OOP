package lab4;
import java.io.*;

public class Problem1b {
	
	public static void main(String[] args) throws IOException {
		
		FileReader scores = new FileReader("C:\\Users\\acer\\eclipse-workspace\\oop1\\bin\\lab4\\scores.txt");
		BufferedReader br = new BufferedReader(scores);
		
		FileWriter fw = new FileWriter("C:\\Users\\acer\\eclipse-workspace\\oop1\\bin\\lab4\\grades.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		int max = 0;
		int min = 100;
		double avg = 0;
		int cnt = 0;
		
		while(br.readLine() != null) {
			String[] s = br.readLine().split(" ");
			int score = Integer.parseInt(s[2]);
			if(max < score) max = score;
			if(min > score) min = score;
			cnt++;
			avg += score;
		}
		avg = avg / cnt;
		bw.write("Average - " + avg + "\nMaximum - " + max + "\nMinimum - " + min);
		br.close();
		scores.close();
		bw.flush();
		bw.close();
		fw.flush();
		fw.close();
	}

}
