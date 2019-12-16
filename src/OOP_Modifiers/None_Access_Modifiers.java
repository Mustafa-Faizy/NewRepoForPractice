package OOP_Modifiers;

public final class  None_Access_Modifiers {

	public static void main(String[] args) {
		
		
	final double taxRate = 0.1;	
		
		
		// Book is Abstract class we cant create object of that. we used polymorphisme. declare parent calss initialize child class. 
		Book b1 = new CSBook("Java", "Some one", 5236, "some one", "fifth");  
		Book b2 = new CSBook("C#", "Some one", 5236, "some one", "fifth");
		Book b3 = new CSBook("PYTHON", "Some one", 5236, "some one", "fifth");
		
		System.out.println(b1.getCount()); // this is static variable.
		
		Book.numberOfBooksInTheSystem();  // this is static method.
		
		
		
		// Math Class the methods are available in java JDK. 
		int x = 10;
		int y = 5;
		int z = 3;
		
		System.out.println(Math.min(y, z)); // this is not accurate if we change the value of x it will fail.
		
		System.out.println(Math.min(x, Math.min(y, z)));   // this is accurate.
		
		
		
		
		
		
		
		
		

	}

}
