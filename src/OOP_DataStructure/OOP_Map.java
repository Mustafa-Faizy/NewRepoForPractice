package OOP_DataStructure;

import java.util.HashMap;
import java.util.Map;

public class OOP_Map {
	
public static void main(String[] args) {
	
	
	Map<String, String> testMap = new HashMap<String, String>();
	
	
	testMap.put("City", "Alexanderia");
	testMap.put("City", "Fort Worth");  // here it will print FW coz setting the value of  index to the one that is using same KEY.s 
	testMap.put("City2", "Arlington");
	
	
	System.out.println(testMap);
	
	System.out.println("\n___________________\n");
	
	Map<Integer, String> testMap2 = new HashMap<Integer, String>();
	
	testMap2.put(1, "Alexanderia");
	testMap2.put(2, "Fort Worth");
	testMap2.put(3, "Arlington");
	testMap2.put(3, "Dallas");
	
	System.out.println(testMap2);
	
	System.out.println("\n___________________\n");
	
	System.out.println(testMap2.get(3));
	
	
	
   }

}
