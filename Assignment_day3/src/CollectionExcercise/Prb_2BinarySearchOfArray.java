package CollectionExcercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Prb_2BinarySearchOfArray
{
	// Bubble Sort Algorithm
		public static void sortingAlgo(int[] array) 
		{
			for(int i=0;i<array.length;i++)			
			{
				for(int j=0;j<array.length-i-1;j++)  
				{
					if(array[j]>array[j+1]) 		//logic to arrange element by ascending order
					{
						int temp=array[j];
						array[j]=array[j+1];
						array[j+1]=temp;
					}
				}
			}
			System.out.println("Sorted Array(ascending) - "+Arrays.toString(array));
		}
		
		
		// if present returns index and if not -1
		public static int binarySearchAlgo(int array[],int target) 
		{																		
			int start=0;									// Binary search Algo
			int end=array.length-1 ;	
			while(start<=end) 							
			{
				int mid=start+(end-start)/2;
				if(target==array[mid])
						return mid;

				else if(target<array[mid]) 
						end=mid-1;
				
				else if(target>array[mid]) 
						start=mid+1;
			}
			return -1;
		}
		
		public static void main(String[] args) {
			
			// creating list
			ArrayList<Integer> list=new ArrayList<Integer>();
					
			// adding elements to it
			list.add(-129);
			list.add(227);
			list.add(32);
			list.add(99);
			list.add(0);
			list.add(-88);
			list.add(10);
					
			// getting size of collection
			int collectionSize=list.size();
					
			// creating array
			int[] array=new int[collectionSize];
					int index=0;
					
			// adding elements to an array
			for(int element : list) 
			{
				array[index]=element;
				index++;
			}
					
			// actual collection
			System.out.println("Given Collection : "+Arrays.toString(array));
		
			// Way---1	
			// calling Sorting algo
			 sortingAlgo(array);
			
			 // Entering target and calling binary search algo
			 Scanner sc=new Scanner(System.in);
			 System.out.print("Enter the number to search : ");
			 int target= sc.nextInt();
			int result =  binarySearchAlgo(array, target);
			 System.out.println(result);
			 
//			// Way--2--> Using in-built method(sorting is mandatory.)
//			Arrays.sort(array); 
//			// In binary-search returns index at which the element is present and 
//			// returns negative value if element is not present.
//			System.out.println(Arrays.binarySearch(array, 99));
//			System.out.println(Arrays.binarySearch(array, 200));
//					
			

		}
}
