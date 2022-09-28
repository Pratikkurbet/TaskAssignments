package yash.assignment.string;

import java.util.Scanner;

public class StringProgram4 {
	public void printRepeatedChar(String first)
	{
		char arr[]=first.toCharArray();
		int count=0;
		for(int i=0;i<arr.length-1;i++)
		{
			char ch=arr[i];
			count=1;
			if(ch!=' ')
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(ch==arr[j])
					{
						count++;
						arr[j]=' ';
					}
				}
				System.out.println(ch+" :"+count);
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String:");
		String first=scanner.nextLine();
		StringProgram4 program4=new StringProgram4();
		program4.printRepeatedChar(first);
		
	}
}
