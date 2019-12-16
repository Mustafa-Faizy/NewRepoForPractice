package OOP;

public class Student {

	// in encapsulated in here to make it limited access. google the PRIVATE to where it can be acessable.
	private String firstName;
    private String lastName;
	private String gender;
	private boolean enrolled;
	private int age;
	// Constructor Method
	// access modifier class name (Arguement) {cod block} inside the code block we have the values.
	public Student (String f_Name , String l_Name , String gen , boolean enr , int ag) {
		firstName = f_Name;
		lastName = l_Name;
		gender = gen;
		enrolled = enr;
		age = ag;
				
	}
	// i have to do the whole thing the getter and the setter for each variable. not the constructor.
	// getter method for first name:  Access-modifier Return-DataType Method-Name(Arguments) {Code Block}
	 public String getfirstName() {
		return firstName;
	 }
	 public void setFirstName(String firstName) {
		 this.firstName = firstName;
	 }
	 
	 
	public String getlastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getgender() {
		return gender;
	}
	public void setgender(String gender) {
		this.gender = gender;
	}
	
	
	public boolean getenrolled() {
		return enrolled;
	}
	public void setenrolled(boolean enrolled) {
		this.enrolled = enrolled;
	}
	
	
	public int getage() {
		return age;
	} 
	public void setage(int age) {
		this.age = age;
	}
	
	// i am going to create a method by calling this method i can  get the student information in class_Runner.
	
	
	public String getStudentInfo() {
		String statuse = "";
		
		if (enrolled) {
			statuse = "Student is Enroled";
		}
		else {
			statuse = "Student is Not Enrolled";
		}
		return "First Name: " + firstName + " Last Name: " + lastName +" "+ "Gender: " + gender +" "+
				 "Enrollment Statuse:" +" "+ statuse +" "+"Age: " + age;
	}	
		
		
	

	
	 
	
	
	
	
	
	
	
}
