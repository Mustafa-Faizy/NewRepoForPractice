package Java_Project1;

public class Person {

	//First Name, Last Name, Address, Phone Number, Age
	
	private String firstName;
	private String lastName;
	private String address;
	private int phoneNumber;
	private int age;
	
	
	public Person() {
		
		firstName = "";
		lastName = "";
		address = "";
		phoneNumber = 0;
		age = 0;
	}
	
	
	
	public Person (String firstName, String lastName, String address, int phoneNumber, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.age = age;
	}
	
	
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	
	
	public String getLastName() {
		return lastName;
	}
	
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "first Name=> " +firstName+ " Last Name=> "+lastName+ " Address=> "+address+ " Phone Number=> "+phoneNumber+ " Age=> "+age;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
