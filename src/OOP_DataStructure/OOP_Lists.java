package OOP_DataStructure;

import java.util.ArrayList;
import java.util.LinkedList;

public class OOP_Lists {

public static void main(String[] args) {
	

	// How to copy an array?
	
String [] data = {"A" , "B" , "3", "4"};

String [] newData = {"" , "" , "" , "" ,}; //<= hard coded  //new String[data.length];<= dynamic coded.
	
	for(int i = 0; i < data.length; i++) {  // here "i" looped through the data array.
		newData[i] = data[i];  // when "i" is zero index zero of newData is equal to index zero of data and so on...
		System.out.println(newData[i] + "newData print out");
	}
	

	data = null;
	
	
	// Creating link list
	
	LinkedList<String> firstLinkedListCreated = new LinkedList<String>();// its working just like ArrayList the methods and most of things.s
	
	firstLinkedListCreated.add("first element");
	firstLinkedListCreated.add("second element");
	
	System.out.println(firstLinkedListCreated.getLast() + "this is last element");
	
	
	
	for(String i: firstLinkedListCreated) {
		
		System.out.println(i);
	}
	
	
	System.out.println("_________________________");
	
	for(int i = 0; i< firstLinkedListCreated.size(); i++) {  // i just created the for loop to see it.
		
		System.out.println(firstLinkedListCreated.get(i));
	}
	
	
	
	System.out.println("_________________________");
	
	
	ArrayList<String> secondList = new ArrayList<String>();
	secondList.add("BOO");
	
	
	secondList.addAll(firstLinkedListCreated);
	
	for(String j: secondList) {
		
		System.out.println(j);
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
	
}
