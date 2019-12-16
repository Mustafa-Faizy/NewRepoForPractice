package OOP_Exersise1;

public class RoadManagementSystem {

	public static void main(String[] args) {
	
		
		HighWay hw30 = new HighWay("Highway 30", 65);
        HighWay hw20 = new HighWay("Highway 20", 70);
        
        
        Car car001 = new Car("Acura", "TL", "Black", "Sedan", "Mustafa", 2017, 1, 90);
        Car car002 = new Car("Toyota", "Lexus", "White", "FX", "Jack", 2019, 3, 65);
        
        
        hw30.addlistOfCars(car001);
        hw30.addlistOfCars(car002);
		
		
		
		for (Car c: hw30.getCarsOverSpeed()) {
			System.out.println("This driver: "+c.getowner() +" Driving "+ c.getcolor()+" "+ c.getmake()+" "+c.getmodel()
			 +" "+c.gettype() +" "+c.getyear() +" With "+c.getpassengers()	+" passenger in it with speed of "+c.getcurrentSpeed()
			 + " m/ph all units stay alert! stop him if he is speeding?");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		

	}

}
