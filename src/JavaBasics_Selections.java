
public class JavaBasics_Selections {

	public static void main(String[] args) {
	
		int age = 21;
		if (age >= 21)    {  // this is the condition 
			System.out.println("Give this grown guy a beer on me");  // this is our true block.
		}
		else {
			System.out.println("Drink milk for now kid");  // this is else block or falls block
		}
		System.out.println("\n_________________________________");
	
		

		int age1 = 20;
		if (age1 >= 21)    {  // this is the condition 
			System.out.println("Give this grown guy a beer on me");  // this is our true block.
		}
		else {
			System.out.println("Drink milk for now kid");
		}
		System.out.println("\n_____________________________");

		int age2 = 20;
		if (age2 >= 21)    {  // this is the condition 
			System.out.println("Give this grown guy a beer on me");  // this is our true block.
		}
		else if (age2 ==20) {
			System.out.println("You can have a beer if you promis me you dont tell nobody");
		}

		else {
			System.out.println("Drink milk for now kid");
		}
		
		System.out.println("\n______________________________");
		
		int age3 = 6;
		if (age3 >= 21) {
			System.out.println("give this grown man a drink");
		}
		else if (age3 == 20) {
			System.out.println("you can have a drik if you promis me that you tell nobody");
		}
		else if (age3 == 11) {
			System.out.println("Give him a soda for now");
		}
	
		else if (age3 == 6) {
			System.out.println("Milk should be somting that looking for");
		}
		else {
			System.out.println("NO \"Alcohol\" for now buddy");
		}


	}

}
