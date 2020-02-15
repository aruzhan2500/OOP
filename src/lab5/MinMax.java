package lab5;

public class MinMax {
	static class Pair{
		int max;
		int min;
		Pair(){
			this.max = -2147483648;
			this.min = 2147483647;
		}
		Pair(int min, int max){
			this.max = max;
			this.min = min;
		}
	}
	
	static Pair setMinMax(int array[]) {
		Pair p = new Pair();
		for (int i=0; i<array.length; i++) {
			if (array[i] > p.max) {
				p.max = array[i];
			}
			if (array[i] < p.min) {
				p.min = array[i];
			}
		}
		return new Pair(p.min, p.max);
	}
}
