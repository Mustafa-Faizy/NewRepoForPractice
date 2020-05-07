package moc_Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Moc_Interview {

	
	
	static {
		System.out.println("==> hello"); // we can print with using main method. by using static block
	}
	
	
	
	
	public static void main(String[] args) {
		

		// Array and ArrayList
		
		String name [][] = new String [1][1];
		
		name [0][0]= "john";
		
		System.out.println(name[0][0]);
		
		
		
		
		
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("book");
		arr.add("sanam");
		
		System.out.println(arr.get(0));
		
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		
		arr1.add(1);
		arr1.add(7);
		//arr1.clear(); // it clears the whole list
		
		arr1.remove(1); // this one we can remove the index that we want
		
		System.out.println(arr1.get(0));
		
		
		
		
		
		
		
		
		// Array List and Hash Set
		
		Set <Integer> set = new HashSet <Integer>();
		
		set.add(4);
		set.add(7);
		set.add(9);
		set.add(4);
		
		
//		 Iterator<Integer> it = set.iterator();
//	     while(it.hasNext()){
//	     System.out.println(it.next());
//	     }
		
		
		for(Integer pointer: set) {
			
			System.out.println(pointer);
		}
		
		
		
		
	
		
		
		// Swapping numbers with out temporary variables.
		
		int a = 10;
		int b = 20;
		
		a = a + b; // a = 30
		
		b = a - b; // b = 10
		
		a = a - b; // a = 20
		
		System.out.println("A Value ==> " + a);
		System.out.println("B Value ==> " + b);
		
		
		
		// Swapping String
		
		String x = "Hello";
		String y = "World";
		
		x = x + y; // x = HelloWorld
		
		y = x.substring(0,(x).length()-y.length());
		
		x = x.substring(y.length());
		
		System.out.println("X Value ==> " + x);
		System.out.println("Y Value ==> " + y);
		
		
		
		
		
		
		//Find out how many alphabet characters present in a string?
		
		String given="wefeqf878979797fewfewrf879797efds&^&^*^*^";
		
		String replaced=given.replaceAll("[a-zA-Z]", "");
		
		int alphaChar=given.length()-replaced.length();
		
		System.out.println("==>" + alphaChar);

		
		
		
		
		//How to find whether given number is odd number?
		
		
		int z = 22;
		
		
		if(z % 2 != 0) {   // != this sign mean not equal
			System.out.println(z + "is an odd number");	
		}
		else {
			System.out.println(z + "is not odd number");
		}
		
		
		
		
		//How to find out the part of the string from a string? What is substring? Find number of words in string?
		
		String s = "you made it to Tek School interview sesssion";
		
		System.out.println(s.substring(20));
		
		System.out.println(s.length());

		
		String [] words = s.split(" "); // here i splited the sentence using String calls method "SPLIT" and store it in Array 
		
		
		for(String abc: words) {      // here i loop through that Array and print them in 
			System.out.println(abc);
		}
		
		
		
		
		//Write java program to reverse String? Reverse integer?
		
		
		
		int i = 123456789;
		
		String number = String.valueOf(i);
		
		StringBuffer revers = new StringBuffer(number);
		
		System.out.println(revers.reverse());
		
		
		
		String r = "HelloWorld";
		
		StringBuffer sb = new StringBuffer(r);
		
		System.out.println(sb.reverse());
		
		
		
		
		//Write a program to sort array in ascending order?
		
		
		
//		int []array = new int[4];
//		
//		array [0] = 12;
//		array [1] = 24;
//		array [2] = 2;
//		array [3] = 1;
		
		
	int [] array = {12,24,2,4,1};
	
	Arrays.sort(array);
		
	System.out.println(Arrays.toString(array));
		
		
	//Converting String to an Array	
		
		
	String con = "TekSchool";
	
	char [] challenge = con.toCharArray();
	
	for(int j = 0; j < challenge.length; j++) {
		
		System.out.println(challenge[j]);
	}
		
		
		
	//Converting Array to String
	
	
	System.out.println(Arrays.toString(challenge));
	
	
	
	
	
	

    // Let us create different types of arrays and 
    // print their contents using Arrays.toString() 
    boolean[] boolArr = new boolean[] { true, true, false, true }; 
        
    char[] charArr  = new char[] { 'g', 'e', 'e', 'k', 's' };
        
    double[] dblArr  = new double[] { 1, 2, 3, 4 };
        
    int[] intArr = new int[] { 1, 2, 3, 4 }; 
        
    Object[] objArr = new Object[] { 1, 2, 3, 4 };
         

    System.out.println("Boolean Array: "+ Arrays.toString(boolArr));
        
         
    System.out.println("Character Array: "+ Arrays.toString(charArr));
             
         
    System.out.println("Double Array: "+ Arrays.toString(dblArr)); 
    
    System.out.println("Integer Array: "+ Arrays.toString(intArr)); 
    
    System.out.println("Object Array: "+ Arrays.toString(objArr));
	
	
	
	
	//Verify whether given two strings are equal?
    
    String eq = " Hello";
    String eq1 = "Hello ";
    
    if(eq.trim().equals(eq1.trim())) {
    	System.out.println(eq +" and "+ eq1 + " are eaqual");
    }
	
    else {
    	System.out.println(eq +" and "+ eq1 + " are not eaqual");
    }
	
	
	
	
	//second way to find out
	
	if(eq.trim().compareTo(eq1)==0) {
		System.out.println(eq +" and "+ eq1 + " are eaqual");
	}
	
	else {
		System.out.println(eq +" and "+ eq1 + " are not eaqual");
	}
	
	
	
	
	
	//What is the output for this program?
	
	for (int k = 0; k < 3; k++) {
		for (int j = 3; j >= 0; j--) {
		if (k == j) 
		continue;
		System.out.println(k + " " + j);
		}
		
	}
	
	
	//Here is the arrayList, how can I remove all duplicates from it?
	
	
	List<String> list = new ArrayList<String>();
	
	list.add("Mohib");
	list.add("Muhib");
	list.add("Rafi");
	list.add("Murtaza");
	list.add("Rafi");
	
	Set<String> hash = new HashSet<String>();
	
	for(int o = 0; o < list.size(); o++) {
		
		hash.add(list.get(o));
		
	}
		System.out.println(hash);
		
		
	
	
	
	
	// my fucking interview question
	
//	String date = "02/02/2020";
//	
//	String abc = date.replaceAll("/", "");
//	
//	StringBuffer str = new StringBuffer(abc);
//	
//	str.reverse().toString();
//	
//	String chall = abc.e

		

	

	


	
	
		
		
		
		
		
		
		
		
		
	}

}
