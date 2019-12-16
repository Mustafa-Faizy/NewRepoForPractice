
package OOP_Exersise3;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
	
		
		Dog d1 = new Dog("white", 5, true);
		Dog d2 = new Dog("Snow", 2, true);
        Dog d3 = new Dog("Doggy", 7, false);
        
        ArrayList<Animal> myDogs = new ArrayList<Animal>();// i used the data of parrent class in my ArrayList. now i can add the objects of deffirent 
        												// child to this list coz all the childs classes are inheritying from parent class.
        
        myDogs.add(d1);  // this is one way adding dogs to array list.
        myDogs.add(d2);
        myDogs.add(d3);
        
        myDogs.add(new Dog("Hausky", 9, true)); // this is another way of adding them in array list by calling the constructor method of the class 
        myDogs.add(new Cat("Noisy", 3, false));										// inside the add parenteces call the constructor method.
      //  myDogs.add(new Bird("Singer", 1, false, true));
        
        for(Animal i: myDogs) {
        	System.out.println(i.getName()+ i.getAge()+ i.getSleepy()); 
        }
        
        System.out.println("____________________________");
        
        Cat obj = new Cat("GoodCat", 3, true); // i overrided to Sttign in here i created the method in Cat class.
        
        System.out.println(obj.toString());
        
        
        
        System.out.println("My dog " +d1.getName()+ " "+d1.getAge()+" "+ d1.getSleepy());
        
        
        
        Cat c1 = new Cat("caty", 3, true);
		Cat c2 = new Cat("File", 1, false);
		Cat c3 = new Cat("Black", 2, true);
		
		  System.out.println("My cat " +c1.getName()+ " "+c1.getAge()+" "+ c1.getSleepy());
		
		
//		
//		
//		Bird b1 = new Bird("Eagle", 7, false, true);
//		Bird b2 = new Bird("Parrot", 9, true, true);
//		Bird b3 = new Bird("Kaftar", 1, true, true);
//		
//		
//		 System.out.println("My bird " +b1.getName()+ " "+b1.getAge()+" "+ b1.getSleepy()+ " "+b1.getFly());
//			
		
		
		
		
		  System.out.println("____________________________");
		  
		  
		 ArrayList<Object> allDataTypes = new ArrayList<Object>();// in here i stored all different data types in ArrayList using the class object
		 										// class object is excist in system that parent class inherate the methods form there.like toString
		 allDataTypes.add("Test");				// method and etc.
		 allDataTypes.add(12); 
		 allDataTypes.add(true);
		 allDataTypes.add(17.71);
		 allDataTypes.add(new Dog("Cursa", 4, false)); 
		 
		 
		  for(Object i:allDataTypes) {
			  System.out.println(i);
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		
		

	}

}
