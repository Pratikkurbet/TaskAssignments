package CollectionExcercise;

import java.util.Arrays;
import java.util.HashMap;

public class Prb_6SortingInMap {
	public static void main(String[] args) {
		HashMap<String, Long> map=new HashMap<String, Long>();
		map.put("Pune",550000l);
		map.put("Bombay",250000l);
		map.put("Delhi",350000l);
		map.put("Banglore",460000l);
		map.put("Baroda",150000l);
		map.put("Kolkata",50000l);
		
		
		// getting size of collection
		int collectionSize=map.size();
				
		// creating array
		String[] array=new String[collectionSize];
		int index=0;
				
		// adding elements to an array
		for(String element : map.keySet()) 
		{
			array[index]=element;
			index++;
		}
		
		Arrays.sort(array);
		
		index=0;
		for(String city : array) 
		{
			long population= map.get(city);
			System.out.println(city+" : "+population);
			index++;
		}
	}
}
