package sis2;

public class Chocolate implements Comparable{
	    // Fields
		private float weight;
		private String name;

		// Constructors
		public Chocolate() {
			weight = 1;
			name = "";
		}

		public Chocolate(String name, float weight) {
			this.name = name;
			this.weight = weight;
		}

		// OVerriden Methods
		@Override
		public int compareTo(Object o) {
			Chocolate c = (Chocolate) o;
			if (weight > c.weight) return 1;
			if (weight < c.weight) return -1;
			else return 0;
		}

		public String toString() {
			return "Chocolate " + name + " " + weight;
		}
}
