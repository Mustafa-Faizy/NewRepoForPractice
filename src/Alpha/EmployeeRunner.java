package Alpha;

public class EmployeeRunner {

	public static void main(String[] args) {
		
		
		
		
		

	    Department d1 = new Department("Finance");
	    Department d2 = new Department ("Internationl");
	    
	    Employee e1 = new Employee("Marin", 1000.);
	    Employee e2 = new Employee("Donald", 2100);
	    
	    d1.addlistOfEmployee(e1);
	    d1.addlistOfEmployee(e2);
	    
	  
	    
	    for (Employee emp : d1.getOverSalary()) {
	        System.out.println(emp.getName()+" "+ emp.salary);
	        		
	    }
	    
	    
	   
	    
		
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
