package OOP;

import java.util.ArrayList;

public class Class {

	ArrayList <Student> listOfStudent;
	
	// constructor method:
	public Class () {
		listOfStudent = new ArrayList<Student>();
	}
	
	
	// getter method:
	public ArrayList<Student> getListOfStudent() {
		return listOfStudent;
	}
	// add method, using this method we are adding more student to the arrayList of student.
	public void addStudent (Student newStudent) {
	listOfStudent.add(newStudent);
	}
	
	
	
	
	
	
	
}
