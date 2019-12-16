package Automation;

public class JavaBasics_Practice {

	public static void main(String[] args) {
		
		String cars[] = new String [5];
		
		cars[0] = "Benze";
		cars[1] = "BMW";
		cars[2] = "Audi";
		cars[3] = "Toyota";
		cars[4] = "Lexus";
		
		for (int i =0; i < cars.length; i++) {
			System.out.println(i+1  + " " + cars[i]);
		}
		
		System.out.println("\n******For Each loop*****");
		
		for (String name : cars) {
			System.out.println(name);
		}
		
		System.out.println("\n******While loop*****");
		
		int x = 0;
		
		while (x < cars.length) {
			System.out.println(cars[x++]);
			
		}
		
		System.out.println("\n******Do While loop*****");
		
		
		int y = 0;
		
		do {
			System.out.println(cars[y++]);
		}
		while (y <cars.length);
		
		
		
		
		
		
		

	}

}
