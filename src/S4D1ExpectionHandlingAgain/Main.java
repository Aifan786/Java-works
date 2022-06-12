package S4D1ExpectionHandlingAgain;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your name");
	    String userName = sc.nextLine();
	    System.out.println("Enter your country");
	    String userCountry = sc.next();
	    UserRegistration ur = new UserRegistration();
	    
	    try {
		    ur.registerUser(userName, userCountry);
		} 
	    catch (Exception e) {
			System.out.println(e.getMessage());
		}
	    
	}
}
