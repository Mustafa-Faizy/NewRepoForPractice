
public class ContiueAndBreak {

	public static void main(String[] args) {
	
		
		
	// break
		
		
		for(int i = 0; i < 20; i++) {

			System.out.println(i);
			
			if(i == 10) {
				break;
			}
			
		}
	
		System.out.println("________________");
		
		// continue
		
		for(int j = 0; j < 20; j++) {
			
			
			if(j > 5 && j < 10) {
				System.out.println("continue applied");
				continue;
			}
			System.out.println(j);  // it has to be at end of the code inside of the loop block.
		}
		
		
		
		// create a loop that will go through 1 - 10 and print the numbers.
		// when the number is multiple of 3, then skip that iteration
		// when the number is 9, stop the loop
		// after the loop is done, print "loop ended"
		
		
		System.out.println("________________");
		
		for (int i = 1; i <= 10; i++) {
			
			 if(i == 9) {
				 System.out.println("break applied");
				break;
		}
				 else if(i % 3 == 0) {
				 System.out.println("Continue Applied");
				continue;
			}
				 else {
			System.out.println(i);
				 }
	}
		
		System.out.println("loop ended");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
