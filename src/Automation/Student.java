package Automation;

import java.util.ArrayList;



public class Student {

	String firstName;
	String lastName;
	boolean present;
	
	public Student(String f_Name , String l_Name , boolean pres ) {
		firstName = f_Name;
		lastName = l_Name;
		present = pres;
	}
	
	public String studentInfo(){
		String status = "";
		if(present) {
			status = " is present";
		}
		else {
			status = " is absent";
		}

		return firstName + " " + lastName + " "+ status;
	}
	
	
	ArrayList<Student> studentList;
	public Student() {
		studentList = new ArrayList<Student>();
	}
	
	public  ArrayList<Student> getstudentlist() {
		return studentList;
	}
	
	
	
	public void addStudent (Student newStudent) {
		studentList.add(newStudent);
		
	}
		
		
		
	
	
	
	
	
	
	
	
	
	
		}
