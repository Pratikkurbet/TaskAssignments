package JavaException10;

import java.util.Scanner;

public class Child extends Parent {
	@Override
	int largest() {
		int n;
		double res = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter how many numbers to cal  avg");

		n = sc.nextInt();

		int a[] = new int[n];

		System.out.println("enter   " + n + "  numbers");

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		for (int i = 0; i < n; i++)
			res = res + a[i];

		int avg = (int) (res / n);
		System.out.println("average=" + avg);

		int max = a[0];
		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];
		System.out.println("Large element:" + max);
		return avg;
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.largest();
	}
}
