package JavaException8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User 
{
		public static void isAllPresent(String str)
		{
			String regex = "^(?=.*[a-z])(?=."
						+ "*[A-Z])(?=.*\\d)"
						+ "(?=.*[-+_!@#$%^&*., ?]).+$";
			Pattern p = Pattern.compile(regex);

			if (str == null) {
				System.out.println("No");
				try {
					throw new PasswordFormatException("null inserted");
				} catch (PasswordFormatException e) {
					System.out.println(e.getMessage());
				}
				return;
			}

			Matcher m = p.matcher(str);
			if (m.matches())
				System.out.println("Yes");
			else
				try {
					throw new PasswordFormatException("incorrect format");
				} catch (PasswordFormatException e) {
					System.out.println(e.getMessage());
				}
				System.out.println("No");
		}

		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in); 
			String str = sc.next();
			isAllPresent(str);
		}
	
}
