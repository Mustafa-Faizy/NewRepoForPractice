package Automation;

public class My_StringManipulation {

	public static void main(String[] args) {
	
		String str = "The rains has started here";
		String str1 = "The rains has started here";
		String str2 = "The rains Has started here";
		String str3 = "The rains has started here";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(10));
		
		System.out.println(str.indexOf("s")); // first occurrence of "s"
		
		System.out.println(str.indexOf("s" , str.indexOf("s")+1) ); // second occurrence of "s"
		
		System.out.println(str.indexOf("s" , str.indexOf("s" , str. indexOf("s")+1 )+1));  //Third occurrence of "s"
		
		System.out.println(str.indexOf("has"));
		
		System.out.println(str.indexOf("hello")); // -1 its not telling us that the "hello" word is not exist or gives error it prints -1.
		
		// String comparison
		// in String comparison it print the result based on boolean logic.if its right it prints true if its wring it prints false.
		
		System.out.println(str.equals(str1));
		
		// java is case sensitive if i change the upper string one letter to upper case the result will be wrong.
		
		System.out.println(str2.equals(str1));
		
		System.out.println(str2.equalsIgnoreCase(str3)); // in here i asked java to ignore the case the result became true.
		
		System.out.println(str.substring(0 , 9));
		
		
		String x = "       hello world         ";
		
		System.out.println(x);

		System.out.println(x.trim()); //the method "trim" removes unnecessary spaces and makes our print out result looks good.
		
		String date = "03-20-1990"; // im going to replace the dashes with slashes.
		
		System.out.println(date.replace("-" , "/"));
		
		
		//Split => using this method im going to split a String in to  different pieces and store them in a array.
		
		String test = "hello_world_test_string";
		
	String testValue[] = test.split("_");
	
	for(int i = 0; i < testValue.length; i++) {
		System.out.println(testValue[i]);
	}
		System.out.println("__________________________________");		
		
		
		// extra practice:
		
	String date1= "01-01-2019";
	System.out.println(date1.replace("-", "/"));
	
	
	
String jahana = "jahana is our team leader ";
String julia = " Jahana is Our team leader";
	
	System.out.println(jahana.toUpperCase().charAt(0) + jahana.substring(1, jahana.length()));
	
	
	System.out.println(jahana.replace("i", "I"));
	
	System.out.println(jahana.length());
	
	System.out.println(jahana.equals(julia));
	
	System.out.println(jahana.equalsIgnoreCase(julia));
		
	System.out.println(jahana.trim().equalsIgnoreCase(julia.trim()));	
		
		
		
		System.out.println(jahana.replace(" ", ""));  // removed spaces:
		
		System.out.println(jahana.substring(5, jahana.length()));
		
		System.out.println(julia.substring(0, 11));
		
		
		
		System.out.println(julia.indexOf("Our"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
