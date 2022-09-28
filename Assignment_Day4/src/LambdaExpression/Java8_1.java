package LambdaExpression;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Java8_1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		String temp=Integer.toString(num);
		if(temp.equals(reverse(temp)))
		{
			System.out.println("It is Palindrome.");
		}
		else
			System.out.println("not palindrome");
		
        //System.out.println(reverse(temp));
    }
    public static String reverse(String string) {
        return Stream.of(string)
            .map(word->new StringBuilder(word).reverse())
            .collect(Collectors.joining(" "));
    }
	
}
