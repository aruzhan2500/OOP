package lab4;
import java.io.*;

public class Problem1a {
	
	public static void main(String[] args) throws IOException {
		
		FileWriter scores = new FileWriter("C:\\Users\\acer\\eclipse-workspace\\oop1\\bin\\lab4\\scores.txt");
		BufferedWriter bw = new BufferedWriter(scores);
		String text = "Ivanov Ivan 100\nAliyev Ali 22\nMenshikov Sergey 65";
		bw.write(text);
		bw.flush();
		bw.close();
	//	scores.flush();
		scores.close();
		
		FileReader fr = new FileReader("C:\\Users\\acer\\eclipse-workspace\\oop1\\bin\\lab4\\scores.txt");
		BufferedReader br = new BufferedReader(fr);
		
		FileWriter grades = new FileWriter("C:\\Users\\acer\\eclipse-workspace\\oop1\\bin\\lab4\\grades.txt");
		BufferedWriter bw2 = new BufferedWriter(grades);
		
		int best = 0;
		while(br.readLine() != null) {
			String[] s = br.readLine().split(" ");
			int score = Integer.parseInt(s[2]);
			if(best < score) best = score;
		
			if(score >= best - 10) bw2.write(s[0] + " " + s[1] + "-" + "A\n");
			else if(score >= best - 20) bw2.write(s[0] + " " + s[1] + "-" + "B\n");
			else if(score >= best - 30) bw2.write(s[0] + " " + s[1] + "-" + "C\n");
			else if(score >= best - 40) bw2.write(s[0] + " " + s[1] + "-" + "D\n");
			else bw2.write(s[0] + " " + s[1] + "-" + "F\n");
		}
		fr.close();
		br.close();
		grades.flush();
		grades.close();
		bw2.flush();
		bw2.close();
	}
}
