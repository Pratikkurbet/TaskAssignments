package CollectionExcercise;

import java.util.Arrays;
import java.util.Vector;

public class Prb5_SortTheVector {
	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<Integer>();
		vector.add(12);
		vector.add(2);
		vector.add(312);
		vector.add(-12);
		vector.add(53);
		vector.add(29);

		// getting size of collection
		int collectionSize = vector.size();

		// creating array
		int[] array = new int[collectionSize];
		int index = 0;

		// adding elements to an array
		for (int element : vector) {
			array[index] = element;
			index++;
		}

		Arrays.sort(array);
		// actual collection
		System.out.println("Given Collection : " + Arrays.toString(array));

	}
}
