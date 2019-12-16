package Assignments;

public class HomeWork_W2_Q1 {

	public static void main(String[] args) {
		
		
		String studentName[];
	    studentName = new String [10];
		studentName [0]= "Jack Ma";
		studentName [1]= "Bradley Cooper";
		studentName [2]= "Ali Baba";
		studentName [3]= "Peter Parker";
		studentName [4]= "James Bond";
		studentName [5]= "Bruce Lee";
		studentName [6]= "Jackie Chan";
		studentName [7]= "Mohammad Ali";
		studentName [8]= "Mike Tyson";
		studentName [9]= "Mesut Ozil";
		
		double studentGPA[];
		studentGPA = new double [10];
		studentGPA [0] = 2.1;
		studentGPA [1] = 3.4;
		studentGPA [2] = 4.0;
		studentGPA [3] = 3.5;
		studentGPA [4] = 3.8;
		studentGPA [5] = 2.7;
		studentGPA [6] = 2.9;
		studentGPA [7] = 3.0;
		studentGPA [8] = 1.9;
		studentGPA [9] = 2.2;
		
		System.out.println("\n*** List of Students ***");
		System.out.println("\n");
		for (int name=0; name<studentName.length; name++) {
			
			System.out.println( name+1 + ". " + studentName[name] + "---GPA:" + " " + studentGPA[name]);
			
		}
	
		System.out.println("\n");
System.out.println("*** List of Students – Not using loops ***");
		

String studentName1[];
studentName = new String [10];
studentName [0]= "Jack Ma";
studentName [1]= "Bradley Cooper";
studentName [2]= "Ali Baba";
studentName [3]= "Peter Parker";
studentName [4]= "James Bond";
studentName [5]= "Bruce Lee";
studentName [6]= "Jackie Chan";
studentName [7]= "Mohammad Ali";
studentName [8]= "Mike Tyson";
studentName [9]= "Mesut Ozil";
		
double studentGPA1[];
studentGPA = new double [10];
studentGPA [0] = 2.1;
studentGPA [1] = 3.4;
studentGPA [2] = 4.0;
studentGPA [3] = 3.5;
studentGPA [4] = 3.8;
studentGPA [5] = 2.7;
studentGPA [6] = 2.9;
studentGPA [7] = 3.0;
studentGPA [8] = 1.9;
studentGPA [9] = 2.2;
		
 System.out.println("1. " + studentName[0] + "---GPA: " + studentGPA[0]);		
 System.out.println("2. " + studentName[1] + "---GPA: " + studentGPA[1]);		
 System.out.println("3. " + studentName[2] + "---GPA: " + studentGPA[2]);
 System.out.println("4. " + studentName[3] + "---GPA: " + studentGPA[3]);
 System.out.println("5. " + studentName[4] + "---GPA: " + studentGPA[4]);
 System.out.println("6. " + studentName[5] + "---GPA: " + studentGPA[5]);
 System.out.println("7. " + studentName[6] + "---GPA: " + studentGPA[6]);
 System.out.println("8. " + studentName[7] + "---GPA: " + studentGPA[7]);
 System.out.println("9. " + studentName[8] + "---GPA: " + studentGPA[8]);
 System.out.println("10. " + studentName[9] + "---GPA: " + studentGPA[9]);
 System.out.println("\n");
System.out.println("*** OK! I think I know how helpful loops are ***");
System.out.println("\n");
System.out.println("*** Please do not ask me to print 100 lines without loops! ***");
	/*
	 * 1.	Print a line to console that says “”
2.	Print a line to console that says “*** Challenge accepted! ***”
3.	Create a double variable and assign 3.5 to it. Name of variable: searchGPA.
4.	Loop through the array again and print the name of student in the format provided
 above only if the GPA is more than or equal to searchGPA.
	
	 */
System.out.println("\n");
System.out.println("   \"\"    ");
System.out.println("\n");
System.out.println("“*** Challenge accepted! ***”");


double searchGPA = 3.5; 
int m = (int) searchGPA;


for (int name=0; name<=m; name++) {
    if (studentGPA[name] >= searchGPA) {
    	
    }
    System.out.println( name+1 +". " + studentName[name] + "---GPA: " + studentGPA[m]);
    
}

}

	}











	


