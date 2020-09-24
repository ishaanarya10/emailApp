package emailApplication;

import java.util.Scanner;

public class Helper {
	
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 8;
	private String department;
	private String email;
	private String alternateEmail;
	private String companySuffix = "xyzcompany.com";
	
	// Constructor
	public Helper(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Welcome! " + firstName + " " + lastName + " Email created. :)");
		
		//Sets and return department
		this.department = setDepartment();
		
		//generate and return a random password
		this.password = generateRandomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		//generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		
	}
	
	//Set Department
	private String setDepartment() {
		
		System.out.print("Department Codes: \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none \nEnter department code: ");
		
		Scanner s = new Scanner(System.in);
		int deptChoice = s.nextInt();
		
		if(deptChoice == 1) {
			return "sales";
		}else if(deptChoice == 2) {
			return "dev";
		}else if(deptChoice == 3) {
			return "acc";
		}else {
			return "";
		}
		
	}
	
	private String generateRandomPassword(int length) {
	    
	    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
	    char[] password = new char[length];
	    
	    for(int i=0;i<length;i++) {
	        
	        int rand = (int) (Math.random() * passwordSet.length());
	        password[i] = passwordSet.charAt(rand);
	        
	    }
	    
	    String pass = new String(password);
	    return pass;
	}
	
	public void setPassword(String password) {
	    
	    this.password = password;
	    
	}
	
	public void setAlternateEmail(String altEmail) {
	    
	    this.alternateEmail = altEmail;
	    
	}
	
	public void showInfo() {
	    
	    System.out.println("Display Name: " + firstName + " " + lastName);
	    System.out.println("Department: " + department);
	    System.out.println("Email: " + email);
	    
	}
	
	public void displayName() {
	    
	    System.out.println("Display name: " + firstName + " " + lastName);
	    
	}
	
	public void displayPassword() {
	    
	    System.out.println("Your passwords is: " + password);
	    
	}

}