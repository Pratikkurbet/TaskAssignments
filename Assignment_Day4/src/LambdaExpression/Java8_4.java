package LambdaExpression;

import java.util.Scanner;
import java.util.function.BiFunction;

public class Java8_4 {
	public static int index = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String:");
		String first = scanner.nextLine();
		System.out.println("Enter Second String:");
		String second = scanner.nextLine();
		System.out.println("Enter Index:");
		index = scanner.nextInt();
		if (index > first.length()) {
			System.out.println("Enter valied Index...");
		} else {
			BiFunction<String, String, String> biFunction = (str1, str2) -> {
				String ansString = "";
				for (int i = 0; i < first.length(); i++) {
					if (i != index) {
						ansString = ansString + first.charAt(i);
					} else {
						ansString = ansString + second;
						ansString = ansString + first.charAt(i);
					}
				}
				return ansString;
			};

			System.out.println(biFunction.apply(first, second));

		}

	}
}
