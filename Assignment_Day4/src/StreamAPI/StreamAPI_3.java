package StreamAPI;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
	private int rollno;
	private LocalDateTime date_of_addmission, dob;
	private String maths, physics, chemistry, English, hindi; // marks in subjects
	private String classname;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, LocalDateTime date_of_addmission, LocalDateTime dob, String maths, String physics,
			String chemistry, String english, String hindi, String classname) {
		super();
		this.rollno = rollno;
		this.date_of_addmission = date_of_addmission;
		this.dob = dob;
		this.maths = maths;
		this.physics = physics;
		this.chemistry = chemistry;
		English = english;
		this.hindi = hindi;
		this.classname = classname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public LocalDateTime getDate_of_addmission() {
		return date_of_addmission;
	}

	public void setDate_of_addmission(LocalDateTime date_of_addmission) {
		this.date_of_addmission = date_of_addmission;
	}

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	public String getMaths() {
		return maths;
	}

	public void setMaths(String maths) {
		this.maths = maths;
	}

	public String getPhysics() {
		return physics;
	}

	public void setPhysics(String physics) {
		this.physics = physics;
	}

	public String getChemistry() {
		return chemistry;
	}

	public void setChemistry(String chemistry) {
		this.chemistry = chemistry;
	}

	public String getEnglish() {
		return English;
	}

	public void setEnglish(String english) {
		English = english;
	}

	public String getHindi() {
		return hindi;
	}

	public void setHindi(String hindi) {
		this.hindi = hindi;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", date_of_addmission=" + date_of_addmission + ", dob=" + dob + ", maths="
				+ maths + ", physics=" + physics + ", chemistry=" + chemistry + ", English=" + English + ", hindi="
				+ hindi + ", classname=" + classname + "]";
	}
}

public class StreamAPI_3 {
	public static void main(String[] args) {
		List<Student>students=new ArrayList<>();
		students.add(new Student(1, LocalDateTime.of(2018, 2, 13, 15, 56), LocalDateTime.of(2001, 2, 13, 15, 56), 
					"90", "80", "70", "60", "50", "11th"));
		students.add(new Student(2, LocalDateTime.of(2018, 2, 13, 15, 56), LocalDateTime.of(2000, 2, 13, 15, 56), 
				"90", "90", "90", "90", "90", "12th"));
		students.add(new Student(3, LocalDateTime.of(2018, 2, 13, 15, 56), LocalDateTime.of(2002, 2, 13, 15, 56), 
				"30", "31", "31", "32", "33", "10th"));
		students.add(new Student(4, LocalDateTime.of(2018, 2, 13, 15, 56), LocalDateTime.of(2003, 2, 13, 15, 56), 
				"75", "75", "75", "60", "50", "09th"));
		System.out.println(students);
		System.out.println("1. WAP to print list of all students who’s total marks are less than 40%.\r\n"
				+ "2. WAP to print list of all those students who scored more than 75% in any \r\n"
				+ "of 3 subjects.\r\n"
				+ "3. WAP to print list of all those students who scored more than 75% in all \r\n" + "subjects.\r\n"
				+ "4. WAP to find those students who are fail in at least one subject. \r\n"
				+ "5. Find how many students are promoted to another class.\r\n"
				+ "6. Find how many students need to give exam in two subjects to promoted to another class.");
//		Scanner sc = new Scanner(System.in);
//		int i = sc.nextInt();
//		switch (i) {
//		case 1:
//
//			break;
//		case 2:
//
//			break;
//		case 3:
//
//			break;
//		case 4:
//
//			break;
//		case 5:
//
//			break;
//		case 6:
//
//			break;
//		default:
//			break;
//		}
	}
}
