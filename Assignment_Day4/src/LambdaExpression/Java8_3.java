package LambdaExpression;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Java8_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to execute that program" + "1.To check Even" + "2.To check Odd"
				+ "3.To check Armstrong number" + "4.To check Palindrome.");
		int cond = sc.nextInt();
		System.out.println("Enter number on which program will get execute:");
		int num = sc.nextInt();
		switch (cond) {
		case 1:
			Predicate<Integer> p = (a) -> a % 2 == 0 ? true : false;
			p.test(num);
			break;
		case 2:
			Predicate<Integer> p1 = (a) -> a % 2 != 0 ? true : false;
			p1.test(num);
			break;
		case 3:
			Predicate<Integer> p2 = (a) -> {

				int originalNumber, remainder, result = 0;

				originalNumber = a;

				while (originalNumber != 0) {
					remainder = originalNumber % 10;
					result += Math.pow(remainder, 3);
					originalNumber /= 10;
				}
				if (result == a)
					System.out.println(a + " is an Armstrong number.");
				return true;

			};
			p2.test(num);
			break;
		case 4:
			Predicate<Integer> p3 = (number) -> {
				return number == IntStream.iterate(number, n -> n != 0, i -> i / 10)
	                    .map(n -> n % 10)
	                    .reduce(0, (a, b) -> a * 10 + b);
			};
			p3.test(num);
			break;
		default:
			break;
		}
	}
}
