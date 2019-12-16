package Java_Project1;

public class Bike extends Vehicle {

	private int currentSpeed;
	
	
	public Bike() {
		super();
	currentSpeed = 0;
	}
	
	
	
	public Bike(int currnetSpeed,String owner,String name, String make,String model, int maxSpeed, int year) {
		super(owner, name, make, model, maxSpeed, year);
		this.currentSpeed = currnetSpeed;
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
	
		return "Current Speed=> "+ currentSpeed + " Owner=> "+ getOwner()+ " Name=> "+getName()
		+" Make=> "+getMake()+" Model=> "+getModel()+" Max Speed=> "+getMaxSpeed()+" Year=> "+getYear();
	}
		
	

	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	
	
	
	public void breakAbit() {
		 currentSpeed -=2;
	}
	
	
	
	
	
public void Break() {
		
		 currentSpeed = 0;

	}
	
	
	


	
	
	
	
	
	
	
	
	
	
	
}
