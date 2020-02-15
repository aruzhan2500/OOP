package sis2;

public class Sort {
	static <E> void swap(E[] array, int l, int r) {
		E temp = array[l];
		array[l] = array[r];
		array[r] = temp;
	}

	static <E extends Comparable<E>> void bubbleSort(E[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j].compareTo(array[j + 1]) > 0)
					swap(array, j, j + 1);
			}
		}
	}
}
