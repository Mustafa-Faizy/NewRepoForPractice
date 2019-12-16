package ExceptionHandling;

public class Practic_ExceptionHandling {

	public static void main(String[] args) {
	
		//int x = 10/0; // here it wont even reach the try and catch block.
		
		
		try {
			int a = 10;
			int b = 0;
			int x = a/b;
			System.out.println(x);
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Exception cought");
		}
		
		catch (Exception e) {
			System.out.println("other exception");
		}
		
		
		System.out.println("Code Excecution continues");
		
		
		
	System.out.println("\n____________________");	
		
		
		
		
		
	String [] arr = new String [3];
	
	arr [0] = "Jahana";
	arr [1] = "Mohib";
	arr [2] = "Mustafa";
		
	for (String i: arr) {
		System.out.println(i);
	}	
		
		
	try {
		System.out.println(arr[3]);	
	}
	
	catch (ArithmeticException e) {
		System.out.println("If its Arithmetic exception print this");
	}
	
	catch (Exception e) {
		e.printStackTrace();
		
		System.out.println("Index out of bound");
	}
	
	
	
		System.out.println(arr[2]);
		
		System.out.println("\n____________________");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
