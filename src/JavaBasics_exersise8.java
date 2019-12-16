import java.util.ArrayList;

public class JavaBasics_exersise8 {

	public static void main(String[] args) {
	
		// create an arraylist of datatype string with the name, first name.
		// add five names to the list 
		//print all five of them using foreach loop.
		// then remove two of them and print the list again.
		
		
		ArrayList<String> firstName = new ArrayList<String> ();
		
		firstName.add("Ahmad");
		firstName.add("Jack");
		firstName.add("Rock");
		firstName.add("Bob");
		firstName.add("Zidan");
		
		
		for(String boom : firstName) {
			System.out.println(boom);
		}
			
		System.out.println("*******firstName added*********");
	
		firstName.remove(0);
		firstName.remove(0);
		 for (String boom : firstName){   // this is for each loop.
			 System.out.println(boom);
			 
		 }
		
		
		
		
		

	}

}
