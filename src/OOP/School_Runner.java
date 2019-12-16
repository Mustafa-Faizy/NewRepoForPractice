package OOP;

import java.util.ArrayList;

public class School_Runner {

	public static void main(String[] args) {
		
		
		// we call the constructor method here (Class) <== which is the class name.
		Class softWareTestingAutomation = new Class();
		Class manualTestig = new Class();
		
		// in here i called the constructor method to add values for variable.
		// creating object of student class that i just created.
		Student st1 = new Student("Ahmad" , "Jan" , "Male" , true , 27);
		Student st2 = new Student ("Jack" , "Ma" , "Male" , false , 49);
		Student st3 = new Student ("Bradley" , "Cooper" , "Male" , true , 49);
		Student st4 = new Student ("Jackie" , "Chan" , "Male" , false , 67);
		Student st5 = new Student ("Jet" , "Lee" , "Male" , false , 49);
		
		
		// in here i call the add method to add more student to the Automation class.
		softWareTestingAutomation.addStudent(st1);
		softWareTestingAutomation.addStudent(st2);
		softWareTestingAutomation.addStudent(st3);
		softWareTestingAutomation.addStudent(st4);
		softWareTestingAutomation.addStudent(st5);
		
		
		// creating objects of "Teacher" calss.
		
			
				
			Teacher t1 = new Teacher("Jacki" , "Chan" , "Male" , 67 , "Karate" );
				
			t1.addSubject("Acting");	
			t1.addSubject("Kungfu");
				
		
		
		
		
		// in here called the get method to get student information from Automation class. 
		 softWareTestingAutomation.getListOfStudent();
		
		 // here i used for each loop to print it in consul for all students.
		for (Student st: softWareTestingAutomation.getListOfStudent())  {
			System.out.println(st.getStudentInfo());
		}
		
		
		System.out.println("\n\n****Below this line everything is done manualy and above is using method****\n");
		
		// here i done the same thing manually that sucks.
		//i just did it for two students for more than needs more lines of code and more time.
		
		softWareTestingAutomation.addStudent(st1);
		
		System.out.println(softWareTestingAutomation.getListOfStudent().get(0).getfirstName());
		System.out.println(softWareTestingAutomation.getListOfStudent().get(0).getlastName());
		System.out.println(softWareTestingAutomation.getListOfStudent().get(0).getgender());
		System.out.println(softWareTestingAutomation.getListOfStudent().get(0).getenrolled());
		System.out.println(softWareTestingAutomation.getListOfStudent().get(0).getage());
		
		// add more get in the class to print other variables.
		
		System.out.println("__________________________");
		
		
		softWareTestingAutomation.addStudent(st2);
		

		System.out.println(softWareTestingAutomation.getListOfStudent().get(1).getfirstName());
		System.out.println(softWareTestingAutomation.getListOfStudent().get(1).getlastName());
		System.out.println(softWareTestingAutomation.getListOfStudent().get(1).getgender());
		System.out.println(softWareTestingAutomation.getListOfStudent().get(1).getenrolled());
		System.out.println(softWareTestingAutomation.getListOfStudent().get(1).getage());
		
		// add more get in the class to print other variables.
		
       
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
