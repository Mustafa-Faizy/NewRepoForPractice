package Automation1;

public class TwoDimenssionArrray {

	public static void main(String[] args) {
		
		
		String name [][] = new String [3][4];
		
		name[0][0] = "Mohib";
		name[0][1] = "Jahana";
		name[0][2] = "GulSannat";
		name[0][3] = "Mustafa";
		
		
		name[1][0] = "Bahar";
		name[1][1] = "Julia";
		name[1][2] = "Jack";
		name[1][3] = "Rahim";
		
		
		name[2][0] = "Hamida";
		name[2][1] = "Shaeqa";
		name[2][2] = "Homa";
		name[2][3] = "Rahima";
		
		
		//System.out.println(name[2][3]+name[0][1] );
		
		
		for(int i = 0; i < name.length; i++) {
			for(int j = 0; j < name[i].length; j++) {	
				System.out.println(name[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
