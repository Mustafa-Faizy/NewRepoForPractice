package OOP;

import java.util.ArrayList;

public class Teacher {
	
	String firstName;
	String lastName;
	String gender;
	int age;
	ArrayList<String> subjects;
	
	public Teacher (String firstName , String lastName , String gender , int age , String subject) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		subjects = new ArrayList<String>();
		subjects.add(subject);
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getGender () {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	
	
	public ArrayList<String> getSubjects(){
		return subjects;
	}
	public void setSubjects(ArrayList<String> subject) {
		this.subjects = subject;
	} 
	
	//the method should not return anything. 
		// it should take and add the string to the list of subjects
		//and it should print to console a confirmation message "Subject added!"
		
	public void addSubject(String newsubject) {
		subjects.add(newsubject);
		System.out.println( newsubject + " Subject added");
	}
	
	public String getteacherInfo() {
		return firstName + " " + lastName + " " + gender + " " + age + " " + subjects;
	} 
	
	
	
	
	
	
	
	
	
	
	
	

}
