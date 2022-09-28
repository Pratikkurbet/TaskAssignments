package ObjectAndClassAssignment;

import java.util.Scanner;

public class Patient {
	String patientName;
	double patientHeight;
	double patientWeight;
	
	public Patient(String patientName, double patientHeight, double patientWeight) {
		super();
		this.patientName = patientName;
		this.patientHeight = patientHeight;
		this.patientWeight = patientWeight;
		System.out.println(this.computeBMI(patientHeight, patientWeight));
	}
	double computeBMI(double patientHeight,double patientWeight)
	{
		return (patientWeight/(patientHeight*patientHeight));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter Patient's Name:");
		String name=sc.next();
		
		System.out.println("Please enter patients height:");
		double height=sc.nextDouble();
		
		System.out.println("Please enter patients weight:");
		double weight=sc.nextDouble();
		
		System.out.println(name+" "+"BMI is:");
		new Patient(name, height, weight);
	}
}
