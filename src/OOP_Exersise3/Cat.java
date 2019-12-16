package OOP_Exersise3;

public class Cat extends Animal {
	
	
	public Cat (String name, int age, boolean sleepy) {
		super(name, age, sleepy);
	}
	
	
	@Override 
	public String toString() {
		if (getSleepy()) {
			return getName()+" "+ getAge() +" the cat is sleepy"; 
		}
			else {
				
			}return getName()+" "+ getAge() + " the cat is not sleepy";
		 
		
	}
	
	
	
	
	
	

}
