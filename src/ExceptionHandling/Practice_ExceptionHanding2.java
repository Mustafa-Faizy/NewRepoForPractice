package ExceptionHandling;

public class Practice_ExceptionHanding2 {

	
	public static int practice(int a ,int b ,int c ,int d) { // this is method out side of main method.
		return a / b - c + d;
	}
	
	

	
	
	public static void main(String[] args) {
		
		
	try {	int x = practice(10, 0, 5, 9);
		
		System.out.println(x);
	}
		
	catch(ArithmeticException e) {
		System.out.println("its Arithmetic exception");
	}

		System.out.println("\n_____________________");
		
	int arr2 [] = new int [3];
	
	arr2[0] = 4;
	arr2[1] = 3;
	arr2[2] = 7;
	
	

	try {
		int x = practice(10, 0, 5, 9);  // this is nested try. we can have as many try as many we want.
	
	
	try {
		System.out.println(arr2[3]);
		}
	
	 catch (ArrayIndexOutOfBoundsException e) {
		 System.out.println("index out of bound must be printed");
	 }
	
	catch (Exception e) {
		System.out.println("this is the second catch block");
	}
	
	
	}	
	catch (ArithmeticException e) {
		System.out.println("Arithmetic exception: this is the first try block");
	}
	
	
	
	System.out.println("\nAfter try and catch blocks");
	
	
	
	
	
		
		
		
	}
	
	
	
	
}
