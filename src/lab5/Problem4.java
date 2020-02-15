package lab5;

public class Problem4 {

	public static void main(String[] args) {
		int array[] = {8, 3, -14, 9, -28, 70};
		MinMax.Pair pair = MinMax.setMinMax(array);
		System.out.println(pair.max + " " + pair.min);
	}

}
