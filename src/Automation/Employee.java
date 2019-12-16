package Automation;

public class Employee {

	private int salary;
	
	
	
	public Employee(int salary) {
		this.salary = salary;
	
		if (salary>= 88000 && salary<= 99000 ) {
			System.out.println(" Employee of VA");
		}
		else if(salary >= 100000) {
			System.out.println( "Employee of NY");
		}
		else if (salary<=85000){
			System.out.println("Employee of other states");
		}
	}
	
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int Salary) {
		this.salary = salary;
	}
	
	
	
	
	
	

		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
