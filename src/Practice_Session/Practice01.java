package Practice_Session;

import java.util.ArrayList;

public class Practice01 {

	public static void main(String[] args) {
	
		
		ArrayList<String> arr1 = new ArrayList<String>();
		
		arr1.add("Item 1");
		arr1.add("Item 2");
		arr1.add("Item 3");
	
		for(String i:arr1) {
			System.out.println(i);
		}
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("2 Item 1");
		arr2.add("2 Item 2");
		arr2.add("2 Item 3");
		
		
		arr1.addAll(arr2);
		
		System.out.println("here im printing the both Arrays togather");
		
		for(String j:arr1) {      // in loop we have to use the first ArryLIst identifier.
			System.out.println(j);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
