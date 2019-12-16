 package OOP_ExeptionHandling;

public class ExeptionHandling {
	
	
	
	
	// here im outside of main method.
	
		public static int divide(int a , int b) throws ArithmeticException {
			return a/b;
		}
		
		
	
	
	

	public static void main(String[] args) {
		
		
		//System.out.println(divide(10 , 0)); // here if click on divide it will tell me that Arithmetic exception may happen.
		
		
		int x = 0;
		
	
	
	try {x = divide(10, 0);
		
	}
	catch (ArithmeticException e) {
		

	System.out.println("exeption ");
	}
	
	catch(Exception e) {
		System.out.println("there is an exception");
	}
	
	
	
	System.out.println("________________________");
	
	String [] name =   {"1" , "2" , "3"};
	
	for (int i = 0; i < name.length; i++) {
		System.out.println(name[i]);
	}
	
	
	//System.out.println(name[3]);
	
	
	
	try {System.out.println(name[3]);}
	
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("index out od bound");
	}
	
	
	//System.out.println(name[4]);
	
	try {System.out.println(name[4]);}
	
	catch (Exception e) {
		System.out.println("Exception caught"); // we can have multiple catch bloks.
	}

	
	//System.out.println(name[2]);
	
	
	try {System.out.println(name[5]);
	}
	
	catch (Exception e) {
		throw e;
		//System.out.println("exception");
	}
	
	
	System.out.println("After throw"); // this line will never execute coz i threw an exception before that in line 80.
	
	
	
	}
	
	
	
	
	
	
	

	
	
	
}
