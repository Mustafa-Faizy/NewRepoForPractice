package OOP_Exesise2;

public class Checking_Account extends Customer {
	
	 private double checkingBalance;
	 private int id;
		 
	
	 
	 public Checking_Account() {
		 super();
		 
		 checkingBalance = 0.0;
		 id = 0;
	 }
	

	
	public Checking_Account(String firstName, String lastName, int id) {
		super(firstName, lastName, id);
	}	
	
	
	
	
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public void setCheckingBalance(double checkingBalance) {
		this.checkingBalance = checkingBalance;
	}
	
	
	@Override
	public int getId() {
		return super.getId();
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	
	
	
	
	
	
	
	
	
	
}
