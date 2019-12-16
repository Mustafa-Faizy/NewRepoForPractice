package Interview_Question;

public class JavaQuestion_Min_Max {

	public static void main(String[] args) {
		
		// we are finding the MIN and MAX numbers in the list.
		
		
		int data[] = { -1, -20, -354, 20 };

		int min = data[0];
		int max = data[0];
		int ave = 0;
		int sum = 0;

		for (int i : data) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
			sum += i;
			
		}
		ave = sum / data.length;
		
		
		System.out.println(min);
		System.out.println(max);
		System.out.println(sum);
		System.out.println(ave);
		
		
		//You can also use the class Math
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
