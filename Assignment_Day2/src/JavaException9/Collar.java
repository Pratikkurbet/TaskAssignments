package JavaException9;

import java.util.Scanner;

public class Collar
{
	double collarSize;
	double stdDeviation=2;
	
	void inputCollarSize()
	{
		Scanner sc=new Scanner(System.in);
		double[] ipCollarSize=new double[10];
		for (int i = 0; i < ipCollarSize.length; i++) {
			ipCollarSize[i]=sc.nextDouble();
		}
		
	}
}
