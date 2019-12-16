
public class JavaBasics {

	public static void main(String[] args) {
	
		
		//Exercise 1
//      Create an int with identifier “sales” assign the value 200
//      Create an int with identifier “cost” assign the value 85
//      Create an int with identifier “profit” calculate the profit based on sales and cost
//      Create String with identifier “The profit of the sales we had this far is <profit>
//      Run the code and make sure it works

		
		int sales = 200;
		int cost = 85;
		int profit = sales - cost;
		String result = "the profit we have so far" + profit;
		System.out.println(result);
		
		
		// Concatenation 
		
		int a = 10;
		int b = 15;
		String result1 = a+  " + " + b + " = " + a+b;
		System.out.println(result1);
		
		int c = 15;
		int d = 15;
		String  result2 = c+ " + " + d + " = " + (c+d);
		System.out.println(result2);
		
		// Addition
		double f = 10.5;
		double j = 5;	
		double sum = f+j;
		System.out.println(f+j);
		
		// Multiplication
		double q = 5.5;
		double h = 9.1;
		double mult = q*h;
		System.out.println(q*h);
		
		// Division
		double u = 1.5;
		double o = 3.9;
		double div = u/o;
		System.out.println(u/o);
		
		// Subtraction 
		double p = 2.7;
		double s = 3.6;
		double sub = p-s;
		System.out.println(p-s);
		
		
		// Escape Sequences
		
		String escape = "\t\t I was trying to \"Run away\" from the \n\t "
				+ "the people who were anoying";
				
				System.out.println(escape);
		
		
	}

}















