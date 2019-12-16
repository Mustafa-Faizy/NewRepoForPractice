package Java_Project1;



public class Runner {

	public static void main(String[] args) {

	
	
	
	Car car1 = new Car(true, 65, 1.5, "Davood", "Corrolla", "Toyota", "LE", 180, 2019);
		
	
	   
	System.out.println(car1);
	

	 System.out.println("\n_____________ Speed Up method__________________\n");
	 
	   car1.speedUp(9);
	   System.out.println(car1.toString());
	   
	   
	

	
	
	   System.out.println("\n_____________ Break Abit method__________________\n");
	   
	car1.breakAbit();

	System.out.println("Break abit=> " +car1);	
	
	
	System.out.println("\n_____________ Break method__________________\n");

	car1.Break();
		System.out.println("Break=> "+car1);
		
		
		System.out.println("\n_____________ Start Engine method__________________\n");
			
	car1.StartEngine();
	
	System.out.println("Engine is on=> "+car1);
	
	
	System.out.println("\n_____________ Off Engine method__________________\n");
	car1.OffEngine();
	System.out.println("Engine is off=> "+car1);
	System.out.println("________________\n");

	
		
		Highway hw30 = new Highway("Highway 30", 70, 50);
		Highway hw20 = new Highway("Highway 20", 75, 60);
		Highway hw35 = new Highway("Highway 35", 80, 70);
		Highway hw820 = new Highway("Highway 820", 55, 50);
		Highway hw360 = new Highway("Highway 360", 65, 60);
	
		
	
		
		
		Car car001 = new Car(true, 70, 1.2, "Muhib", "Civic", "Honda", "Sedan", 220, 2009);
		Car car002 = new Car(false, 0, 1.5, "Mustafa", "Audi", "German", "Sport", 380, 2019);
		Car car003 = new Car(true, 47, 1.9, "Jack", "Benz", "German", "Sport", 380, 2019);
		Car car004 = new Car(false, 0, 2.1, "David", "Corrola", "Toyota", "Sedan", 140, 2019);
		Car car005 = new Car(true, 70, 1.5, "Homayoon", "Corrola", "Toyota", "sedan", 110,1970);
		Car car006 = new Car(false, 0, 2.5, "Tariq", "Townace", "Japan", "van", 115, 1989);
		Car car007 = new Car(true, 90, 1.9, "Naghma", "BMW", "German", "Sport", 180, 1990);
		Car car008 = new Car(true, 20, 1.5, "Rocky", "Mustang", "American", "Sport", 280, 2019);
		Car car009 = new Car(true, 73, 1.5, "Boby", "Lexus", "Toyota", "Sport", 210, 2019);
		Car car010 = new Car(true, 49, 1.5, "Jessica", "Audi", "German", "Sport", 380, 2019);
		
		
		
		
		
		
		 hw30.addCarToTheHighway(car001);
		   hw30.addCarToTheHighway(car002);
		   hw30.addCarToTheHighway(car003);
		   hw30.addCarToTheHighway(car004);
		   hw30.addCarToTheHighway(car005);
		   hw30.addCarToTheHighway(car006);
		   hw30.addCarToTheHighway(car007);
		   hw30.addCarToTheHighway(car008);
		   hw30.addCarToTheHighway(car009);
		   hw30.addCarToTheHighway(car010);

		   
		  
		   for(Car x: hw30.getListOfCarsAboveSpeed())
		System.out.println("Car above Speed=> "+x.toString());
		
		   System.out.println("______________________________");
	
		   for (Car j: hw30.getListOfCarsBellowSpeed())
			   System.out.println("Car below Speed=> "+j.toString());

		   System.out.println("______________________________");
		   
		   for(Car i: hw30.getListOfCarsStoppedOnHighway()){
			   System.out.println("Car Stopped=> "+i.toString());
		   }
		   
		   
		   hw30.removeCarFromHighway(car001);
		   System.out.println(hw30.getListOfCarsOnRoad());
			 
		   
		   
		   
		   
		   System.out.println("\n________Class Bike________\n");
		   
		   
		  Bike bike001 = new Bike(65, "Muhib", "Suzuki", "German", "Faster", 160, 2009);
	
		  bike001.breakAbit();
		   System.out.println(bike001.toString());
		   
		  
			  bike001.Break();
		   System.out.println(bike001.toString());
		   
		 
		   System.out.println("\n________Class Sedan________\n");
		   
		   Sedan sedan001 = new Sedan(true, 75, 2.1, "Lee", "Cadillac", "Cadillac", "STS", 210, 2011);
		   
		   sedan001.breakAbit();
		   System.out.println(sedan001.toString());
		   
		   
		   System.out.println("\n________Class SUV________\n");
		   
		   SUV suv001 = new SUV(true, 80, 2.4, "Rafi", "Infinity", "Nissan", "FZ30", 220, 2019);
		   suv001.breakAbit();
		   System.out.println(suv001.toString());
		   
		   
		   System.out.println("\n________Class Truck________\n");
		   
		   Truck truck001 = new Truck(true, 70, 2.9, "Joe", "Chevy", "Cheverolet", "F150", 200, 2013);
		   truck001.breakAbit();
		   System.out.println(truck001.toString());
		   
		   
		   
		   
		   System.out.println("\n_______________Class Person_________________\n");
		   
		   Person p1 = new Person("Bruce", "Lee", "China", 12345678, 63);
		   
		   System.out.println(p1);
		   
		   
		  
		   
	
	}

}
