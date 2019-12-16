
public class JavaBasics_WrapperClasses {

	public static void main(String[] args) {
	
		// primitive data type = int
		// wrapper class = Integer
		
		String x = "123";
		String y = "456";
		System.out.println(x+y); // to add them i have to use wrapper class and convert them to Integer to be able to add them.
		
		System.out.println(Integer.valueOf(x) + Integer.valueOf(y));// i used the wrapper class Integer and call method on it add them.
		
		
		String f = "123";
		String g = "456.25";
		
		System.out.println(Integer.valueOf(f) + Double.valueOf(g)); // using Double wrapper class.
		
		
		
		
	}

}
