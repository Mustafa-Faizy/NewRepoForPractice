package Automation1;

public class If_Statement {

	
	// if car 2012 cheap
	// if car 2015 expensive
	// other than that fair
	
	
	
	
	
	public void carPrice(int maxCost, int minCost) {
		
		if(maxCost > 10000) {
			System.out.println("These cars are expensive:");
		}
		else if(minCost <= 10000) {
			System.out.println("These cars are cheap:");
		}
		else if(maxCost > 20000 && minCost < 5000) {
			System.out.println("These cars are unfair:");
		}
		else {
			System.out.println("I just siad otherwise it depends on you!");
		}
	}
	
	
	

	
	
	
	
	
	public static void main(String[] args) {
	
		
	If_Statement advise = new If_Statement();
	
	advise.carPrice(500, 9000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
