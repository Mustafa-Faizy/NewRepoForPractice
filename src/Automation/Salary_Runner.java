package Automation;

import java.util.ArrayList;

public class Salary_Runner {

	

	public static void main(String[] args) {
		
		
	Employee emp1 = new Employee(120000);
		System.out.println(emp1.getSalary());
	
		
		
		Employee emp2 = new Employee(82000);
		

		Employee emp3 = new Employee(50000);
		System.out.println(emp3.getSalary());
		
		
		
		//emp1.setSalary(90000);
		
		
		System.out.println("******Arry list and for each loop********");
		
		
		ArrayList<Employee> empstate = new ArrayList<Employee>();
		
		Employee emp4 = new Employee(120000);
		Employee emp5 = new Employee(82000);
    	Employee emp6 = new Employee(50000);
    	
    	empstate.add(emp1);
    	empstate.add(emp2);
    	empstate.add(emp3);
    	
    	for(Employee d: empstate) {
    		System.out.println(d.getSalary());
    	}
	
	
	
	
	
	
	}	
	
}
