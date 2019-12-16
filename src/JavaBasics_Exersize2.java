
public class JavaBasics_Exersize2 {

	public static void main(String[] args) {
	
		
		//declare 3 different arrays first
		//initialize the arrays separately 
		
		
		
		// Declared 
		String firstName [];
		String lastName [];
		int age [];
		
		// Initialized 
	    firstName  = new String [5];
		lastName  = new String [5];
		age  = new int [5];
		
		
		firstName [0] ="Bob";
		firstName [1] = "Mike";
		firstName [2] = "Jack";
		firstName [3] = "David";
		firstName [4] = "Ahmad";
		System.out.println(firstName[4]);
		
	    lastName [0] = "Logan";
	    lastName [1] = "Young";
	    lastName [2] = "Ma";
	    lastName [3] = "Bekham";
	    lastName [4] = "Zahir";
	    
	    age [0] = 31;
	    age [1] = 38;
	    age [2] = 55;
	    age [3] = 33;
	    age [4] = 45;
	    
	    System.out.println(firstName[0] + " "+  lastName[0] + " "+ "is" + " " + age [0] + " " + "years old") ;
	    System.out.println(firstName[1]+ " "  + lastName[1]+ " is " + age[1] + " "+ "years old");
	    System.out.println(firstName[2] + " " + lastName[2] + " " + "is"  + " " + age[2] + " " + "years old");
	    System.out.println(firstName[3] + " " + lastName[3] + " " + "is" + " " + age[3] + " " + "years old");
	    System.out.println(firstName[4] + " " + lastName[4] + " " + "is" + " " + age[4] + " " + "years old");
	    
	    
	    
	    
	   System.out.println("\n\n\n______________________________");
	   
	   
	   String practice = "I am  practicing my best to get everything\n I have learned in \"JAVA\" so far"
			   + "\n by my best";
		System.out.println(practice);
		
	}

}
