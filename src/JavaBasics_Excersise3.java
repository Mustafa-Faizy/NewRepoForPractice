
public class JavaBasics_Excersise3 {

	public static void main(String[] args) {
	// Create arrays of int.
		
		int table [][] = new int [4][5];
		table [0][0] = 1;
		table [0][1] = 2;
		table [0][2] = 3;
		table [0][3] = 5;
		table [0][4] = 7;

		
		table [1][0] = 23;
		table [1][1] = 25;
		table [1][2] = 3;
		table [1][3] = 5;
		table [1][4] = 45;
		
		
		table [2][0] = 37;
		table [2][1] = 26;
		table [2][2] = 7;
		table [2][3] = 90;
		table [2][4]= 65;
		
		
		table [3][0] = 3;
		table [3][1] = 7;
		table [3][2] = 87;
		table [3][3] = 29;
		table [3][4] = 31;
		System.out.println(table.length);  // we have four rows in this array.
		System.out.println(table[0].length);  // we have five columns in this array.
	System.out.println("_____________________________________________");

	    for (int i = 0; i<table.length ; i++) {      // static variable (length key word) applied here.
	    	
	            for (int j=0; j<table[i]. length; j++) {
	          
	                System.out.print(table [i][j] + " ");	              
	            }
	            System.out.println();
	    }
	   	System.out.println("\n\n*********************************");	
		
	for (int x = 0; x <4; x++){
		for(int y = 0; y< 5; y++){
			System.out.print(table[x][y] + " ");
		}
		System.out.println();
	}
System.out.println("\n\n*****************************");
		
		String score [][] = {{ "Ronaldo" , "650" , "2008" , "Retired" } , 
				             { "Zidan" , "700" , "2006" , "Real Madrid" } ,
				             {" Raul" , "450" , "2011" , "Real Madrid"} ,
				             {"Iniesta" , "180" , "Still Playing" , "China"}
				             };
		
	for(int row =0; row<score.length; row++){

   for (int col = 0; col <score[row].length; col++) {     // length key word applied here as well.
	   System.out.print(score [row] [col] + " ");
   }
		
System.out.println();
		
	}
	
	
		
		
		
		
		
}
}