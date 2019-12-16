
public class JavaBasics_Exersise5 {

	public static void main(String[] args) {
		
		
	String grading [][] = new String[5][4];	
	grading[0][0] = "David";
	grading[0][1] = "Miler";
	grading[0][2] = "73";
	grading[0][3] = " ";
	
	grading[1][0] = "John";
	grading[1][1] = "Smith";
	grading[1][2] = "84";
	grading[1][3] = " ";
	
	grading[2][0] = "marcia";
	grading[2][1] = "Occomy";
	grading[2][2] = "91";
	grading[2][3] = " ";
	
	grading[3][0] = "Tracy";
	grading[3][1] = "Lane";
	grading[3][2] = "68";
	grading[3][3] = " ";
	
	grading[4][0] = "Jema";
	grading[4][1] = "Cabrias";
	grading[4][2] = "68";
	grading[4][3] = " ";
	  
	int grade = 0; // i created a int grade then i assign it in my if condition its making things easier
	// for me. and i converted String to int that the the way of formating it is shown above.

	for (int i = 0; i<grading.length;i++) {  // this curly braces is the start of my loop.
	 grade = Integer.valueOf( grading[i][2]); // in here i converted numbers that were store as String in array back to int data taype.
	 if(grade >= 90 && grade <= 100) {
		 grading[i][3] = "A";
	 }
	 else if (grade >= 80 && grade <= 89) {
		 grading[i][3] = "B";
	 }
	 else if (grade >= 70 && grade <= 79) {
		 grading[i][3] = "C";
	 }	 
	 else if (grade >= 60 && grade <= 69) {
		 grading[i][3] = "D";
	 }
	 else if (grade < 60) {
		 grading[i][3] = "F";
	 }
		
	} // this curly braces is the of our loop block.
	
	// now here i'm doing my second if condition and applying the messages to the grades ( A - F)
	
	  // i'm creating  a String message i left it blank for now and then i apply this String to my if condition 
	//  just i did for above (created int grade)
	
	String message = "";
	for (int i =0; i< grading.length; i++) { // created another loop to process all these if conditions for me and put all inside my loop block
	if (grading[i][3].equals("A")) {  // .equals is doing the same job as ==  . its just String and == is for int.
		message = "Exellent";
	}
	else if (grading [i][3].equals("B")) {
		message = "Good job";
	}
	else if (grading[i][3].equals("C")) {
		message = "Keep up the hard work";
	}
	else if (grading[i][3].equals("D")) {
		message = "Try harder";
	}
	else if (grading[i][3].equals("F")) {
		message = "Try harder";
	}
		
		System.out.println(grading[i][0]+ " " + grading[i][1] + " " + "\t" + grading[i][2] +  " " + grading[i][3] + " " + message);
		
	} // end of the loop block.
	
	System.out.println("\n_________________________________________________");
	
	
	double store [][]= new double [5][5];
	store[0][0] = 9.00;
	store[0][1] = 1.99;
	store[0][2] = 0.05;
	store[0][3] = 0.00;
	store[0][4] = 0.00;
	
	store[1][0] = 11.00;
	store[1][1] = 5.99;
	store[1][2] = 0.05;
	store[1][3] = 0.00;
	store[1][4] = 0.00;
	
	store[2][0] = 4.00;
	store[2][1] = 5.89;
	store[2][2] = 0.05;
	store[2][3] = 0.00;
	store[2][4] = 0.00;
	
	store[3][0] = 7.00;
	store[3][1] = 14.59;
	store[3][2] = 0.05;
	store[3][3] = 0.00;
	store[3][4] = 0.00;
	
	store[4][0] = 1.00;
	store[4][1] = 45.99;
	store[4][2] = 0.05;
	store[4][3] = 0.00;
	store[4][4] = 0.00;
	
	/*
	 Steps:
   Write a loop to calculate the tax amount based on the Tax Rate for each record and store it to the Tax Amount column.
	 */
	double quantity = 9.00;
	double price = 1.99;
	double taxRate = 0.05;
	double taxAmount = quantity * price * taxRate;

	for (int i = 0; i < store.length; i++) {
		
		
		
		System.out.println(store[i][0] + " " + store[i][1] + " " + store[i][2] + " " + store[i][3] + " " + store[i][4] + " " + (taxAmount));
	}
	 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		

	}

}
