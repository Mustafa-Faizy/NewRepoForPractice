package My_Interface;

public class Student implements School {

	
	
	String name;
	String lastName;
	int salary;
	
	
	public Student (String name, String lastName, int salary) {
		this.name = name;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	
	
	public int salary() {
		
//		int x = 10;
//		int y = 5;
//		int z = x + y;
//		
		return salary;
	}
	
	
	
	
	
	
	
	@Override
	public void setName(String name) {
		
		this.name = name;
		
	}

	@Override
	public void setLastName(String lastName) {
		
		this.lastName = lastName;
	}

	
	
	
	public String getName() {
		return name;
	}
	
	
	
	
	public String getLastName() {
		return lastName;
	}
	
	
	public String toString() {
		return name + " " + lastName + " " + salary;
	}
	
	
	
	@Override
	public int speedUp(int x) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
	public static void main(String[] args) {
		
		
		
		
		Student st1 = new Student("Jahana", "Rajbova",3000);
		
	//	System.out.println(st1.name + " " + st1.lastName + " " + st1.salary());
		
	System.out.println(st1.toString());	
		
		
		
		
	}



	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
