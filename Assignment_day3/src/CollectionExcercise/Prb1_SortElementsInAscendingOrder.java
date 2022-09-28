package CollectionExcercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Prb1_SortElementsInAscendingOrder {
	// Way 2- Without using In-built method---> Bubble Sort Algorithm
	public static void sortingAlgo(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) // logic to arrange element by ascending order
				{
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		System.out.println("Sorted Array(ascending) - " + Arrays.toString(array));
	}

	public static void main(String[] args) {

		// creating list
		ArrayList<Integer> list = new ArrayList<Integer>();

		// adding elements to it
		list.add(-129);
		list.add(227);
		list.add(32);
		list.add(99);
		list.add(0);
		list.add(-88);
		list.add(10);

		// getting size of collection
		int collectionSize = list.size();

		// creating array
		int[] array = new int[collectionSize];
		int index = 0;

		// adding elements to an array
		for (int element : list) {
			array[index] = element;
			index++;
		}

		// actual collection

		// calling Sorting Algo
		sortingAlgo(array);

		// -----------------------------------------------------------------------

		// Way 1----> sorting in an ascending order using In-built Method
		// Arrays.sort(array);

		// sorted collection
		// System.out.println("In Ascending Order : "+Arrays.toString(array));
		// -----------------------------------------------------------------------

	}
}
