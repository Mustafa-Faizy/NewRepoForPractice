
public class JavaBasics_Exesise4 {

	public static void main(String[] args) {

		String items []= new String [9];
		
				items[0]= "ihone6";
				items[1]= "iphoneXSmax";
				items[2]= "ihone6s";
				items[3]= "ihone6plus";
				items[4]= "ihone7";
				items[5]= "ihone8";
				items[6]= "ihone11";
				items[7]= "ihoneXR";
		boolean payStatuse = false;
		double balance = 3579.72;
		double amountPaid = 3579.72;
	
		if (amountPaid >= balance) {
			payStatuse = true;
		}
		if (payStatuse == true){
			System.out.println("Ship these items");
			for (int i = 0; i< items.length; i++){
				System.out.println((i+1) + " " + items[i]);
			}
		}
		else {
		 
			System.out.println("Do not ship the items");
			for (int i = 0; i < items.length; i ++) {
				System.out.println((i +1) + " " + items[i]);
			}
			System.out.println("\nUnpaid balance");
		}
		
		System.out.println("\n_________________________________________________");
		
		
		

		items[0]= "ihone6";
		items[1]= "iphoneXSmax";
		items[2]= "ihone6s";
		items[3]= "ihone6plus";
		items[4]= "ihone7";
		items[5]= "ihone8";
		items[6]= "ihone11";
		items[7]= "ihoneXR";
boolean payStatuse1 = false;
double balance1 = 3579.72;
double amountPaid1 = 3435.51;  

if (amountPaid1 >= balance) {
	payStatuse1 = true;
}
if (payStatuse1 == true){
	System.out.println("Ship these items");
	for (int i = 0; i< items.length; i++){
		System.out.println((i+1) + " " + items[i]);
	}
}
else {
 
	System.out.println("Do not ship the items");
	for (int i = 0; i < items.length; i ++) {
		System.out.println((i +1) + " " + items[i]);
	}
	System.out.println("\nUnpaid balance");
}
		
		System.out.println("\n_____________________________________");
		
		
		
		double products[][]= new double [4][1];
		products [0][0]= 20.99;
		products [1][0]= 11.89;
		products [2][0]= 59.99;
		products [3][0]= 7.59;
		
		for (int i =0; i<products.length; i++) {
			for (int j = 0; j < products[i].length; j++) {
				
			}
			System.out.println((i+1) + ". " + products [i][0]);
		}
		boolean paymentStatuse = false;
		double amountPaid2 = 10046;
		double totalBalance = 100.46;
		
		if (totalBalance >= amountPaid2) {
			paymentStatuse = true;
		}
			
		if (paymentStatuse == true) {
			System.out.println("ship the items");
			for (int i =0; i <= products.length; i++) {
				for (int j = 0; j <= products[i].length; j++) {
					System.out.println((i+1) + ". " + products[i][j]);
				}
			}
		}
		else {
			System.out.println("Unpaid balance");
			for (int i =0; i <= products.length; i++) {
				for (int j = 0; j <= products[i].length; j++) {
					System.out.println((i+1) + ". " + products[i][j]);
				}
			}
		}
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
