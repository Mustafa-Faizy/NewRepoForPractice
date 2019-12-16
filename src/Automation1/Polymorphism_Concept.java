package Automation1;


import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Polymorphism_Concept {

	public static void main(String[] args) {
		
		
		
		
		Map<Integer, String> poly = new HashMap<Integer, String>();
		
		poly.put(1, "Richmond");
		poly.put(2, "Dallas");
		poly.put(3, "Arlington");
		
		
		System.out.println(poly);
		
		
		System.out.println(poly.get(3));

		System.out.println("\n___________\n");
		
		
		
		
		
		
		
	Set<String>	set = new HashSet<String>();
	
	set.add("this");
	set.add("is");
	set.add("what");
	set.add("this");
	
		System.out.println(set);            // no dublicate value is allowed.
	System.out.println(set.add("this"));
		
	for(String y: set) {
		System.out.println(y);
	}
	
		
		
	
	List<Integer> list = new LinkedList<Integer>();
	
	list.add(20);
	list.add(30);
	list.add(50);
	
	System.out.println(list);
	
	for(int x: list) {
		System.out.println(x);
	}
	
	
	System.out.println("\n___________\n");
	
	
    String name = "MUSTAFAFAIZY";
	
	char arr[] = name.toCharArray();
	
	
	for (int i = 0; i <  arr.length; i ++) {
		
		
		for (int j = 0; j < i; j++) {
			System.out.print("      "+arr[j]);
		}
	System.out.println("      "+arr[i]);
	}
	
	
	
	

	for(int i = arr.length-1; i>=0; i--){
		
		for(int j = arr.length-1; j>i; j--) {
			System.out.print(arr[j]);
		}
		System.out.println(arr[i]);
	}
	
	
	
	
	
	
	
	
	
	
	

for (int i = 1; i < 10; i++) {
	
	for(int j = 1; j<i; j++) {
		System.out.print(j);
	}
	System.out.println(i);
}
	
	
	
	for(int x = 9; x >= 1; x--) {
		
		for(int y = 9; y > x; y--) {
			System.out.print(y);
		}
		System.out.println(x);
	}
	
	














	
	
	
	
		
	}

}
