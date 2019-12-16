import java.util.ArrayList;

public class JavaBasics_StringManipulation {

	public static void main(String[] args) {
		
		
		ArrayList<String> names = new ArrayList <String>(); 
		
		names.add("david");
		names.add("jacob");
		names.add("jack");
		names.add("dolly");
		
		System.out.println("******UpperCase Method*****\n");
		for (String name: names) {
			System.out.println(name.toUpperCase());
		}
		System.out.println("******charAt Method*****\n");
		for (String boom : names) {
			System.out.println(boom.toUpperCase().charAt(0) + boom.substring(1, boom.length()));
		}
		
	System.out.println("_______________________________");
		String test = "This is a string that i am going to test on it";
		String test1 = "This is a string that i am going to test on it  ";
		String test2 = " This is a string that i am going to test on it";
		
		//length
		
		int l = test.length();
		System.out.println(l);
		System.out.println(test.length());     //or i can do it this way:
		
	System.out.println(test.charAt(6));
		
	char c = test.charAt(6);	
	System.out.println(c);	
		
		System.out.println(test.substring(5)); // i gave the begining index it printed the ramaing part of the string.
		
		System.out.println(test.substring(9, 13)); // here i gave it the begening part and the ending part. it printed out.
		
		//indexOf
		
		System.out.println(test.indexOf("s"));
		System.out.println(test.indexOf("string"));
		
		//equals
		
	System.out.println(test.equals(test1));
		
	System.out.println(test1.equals(test2)); // this one returning false coz i have space at the beginning and spaces count.
	
	System.out.println(test1.trim().equals(test2.trim()));	//in here i used the trim method with equals method to remove spaces at beg and end. 
													// and the result printed out true.
	
	
	//trim
	String g = "      Hello     ";
	System.out.println(g);
	System.out.println(g.trim());
	System.out.println("___________________________");		
			
	String x = "this i i i i";
	String y = "This";
		// equals
	System.out.println(x.equals(y));
	
	// equalIgnoreCase
	System.out.println(x.equalsIgnoreCase(y));
	
	// compareTo
	System.out.println(x.compareTo(y));
	
	//compareTpIgnoreCase
	System.out.println(x.compareToIgnoreCase(y));
	
	// contains 
	System.out.println(test.contains("string"));
	
	//endsWith
	System.out.println(test.endsWith("on"));
	System.out.println(test1.trim().endsWith("going to test on it"));	
	
	//stratsWith
	System.out.println(test.startsWith("This"));
	
	//replaceAll
	System.out.println(x.replaceAll("this", "those"));
	
	//replaceFirst
	System.out.println(x.replaceFirst("i", "a")); // it will replace the first occurrence of the value.
	
	//toUpperCase
	System.out.println(x.toUpperCase());
	
	//toLowerCase
	System.out.println(x.toLowerCase());
	System.out.println("____________________________");
	//toCharArray
	char arr[] = x.toCharArray(); //  now i am going to store it in a char array.
	
	for(char m: arr) {
		System.out.println(m);
	}
	System.out.println("____________________________");
	// regularExpressions
	String rE = "this IS the &&@ Regular % Expressions !1 that 1223 im practiCing";
	
	System.out.println(rE.replaceAll("[a-zA-Z0-9 ]", ""));// in here im just rplacing the evrything in the braket include space.
			
	System.out.println(rE.replaceAll("[A-Z ]" , "")); // in here im just rplacing the upper case A-Z include space to nothing
													  //	using regular expressions.
	
	System.out.println(rE.replaceAll("[a-z0-9]", "")); // in here im just replacing the lower case a-z and the numbers to nothng 
														// using regular expressions and printing the rest.
	
	
	System.out.println(rE.replaceAll("[^A-Z ]" , ""));// using the carret "^" im reversing the whole thing. it means NOT.
	
													// it means rplace everything in that string with nothing but upper case A_Z.
	
	
		

	}

}
