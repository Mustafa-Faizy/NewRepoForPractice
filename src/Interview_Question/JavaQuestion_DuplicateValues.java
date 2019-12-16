package Interview_Question;

import java.util.HashSet;
import java.util.Set;

public class JavaQuestion_DuplicateValues {

	public static void main(String[] args) {
		
		// finding duplicate values using two ways to find them.
		

		String data[] = { "Test", "Data", "IS", "Only", "Test", "DATA", "Data" };

		// using method equals

 		                              // using loop is less efficiant coz comlixity of code. ( O(n2) big O and nsquar.
		for (int i = 0; i < data.length; i++) {
			for (int j = i + 1; j < data.length; j++) {
				if (data[i].equals(data[j])) {
					System.out.println("there is a duplicate value: " + data[i] + " values are in index " + i + " " + j);
		
				}
			}

		}

		
		//using a hashSet
		System.out.println("\nUsing HashSet");               // this is the effeciant way of doing that.
		
		Set<String> checkingForDup = new HashSet<String>();
		for (String s : data) {
			if(checkingForDup.add(s)== false) {
				System.out.println(s + " is duplicate");
			}
		}
		
		
		

	}

}
