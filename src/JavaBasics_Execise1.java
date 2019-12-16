
public class JavaBasics_Execise1 {

	public static void main(String[] args) {
		
		// Creat all the variables
		
		
		double amount = 10;
		double taxRate = 0.05;
		double discountRate = 0.2;
		
		// calculate the total tax amount and discount amount
// to calculate the discount amount. i have to  get the percentage subtracted from the amount
		
		
		double discountAmount = amount * discountRate;
		double taxAmount = amount * taxRate;
		double total = amount - discountAmount + taxAmount;
		
		String result = "        Tek School         \n\n"
				+ "         Reciept     \n"
				+ "Amount...................." + amount + "$" 
				+ "\n\nDiscount Rate............." + (discountRate*100) + "%"
				+ "\n\nDiscount Amount..........." + discountAmount + "$"
				+ "\n\nTax Rate.................." + (taxRate*100) + "%"
				+ "\n\nTax Amount................" + taxAmount + "%"
				+ "\n\n********************************"
				+ "\n\ntotal....................." + total +  "$"
				+ "\n\n________________________________"
				+ "\n\n      visit our website         "
				+ "\n\n  www.tekschoolofamerica.com\t\t\t";
				System.out.println(result);
				
				
				System.out.println("\n\n*********************************************");
				
				// explicit casting 
				
				int num1 = 8;
				double num2 = (double) num1 /2;
				System.out.println(num2);
				
				double num3 = 56.999;
				int num4 = (int) num3 + 2;
				System.out.println(num4);
				
				double num5 = (double) num1 + num3;
				System.out.println(num5);
				
				
				//implicit casting 
				
				double num6 = num1;
				System.out.println(num6);
				
				int num7 = (int) num3 ;
				System.out.println(num7);
				
				//increment  prefix and postfix
				
				int a = 8;
				System.out.println(++a);
				
				int b = 10;
				System.out.println(b++);
				System.out.println(b);
				
				// Decrement prefix and postfix 
				
				int c = 7;
				System.out.println(++c);
				int d = 5;
				System.out.println(d++);
				System.out.println(d);
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
		
		
		
		
		

		
	
		
		
		
		
		
		
	}
}