import java.util.ArrayList;

public class JavaBasics_ArrayList {

	public static void main(String[] args) {

		
		ArrayList <String> firstList = new ArrayList <String>();
		
		firstList.add ("Ahmad");
		firstList.add("Zidan");
		firstList.add("David");
		firstList.add("Jump in the Cadilac and put some miles on it");
		firstList.add("Hello world");
		firstList.add("Shake it");
		System.out.println(firstList.size());
		
		System.out.println("\n" + firstList.get(3) + "\n");
		
		System.out.println("******while loop******");
		int x = 0;
		
		while (x < firstList.size()) {
			System.out.println(x++);
		}
		
		System.out.println("******Do While Loop******\n");
		int y = 0;
		do {
		System.out.println(y++);
		}
		while (y < firstList.size());
		
		System.out.println("******for loop******\n");
		
		for (int i = 0; i <firstList.size(); i++) {
			System.out.println( firstList.get(i));
		}
		
		System.out.println("____________________________\n");
		
		firstList.remove(5);
		firstList.remove(2);
		firstList.remove(3);
		
		for(String shakeIt : firstList) {
		System.out.println(shakeIt);	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
