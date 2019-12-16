
public class javaBasics_Loops {

	public static void main(String[] args) {
		
		for (int i =1; i <6; i++) {
			System.out.print(i);
			
			for(int x = 1; x<= i; x++)
				System.out.print(x);      // nested loop (loop inside loop)  must google it.
			System.out.println();
		}
		  for(int i=0; i <= 9; i++){
			    System.out.print(i);
			    for (int x = 0; x< i; x++)
			    System.out.print(x);
			  System.out.println();
			  }
	}

}
