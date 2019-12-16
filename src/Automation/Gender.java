

package Automation;

public class Gender {
	

	    
	    private String gender;
	    
	    public String getGender(){
	        return gender;
	    }
	    
	    public void setGender(String gender){
	        
	        this.gender=gender;
	    }
	    
	    public Gender(String gender){
	        if (gender.equals("boy")){
	            System.out.println("HE IS A BOY!");
	        }
	        
	        else{
	            System.out.println("SHE IS A GIRL!");
	        
	    }
	    }
	    
	    	public static void main(String[] args) {
			
			
		Gender  baby1= new Gender("girl");
		baby1.setGender("girl");
			
			
		System.out.println(baby1.getGender());
			
		}

	}