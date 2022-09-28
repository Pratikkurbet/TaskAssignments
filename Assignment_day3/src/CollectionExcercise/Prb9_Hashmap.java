package CollectionExcercise;

import java.util.HashMap;

class Employee
{
    int empid;
    String empname;
    int salary;
    String deptname;
    String address;
    
    
    public Employee(int empid, String empname, int salary, String deptname, String address) {
        super();
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
        this.deptname = deptname;
        this.address = address;
    }
    @Override
    public int hashCode() {
        int remainder=this.empid%10;
        return remainder;
    }
    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
    @Override
    public String toString() {
        return "Employee [empid=" + empid + ", empname=" + empname + "]";
    }
    
    
}
public class Prb9_Hashmap {

	   public static void main(String[] args) {
	    
	        HashMap<Employee, Integer> map=new HashMap<>();
	        map.put(new Employee(100, "ganesh", 12212, "computer", "PUNE"),100);
	        map.put(new Employee(121, "sagar", 23422, "computer", "mumbai"),121);
	        map.put(new Employee(3, "yash", 4522, "computer", "ahamednagar"),3);
	        map.put(new Employee(200, "pratik", 222343, "computer", "pune"),200);
	        map.put(new Employee(211, "akshay", 89987, "computer", "ravet"),211);
	        System.out.println(map);
	    }	
}
