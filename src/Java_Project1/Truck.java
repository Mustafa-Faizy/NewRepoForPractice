package Java_Project1;

public class Truck extends Car{
	
	
	
	public Truck() {
		super();
	}
	
	
	
	public Truck(boolean engineStatus, int currentSpeed, double mpg, String owner, String name,String make, String model, int maxSpeed,int year) {
		super(engineStatus, currentSpeed, mpg, owner, name, make, model, maxSpeed, year);
	}
	
	
	
	
	

	
	

	@Override
	public String toString() {
	
		return "engine ststuse= "+ getEngineStatus()+ " Current Speed= "+getCurrentSpeed() +" Mile per Gallon= "+ getMpg()+ " Owner= "+ getOwner()+ " Name= "+getName()
		+" Make= "+getMake()+" Model= "+getModel()+" Max Speed= "+getMaxSpeed()+" Year= "+getYear();
		
		
	}
	
	
	
	

	public void breakAbit() {
		currentSpeed  -=4;
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
