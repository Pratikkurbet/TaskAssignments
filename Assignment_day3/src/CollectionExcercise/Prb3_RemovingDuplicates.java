package CollectionExcercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Prb3_RemovingDuplicates {
public static void main(String[] args) {
		

		// creating list
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		// adding elements to it(32 and 99 repeated)
		list.add(-129);
		list.add(227);
		list.add(32);
		list.add(99);
		list.add(99);
		list.add(-88);
		list.add(32);
		
		System.out.println("List : "+list);
		HashSet<Integer> set=new HashSet<Integer>();
		set.addAll(list);
		System.out.println("Set : "+set);
		
		// getting size of collection
		int collectionSize=set.size();
				
		// creating array
		int[] array=new int[collectionSize];
		int index=0;
				
		// adding elements to an array
		for(int element : set) 
		{
			array[index]=element;
			index++;
		}
		
		Arrays.sort(array);
		System.out.println("In Ascending order after removing duplicates : "+ Arrays.toString(array));
		
	}
}
