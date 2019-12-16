package Interview_Question;

public class LogicalQuestion {

	
	/*
    Write a method which prints out the numbers from start to end, BUT
    for numbers which are a multiple of 3, print FIN instead of the number, AND
    for numbers which are a multiple of 5, print RA instead of the number. FINALLY,
    for numbers which are a multiple of both 3 AND 5, print FINRA instead of the number
    
    Example Output:
    1
    2
    FIN
    4
    RA
    FIN
    7
    8
    FIN
    RA
    11
    FIN
    13
    14
    FINRA
    16
    …
    */
	
	// in here i am explaining what i need.
	
	// method definition
	// method inputs must be start and end of the range of the numbers
	// the method does not have a return. its just printing.
	// I know i have to loop through the start to end.
	
	// conditions inside my loop
	// if the number is multiple of 3
	// if the number is multiple of 5
	
	
	
	
	
	public void testMethod(int start , int end) {
		
		
		if(start >= 0) { // here i put everything inside the if block again to fixed the defect or bug.
		for(int i = start; i <= end; i++) {
			if(i == 0) {                      //<= one more condition added at third time that passed the test. 
				System.out.println(i);
			}
			else if(i % 3 == 0 && i % 5 == 0) {
			System.out.println("FINRA");
		}	
		else if(i % 3 == 0) {
			System.out.println("FIN");	
			}
			
			else if(i % 5 == 0) {
			System.out.println("RA");
			}
			
			//else if(i % 3 == 0 && i % 5 == 0) { // here its not printing FINRA coz the code is correct but flow of execution matters here
			//System.out.println("FINRA");  // the code will check for FIN and then For RA in above if and if else blocks and prints them
			//}								// it will never reaches here thats why i had to restructure the code and moved to the top.
			
			else {
				System.out.println(i);  // here if none of the conditions are true ptint the number.
			}
			
			
		}	
			
		}
	}
	
	
	// its always good to test everything as we go.
	
	
	public static void main(String[] args) {
		
		// in here im testing it as a tester. its called system testing. and im testing one function of the application.
		
		LogicalQuestion obj = new LogicalQuestion();    // here i created the object of the class in main method.
		System.out.println("Happy path");
		obj.testMethod(1 , 20);  // the code is dynamic any input i put there it will give me result based on that.
//		
//		System.out.println("TC 1");
//		obj.testMethod(20 , 1); // pass
//		
//		System.out.println("TC 2");
//		obj.testMethod(0 , 20);  // fail // fail  //pass
//		
//		
//		System.out.println("TC 3");           
//		obj.testMethod(-20 , 0);   // fail // fail  //pass
//		
//		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
