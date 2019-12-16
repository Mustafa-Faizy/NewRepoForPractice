package OOP_Exersise3;

public class Bird extends Animal {

	private String fly;
	
	
	public Bird(String name, int age, boolean sleepy, String fly) {
		super(name, age, sleepy);
		this.fly = fly;
	}
	
	
	@Override
	public String getName() {
		return "Bird" + super.getName();
	}
	
	
	public String getFly() {
		return fly;
	}
	
	
	public void setFly(String fly) {
		this.fly = fly;
	}
	
	
	
	
	
	
	
	
	
}
