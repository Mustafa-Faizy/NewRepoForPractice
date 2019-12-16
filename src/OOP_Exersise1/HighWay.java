package OOP_Exersise1;

import java.util.ArrayList;

public class HighWay {

private String hName;
private int speedLimit;
private ArrayList<Car> listOfCars;




public HighWay (String hName, int speedLimit, ArrayList<Car>listOfCars) {
	
	this.hName = hName;
	this.speedLimit = speedLimit;
	this.listOfCars = listOfCars;
	
}

// this is the third constructor that i dont know need to watch the videos in my phone. video before the pic in phone.
public HighWay(String name, int speedLimit) {
	this.hName = name;
	this.speedLimit = speedLimit;
	listOfCars = new ArrayList<Car>();
}





	
	public String gethName() {
		return hName;
	}
	
	public void sethName(String hName) {
		this.hName = hName;
	}
	
	
	
	public int getspeedLimit() {
		return speedLimit;
	}
	
	public void setspeedLimit(int speedLimit) {
		this.speedLimit = speedLimit;
	}
	
	
	
	public ArrayList<Car> getlistOfCars(){
		return listOfCars;
		
	}
	
	public void setlistOfCars(ArrayList<Car> listOfCars) {
		this.listOfCars = listOfCars;
	}
	
	
	
	
	
	public void addlistOfCars(Car newCar) {
		listOfCars.add(newCar);
	}
	
	
	
	
	
	

	public ArrayList<Car> getCarsOverSpeed(){
		ArrayList<Car> overSpeed = new ArrayList<Car>();
		
		for (Car c : listOfCars) {
			if(c.getcurrentSpeed() > speedLimit) {
				overSpeed.add(c);
			}
		}
	
		return overSpeed;
	
	}
	
	
	
	
	
	
}
