package myPracticeMarch2020;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public abstract class InterviewPractice {
	
	
	
	public abstract void abc();
		

	
	public static void main(String[] args) {
		
		
		ArrayList<Object> rL = new ArrayList<Object>();
		
		rL.add("Mohammad");
		rL.add(1990);
		rL.add("m.faiy@yahoo.com");
				
		for(int i = 0; i< rL.size();i++) {
			System.out.println(rL.get(i));
			
		}
		
		
		
		
	
		
		
		Set<Object> set = new HashSet<Object>();
		
		set.add("Mustafa");
		set.add(817653);
		set.add("Boca Raton");
		
		
		
		
		System.out.println(set);
		
		
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	

}
