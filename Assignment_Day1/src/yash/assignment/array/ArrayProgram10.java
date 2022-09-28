package yash.assignment.array;

public class ArrayProgram10 {
	public void sortArray(int arr[])
	{
		int temp=0;
		int brr[]=new int[arr.length];
		for(int i=0;i<=9;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]%10==i)
				{
					brr[temp]=arr[j];
					temp++;
				}
			}
		}
		System.out.print("\nUnite place Array:");
		for(int i:brr)
		{
			System.out.print(" "+i);
		}
		
	}
	public static void main(String[] args) {
		ArrayProgram10 program=new ArrayProgram10();
		int arr[]={1,6,28,21,11,5,32,2,67,3,99,8};	
		System.out.print("Orignal Array:");
		for(int i:arr)
		{
			System.out.print(" "+i);
		}
		program.sortArray(arr);
		
	}
}
