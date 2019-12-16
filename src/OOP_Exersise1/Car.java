package OOP_Exersise1;

import java.util.ArrayList;

public class Car {

	private String make;
	private String model;
	private String color;
	private String type;
	private String owner;
	private int year;
	private int passengers;
	private double currentSpeed;
	
	
	public Car(String make, String model, String color, String type, String owner, int year, int passengers, double currentSpeed) {
		
		this.make = make;
		this.model = model;
		this.color = color;
		this.type = type;
		this.owner = owner;
		this.year = year;
		this.passengers = passengers;
		this.currentSpeed = currentSpeed;
	
	}
	
	
	
	public String getmake() {
		return make;
	 }
	 public void setmake(String make) {
		 this.make = make;
	 }
	
	
	 
	 public String getmodel() {
		 return model;
	 }
	
	 public void setmodel(String model) {
		 this.model = model;
	 }

	
	 
	 
	 public String getcolor() {
		 return color;
	 }
	 
	 public void setcolor(String color) {
		 this.color = color;
	 }
	 
	 
	 
	 
	 public String gettype() {
		 return type;
	 }
	
	public void settype(String type) {
		this.type = type;
	}
	
	
	
	
	public String getowner() {
		return owner;
	}
	 
	 public void setowner(String owner) {
		 this.owner = owner;
	 }
	 
	 
	 
	 public int getyear() {
		 return year;
	 }
	 
	 public void setyear(int year) {
		 this.year = year;
	 }
	 
	 
	 
	 public int getpassengers() {
		 return passengers;
	 }
	 
	 public void setpassengers(int passengers) {
		 this.passengers = passengers;
	 }
	 
	 
	 
	 
	public double getcurrentSpeed() {
		return currentSpeed;
	} 
	 
	 public void setcurrentSpeed(double currentSpeed) {
		 this.currentSpeed = currentSpeed;
	 }
	 
	 
	
		
	
	
	
	
	
}
