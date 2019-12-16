package OOP_Exesise4;

public class Student {

	
	private String firstName;
	private String lastName;
	private static int numberOfStudent = 0;
	
	public Student(String firstName, String lasName) {
		this.firstName = firstName;
		this.lastName = lasName;
		numberOfStudent++;
	}
	
	
	
	public String toString() {
		return "First Name => "+ firstName+ " LastName => "+ lastName + " Number Of students => " +numberOfStudent;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
