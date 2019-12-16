
public class JavaBasics_Exersise9 {

	public static void main(String[] args) {
		
		//create a String "This is when i test these methods! lets go 123!!!"
				//print the string but convert everything to upper case
				//print a portion of the string index 10 to 15
				//print the index number of the first occurrence of "lets"
				
				//Challenge:
				//check to see if there is any special sign/symbol used in the string
				//if so, then print this message "there are symbols in the text" if not
				//then print "no sign is used"
				//if you are up for it, print the signs if there are any signs in the text as well
				
		
		String ex = "This is when i test these methods! lets go 123!!!";
		 System.out.println(ex.toUpperCase());
		
		System.out.println(ex.substring(10, 15));
		
		System.out.println(ex.indexOf("lets"));
		
		if (ex.replaceAll("[a-zA-Z0-9 ]", "").length() > 0) {
			System.out.println("there are symbols in the text: " + ex.replaceAll("[a-zA-Z0-9 ]", ""));
		}
		else {
			System.out.println("no signe is used");
		}
		










	}
	
	
	

}
