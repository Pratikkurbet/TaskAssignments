package JavaException1;

import java.util.Scanner;

public class Student {
	private int rollno;
	private String sname;
	private String saddress;
	private StudentResult srobj;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public StudentResult getSrobj() {
		return srobj;
	}
	public void setSrobj(StudentResult srobj) {
		this.srobj = srobj;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student student=new Student();
		System.out.println("Enter student rollno:");
		student.rollno=sc.nextInt();
		
		System.out.println("Enter student name:");
		student.sname=sc.next();
		
		System.out.println("Enter student address:");
		student.saddress=sc.next();
		
		System.out.println("Enter no. of subject in which student failed:");
		student.srobj.noOfSubFail=sc.nextInt();
		
		System.out.println("Enter average marks:");
		student.srobj.marks=sc.nextInt();
		
		System.out.println("Enter total percentage:");
		student.srobj.totalScore=sc.nextInt();
		
		if(student.srobj.noOfSubFail>1 || student.srobj.marks<0 || student.srobj.totalScore<40)
		{
			throw new ResultException("Oops the student failed in many subjects or"
					+ "you just non positive marks"
					+ "or your total percentage is below 40%");
		}
		else
		{
			System.out.println("Congratulations!!");
		}
		
	}
}
