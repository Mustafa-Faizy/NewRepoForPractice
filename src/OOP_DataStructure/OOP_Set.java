package OOP_DataStructure;

import java.util.HashSet;
import java.util.Set;

public class OOP_Set {

	public static void main(String[] args) {
		

		
		
 Set<String> testHashSet = new HashSet<String>();
 
 testHashSet.add("test");
 testHashSet.add("Is");
 testHashSet.add("What");
 testHashSet.add("I Do");
 testHashSet.add("test");
		
	System.out.println(testHashSet);	// the order of out put is not guaranteed.
										// it doesnt take duplicate value as you see in consul.
										// the out put is based on boolean.
	
	
	System.out.println(testHashSet.add("test"));// here i tried to print the duplicate value it printed false.	
		
	System.out.println(testHashSet.add("test1")); // here i changed the value it prints true.
		
		System.out.println("\n____________________\n");
		
		for(String i: testHashSet) {
			System.out.println(i);
		}
		
		
		

	}

}
