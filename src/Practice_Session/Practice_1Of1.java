package Practice_Session;

import java.util.ArrayList;

public class Practice_1Of1 {

	public static void main(String[] args) {
	
		
	   //	System.out.println(xyz("Test " , 10/2));  
		
		ArrayList<String> x = xyz("Test " , 10/2); // in here i took the result of the previuse ArrayList of String and assigned to to the new 
													// ArrayList of String (X).
		x = xyz("Test " , 235);
		x = xyz("Test " , 194+2);// here i am adding these elements(xyz) to the arraylist testData.
		
		System.out.println(x);
		
		
		
	}	
		
	
	
	
	
	
	
	
	
	// Here i am out side the main method, i am creating methods here and i will test them inside the main method which is above.	
		// the method below is taking one String and one integer and returning ArrayList of String.
	static ArrayList<String> testData = new ArrayList<String>();
	
		public static ArrayList<String> xyz(String t, int x) { // here if i don't have the input data or argument i have to add my return data.
																// or i have argument i have to add my argument inside the parenteces of add'
																// and when the user call the method he will be asked for input.
			testData.add(t + x);
			
			
			return testData;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	

}
