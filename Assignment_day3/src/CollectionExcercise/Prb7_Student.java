package CollectionExcercise;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/*WAP to store the student class objects in List. Student class structure :-
Student{ 
 int rollno;
 String sname, classname;
 String totalmarks; // marks out of 500, total five subjects each subject marks 100. 
 }
On the basis of the detail entered by the user. Now you have to perform the following 
operations. 
a) Print the name of students who secure first, second and third position. 
b) Print name of those students who’s marks are below 50%.
c) Print name of those students who’s marks are below 35% it means they are 
fail.
d) Print name of those students who’s marks are above average score. 
e) Print detail of all students on the basis of Name*/

class Student {
	int rollno;
	String sname;
	String classname;
	int totalmarks;

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

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public int getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", classname=" + classname + ", totalmarks="
				+ totalmarks + "]";
	}

	public Student(int rollno, String sname, String classname, int totalmarks) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.classname = classname;
		this.totalmarks = totalmarks;
	}
}

class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		int m1 = s1.getTotalmarks();
		int m2 = s2.getTotalmarks();

		if (m1 < m2)
			return 1;
		else if (m1 > m2)
			return -1;
		else
			return 0;
	}

}

public class Prb7_Student {
	public static void main(String[] args) {

		Student s1 = new Student(12, "pratik", "A", 492);
		Student s2 = new Student(21, "ajay", "A", 384);
		Student s3 = new Student(9, "atul", "c", 165);
		Student s4 = new Student(38, "arijit", "B", 244);
		Student s5 = new Student(41, "Raju", "D", 350);
		Student s6 = new Student(41, "Farhan", "D", 175);

//		ArrayList<Student> list= new ArrayList<Student>();
		TreeSet list = new TreeSet(new StudentComparator());
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);

		Object[] data = list.toArray();

//		a) Print the name of students who secure first, second and third position.
		Iterator itr = list.iterator();
		int i = 3;
		System.out.println("Top 3 : ");
		while (itr.hasNext() && i > 0) {
			Object key = (Object) itr.next();
			Student stu1 = (Student) key;
			System.out.println(stu1.getSname());
			i--;
		}
		System.out.println();

//		b) Print name of those students who’s marks are below 50%.
		System.out.println("Student Scored less than 50% : ");
		while (itr.hasNext()) {
			Object key = (Object) itr.next();
			Student stu1 = (Student) key;
			if (stu1.getTotalmarks() < 250 && stu1.getTotalmarks() >= 175)
				System.out.println(stu1.getSname());
		}
		System.out.println();

//		c) Print name of those students who’s marks are below 35% it means they are 
//		fail.
		Iterator itr1 = list.iterator();
		System.out.println("Failed Students : ");
		while (itr1.hasNext()) {
			Object key = (Object) itr1.next();
			Student stu1 = (Student) key;
			if (stu1.getTotalmarks() < 175)
				System.out.println(stu1.getSname());
		}
		System.out.println();

//		d) Print name of those students who’s marks are above average score. 
		Iterator itr2 = list.iterator();
		int count = 0;
		int allMarks = 0;
		float average;
		while (itr2.hasNext()) {
			Object key = (Object) itr2.next();
			Student stu1 = (Student) key;
			allMarks = allMarks + stu1.getTotalmarks();
			count++;
		}
		average = allMarks / count;
		Iterator itr3 = list.iterator();
		System.out.println("Students Scored above average : ");
		while (itr3.hasNext()) {
			Object key = (Object) itr3.next();
			Student stu1 = (Student) key;
			if (stu1.getTotalmarks() > average)
				System.out.println(stu1.getSname());
		}
		System.out.println();

//		e) Print detail of all students on the basis of Name
		Scanner sc = new Scanner(System.in);
		Iterator itr4 = list.iterator();
		System.out.println("Enter Name of Student to get all details : ");
		String name = sc.next();
		while (itr4.hasNext()) {
			Object key = (Object) itr4.next();
			Student stu1 = (Student) key;
			if (stu1.getSname().equals(name)) {
				System.out.println(stu1.getSname());
				System.out.println(stu1.getClassname());
				System.out.println(stu1.getRollno());
				System.out.println(stu1.getTotalmarks());
			}
		}
		System.out.println();
	}

}
