package My_Interface;

public class Teacher extends Student implements School   {
	
	int speedUp;
	
	
	
	
	

	public Teacher(String name, String lastName, int salary, int speedUp) {
		super(name, lastName, salary);
		this.speedUp = speedUp;
		
	}
	
	
	
	
	
	
	
	 @Override
	public int speedUp(int x) {
		
		return x;
	}
	
	

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setLastName(String lastName) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toString() {
		return name + " " + lastName + " " + salary + " " + speedUp;
	}
	
	
	
	public void rais(int x) {
		salary += x;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
	Teacher t1 = new Teacher("Homayoon", "Behroozyan", 100000, 5000);	
	t1.rais(10000);	
	
	System.out.println(t1.toString());	
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
