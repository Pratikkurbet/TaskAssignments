package yash.assignment.array;

public class ArrayProgram1 {
//WAP to find third maximum number from list of numbers.

	public int getThirdLargest(int arr[])
	{  
		int temp;  
		for(int i=0;i<arr.length;i++)   
		{
			for(int j=i+1; j<arr.length;j++)
			{  
		         if (arr[i]>arr[j])   
		         {  
		              temp=arr[i];  
		              arr[i]=arr[j];  
		              arr[j]=temp;  
		         }  
		     }  
		 }  
		       return arr[arr.length-3];  
		}  
		public static void main(String args[])
		{  
			int brr[]={44,66,99,77,33,22,55};
			ArrayProgram1 arrayProgram1=new ArrayProgram1();
			System.out.println("Third Largest: "+arrayProgram1.getThirdLargest(brr));  
		}

}