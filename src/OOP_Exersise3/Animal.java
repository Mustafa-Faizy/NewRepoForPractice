package OOP_Exersise3;

public class Animal {

	
	private String name;
	private int age;
	private boolean sleepy;
	
	
	public Animal() {
		name = "";
		age = 0;
		sleepy = false;
	}
	
	
	
	public Animal (String name, int age, boolean sleepy) {
		
		this.name = name;
		this.age = age;
		this.sleepy = sleepy;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	public boolean getSleepy() {
		return sleepy;
	}
	
	
	
	public void setSleepy(boolean sleepy) {
		this.sleepy = sleepy;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
