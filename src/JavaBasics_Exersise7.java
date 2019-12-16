
public class JavaBasics_Exersise7 {

	public static void main(String[] args) {
		
		// create a single dimension array and use all types if loops that we learned.
		
		
		
		int ex7[] = new int [7];
		
		ex7 [0] = 1;
		ex7 [1] = 2;
		ex7 [2] = 53;
		ex7 [3] = 55;
		ex7 [4] = 60;
		ex7 [5] = 23;
		ex7 [6] = 7;
		// for loop is applied in this step.
		for(int i = 0; i < ex7.length; i++) {
			System.out.println(ex7[i]);
		}
		// for each loop is applied in this step.
		 System.out.println("*****for each loop is applied*****\n");
	for (int elements:ex7) {
		System.out.println(elements);
	}
System.out.println("*****While loop is applied*****\n");
			
	int counterForWhileLoop = 0;
	
	while(counterForWhileLoop < ex7.length) {
		System.out.println(ex7[counterForWhileLoop++]);
	}
		
	System.out.println("*****Do While loop is applied*****\n");
	
	int counterForDoWhileLoop = 0;
		
	do {
		System.out.println(ex7[counterForDoWhileLoop++]);
	}			
		while (counterForDoWhileLoop < ex7.length);	
				
				
				
				
				
				
				
				
				
				
				
	}

}
