package yash.assignment.array;

public class ArrayProgram2 
{
	public void printRepeatedNumber(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length-1;i++)
		{
			int num=arr[i];
			count=1;
			if(num>0)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(num==arr[j])
					{
						count++;
						arr[j]=-1;
					}
				}
				System.out.println(num+" :"+count);
			}
			
		}
	}
	public static void main(String[] args) {
		ArrayProgram2 program=new ArrayProgram2();
		int arr[]={1,2,3,21,32,1,32,21,43,33,3};
		program.printRepeatedNumber(arr);
		
	}
}
