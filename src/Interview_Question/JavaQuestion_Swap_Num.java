package Interview_Question;

public class JavaQuestion_Swap_Num {

	public static void main(String[] args) {
		
		
		
		// here we swap values with out using third identifier. its done in three ways.
		
		
		
		int x = 10;
		int y = 50;

		x = x + y; 
		y = x - y;  
		x = x - y; 

		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		
		x = x * y;
		y = x / y;
		x = x / y;
		
		
		
		System.out.println(x);
		System.out.println(y);

		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
