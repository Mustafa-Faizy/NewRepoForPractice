package Java_Project1;

public class Car extends Vehicle {

	

	
	
	private boolean engineStatus;
	protected int currentSpeed;
	private double mpg;
	
	
	
	
	public Car() {
		super();
		engineStatus = false;
		currentSpeed = 0;
		mpg = 0.0;
		
	}
	
	
	
	public Car(boolean engineStatus, int currentSpeed, double mpg, String owner, String name,String make, String model, int maxSpeed,int year) {
		super(owner, name, make, model, maxSpeed, year);
		
		this.engineStatus = engineStatus;
		this.currentSpeed = currentSpeed;
		this.mpg = mpg;
	}
	
	
	
	
	public boolean getEngineStatus() {
		return engineStatus;
	}
	
	
	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus; 
	}
	
	
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	
	
	
	public double getMpg() {
		return mpg;
	}
	
	public void setMpg(double mpg) {
		this.mpg = mpg;
	}
	
	
	
	

public String getName () {
    return super.getName();
}

public void setName (String name) {
    super.setName(name);
}


public String getMake () {
    return super.getMake();
}

public void setMake (String make) {
 super.setMake(make);
}


public String getModel () {
    return super.getModel();
}

public void setModel (String model) {
    super.setModel(model);
}


public int getMaxSpeed () {
    return super.getMaxSpeed();
}

public void setMaxSpeed (int maxSpeed) {
    super.setMaxSpeed(maxSpeed);
}


public int getYear () {
    return super.getYear();
}

public void setYear (int year) {
    super.setYear(year);
}


public String getOwner () {
    return super.getOwner();
}
public void setOwner (String owner) {
	super.setOwner(owner);
}
	
	
	
	
	
	
	@Override
	public String toString() {
	
		return "engine ststuse= "+engineStatus+ " Current Speed= "+currentSpeed +" Mile per Gallon= "+ mpg+ " Owner= "+ getOwner()+ " Name= "+getName()
		+" Make= "+getMake()+" Model= "+getModel()+" Max Speed= "+getMaxSpeed()+" Year= "+getYear();
		
		
	}
	
	
	
	
	
	
	public void breakAbit() {
		currentSpeed  -=5;
	}
		
		
		
	

	public void Break() {
		
		currentSpeed = 0;

	}
	
	
	public void StartEngine() {
		 engineStatus = true;
	}
	
	
	
	public void OffEngine () {
		engineStatus = false;
		 currentSpeed = 0;
	}
	
	
//
//    public void speedUp(int x) {
//    	currentSpeed = currentSpeed + x;
//    }
//	
	// or 
    public void speedUp(int x) {   // both way the method works.
    	currentSpeed += x;
    }
	
	
	
	
	
}
