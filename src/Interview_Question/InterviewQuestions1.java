package Interview_Question;

public class InterviewQuestions1 {

	private static final int S = 0;

	public static void main(String[] args) {
		
	
		
	// Q1 
		// How to reverse a string?
		// e. g. START = TRATS
		
		
		// Q2 
		// How to reverse int?
		// e. g. 12345 = 54321	
		

		
		
		for(int i = 1 ;i <= 5; i++) {
			System.out.print(i);
			
		}
		System.out.println("\n_____________\n");
		
		for(int j = 5; j>=1; j--) {
			System.out.print(j);
		}
		
		System.out.println("\n_____________\n");
		
		String challenge = "START";
		
		char challengeAccepted [] = challenge.toCharArray();
		
		
		for(int i = 0; i < challengeAccepted.length; i++) {
			
		System.out.print(challengeAccepted[i]);
		}
		
		System.out.println("\n_____________\n");
		
		
		for(int j = challengeAccepted.length-1; j>= 0; j--) {
			System.out.print(challengeAccepted[j]);
		}
		
		
		
		// here how the teacher done the above question.
		
		
		
		
		// Q1
		// how to reverse a string
		// e. g. START = TRATS
		String data = "Test Data!";
		
		for (int i=data.length()-1; i>=0; i--) {
			System.out.print(data.charAt(i));
		}
		System.out.println();
		
		
		
		StringBuffer sb = new StringBuffer(data);
		
		System.out.println(sb.reverse());
		
		
		
		
		
		String text = "Immutable"; // when its immutable and when we change the value it creat another field in memory space on back end.
		
		text = "im a different text now"; //Mutable inside that variable creates another at the same place.
		
		
		
		
		
		
		
		
		
		
		System.out.println("\n\nRev Num");
		// Q2
		// How to reverse int
		// e. g. 12345 = 54321
		int num = 123545;
		int rev = 0;
		
		
		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
		
		
		
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);

		System.out.println("\n________________________\n");
		
		
		String name = "MUSTAFA FAIZY";
		
		StringBuffer reverse = new StringBuffer(name).reverse();
		
		
		System.err.println(reverse);
		
		
		System.out.println("\n________________________\n");
		
		
		int number = 123456789;  // using String Buffer is the effeciant way of reversing coz of less complixity of code.
		
	System.out.println( new StringBuffer(String.valueOf(number)).reverse());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
