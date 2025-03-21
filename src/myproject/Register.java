package myproject;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Register {
	public static void main(String args[]) {
	    Scanner in = new Scanner (System.in);
	    
	    EncaptulationClass person1 = new EncaptulationClass();
	    
	    ArrayList<EncaptulationClass> arraylist = new ArrayList<>();
	    
	    System.out.println("***Do you like to enter the Module y/n***");
	    char a = in.next().charAt(0);
	    if(a!='y'  || a!='n'){
	    			if(a == 'y') {
	    				while(true){
	    					System.out.println("\n1-Are you New user");
	    					System.out.println("2-Are you Existing user");
	    					System.out.println("3-Show all users");
	    					System.out.println("4-Exit");
	    					System.out.println("\nEnter your choice:");
	    					int choice = in.nextInt();
	    					in.nextLine();
	    
	    					if(choice == 1 ) {//New-User
				    		System.out.println("Enter your Username:");
				    		String username = in.nextLine();
				    		System.out.println("Enter your Password:");
				    		String password = in.nextLine();
				    		System.out.println("Enter your Email:");
				    		String email = in.nextLine();
				    		System.out.println("Enter your Address:");
				    		String address = in.nextLine();
				    		System.out.println("Enter your MobileNumber:");
				    		long mobilenumber = in.nextLong();
				    		in.nextLine();
				    		Date createAt = new Date();
				    		Date updateAt = new Date();
				    		boolean isActive = true;
	
				    		person1.setUsername(username);
				    		person1.setPassword(password);
				    		person1.setEmail(email);
				    		person1.setAddress(address);
				    		person1.setMobileNumber(mobilenumber);
				    		person1.setCreateAt(createAt);
				    		person1.setUpdateAt(updateAt);
				    		person1.setIsActive(isActive);
				    		arraylist.add(person1);
				    	}//New-User
		    	
				    	else if(choice == 2){//Existing-User 
				    			boolean user = false;
				    			System.out.println("Enter your Username:");
					    		String name = in.nextLine();
					    		System.out.println("Enter your Password:");
					    		String passwd = in.nextLine();
				    			
				    			for(int i=0;i<arraylist.size();i++) {
				    				EncaptulationClass userlogin = arraylist.get(i);
				    				if(userlogin.getUsername().equals(name)&&userlogin.getPassword().equals(passwd)) 
				    				{
				    					System.out.println("Your Logged in!");
				    					System.out.println("Your Profile");
				    					System.out.println(userlogin.getUsername());
						    			System.out.println(userlogin.getPassword());
						    			System.out.println(userlogin.getEmail());
						    			System.out.println(userlogin.getAddress());
						    			System.out.println(userlogin.getMobileNumber());
				    					}//Existing-User
				    					else {
				    					System.out.println("Invalid username or password");
				    					}   
				    			}
				    		}
				    	else if(choice ==3){//Show-User
				    		System.out.println(arraylist);		
				    	}
		    	
				    	else if(choice == 4){//Exit-Module
				    		System.out.println("***Now you are exited the module***");
				    		break;
				    	}
				    	else {//Invalid choice
				    		System.out.println("\n***INVALID-CHOICE***\n\nPlease Enter the choice 1 2 3");
				    		break;
				    	}
		    	
		    }//While-Close
		    }//Choice-Y-Close
		    
	    	if(a=='n'){//Choice-N
		    	 System.out.println("***Bye***");
		    }
	    }
	    
		in.close();
	
	}//Main-Close
}//Class-Close
