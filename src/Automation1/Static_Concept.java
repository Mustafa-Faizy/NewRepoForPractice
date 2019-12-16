package Automation1;

public class Static_Concept {

	
	public void run() {
		System.out.println(x);        // we can put static variable in a none static method.
		System.out.println("Running...");
	}
	
	
	
	public static void walk() {
		System.out.println("walking..."); 
		System.out.println(x);   // we cant put none static variable in static method.
	}
	
	
	
	static int x = 10;



	
	
	
	
	
	
}
