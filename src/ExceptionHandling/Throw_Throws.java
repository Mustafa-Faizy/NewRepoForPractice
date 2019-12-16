package ExceptionHandling;



public class Throw_Throws {

	
	public static int xyz(int a , int b)throws ArithmeticException {
		return a/b;
	}
	

	

     public static void main(String[] args) {
	
	
	try {
		xyz(10, 0);
	}
	
	catch (ArithmeticException e) {
		throw e;                                    // throw.
		//System.out.println("Handled");
	}
	finally {
		System.out.println("Finally block executed");
	}
	
	
   System.out.println("end");
	
	
	
	
	
	
	
	
}

}
