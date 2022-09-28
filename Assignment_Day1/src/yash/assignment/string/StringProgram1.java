package yash.assignment.string;

import java.util.Scanner;

public class StringProgram1 {

	public String concatString(String first, String second, int index) {
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
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First String:");
		String first = scanner.nextLine();
		System.out.println("Enter Second String:");
		String second = scanner.nextLine();
		System.out.println("Enter Index:");
		int index = scanner.nextInt();
		if (index > first.length()) {
			System.out.println("Enter valied Index...");
		} else {
			StringProgram1 program1 = new StringProgram1();
			String ans = program1.concatString(first, second, index);
			System.out.println(ans);
		}

	}
}
