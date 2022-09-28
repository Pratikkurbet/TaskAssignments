package LambdaExpression;

import java.util.function.BiPredicate;

public class Java8_2 {
	public static void main(String[] args) {
		String input = "Taj is situated in AST Agra.";
		String Pattern = "AST";
		BiPredicate<String, String> p = (str, pattern) -> {
			if (str.contains(Pattern)) {
				return true;
			}
			else 
				return false;
		};
		System.out.println(p.test(input, Pattern));

	}
}
