package OOP_Exesise2;

public class Saving_Account extends Customer{

	
private double savingBalance;



public Saving_Account() {
	super();
	
	this.savingBalance = 0;;
}



public Saving_Account(double savingBalance, String firstName, String lastName, int id) {
	super(firstName, lastName, id);
	this.savingBalance = savingBalance;
}



@Override
public String getFirstName() {
	System.out.println("this is override method in child class");
	return super.getFirstName();
}




	 
	
	public double getSavingBalanve() {
		return savingBalance;
	}
	
	
	
	
	
	
	
	
	
	
	
	










	
}

