package Automation;

import java.util.ArrayList;

public class My_ArrayList {

	public static void main(String[] args) {
	
		ArrayList <String> shoping = new ArrayList<String>();
		
		shoping.add("jeans");
		shoping.add("iphone");
		shoping.add("pants");
		shoping.add("socks");
		shoping.add("shoes");
		shoping.add("shirt");
		
		System.out.println(shoping.size());
		
		
		for (int i = 0; i < shoping.size(); i++) {
			System.out.println(i+1 + " " + shoping.get(i));
		}
		
		System.out.println("\n*******Remove Method******");
		
		shoping.remove(2);
		shoping.remove(4);
		shoping.remove(3);
	
		for (String x : shoping) {
			System.out.println(x.toUpperCase().charAt(0) + x.substring(1 ,x.length()));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
