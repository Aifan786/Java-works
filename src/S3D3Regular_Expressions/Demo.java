package S3D3Regular_Expressions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	public boolean validate(String name, String mobileNum, String aadharCard) {
		
		boolean n = Pattern.matches("[a-zA-z]{3,8}", name);
		boolean ad = Pattern.matches("[0-9]{12}", aadharCard);
		boolean mb = Pattern.matches("[6789][0-9]{9}", mobileNum);
	
		if(n==true && ad==true && mb==true) {

			return true;
			
		}
		else {

			return false;
		}

	}
	
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		
		System.out.println("Enter Aadhar number");
		String aadhar = sc.next();
		
		System.out.println("Enter mobile number");
		String mobile = sc.next(); 

		Boolean bl = demo.validate(name, mobile, aadhar);
		
		if(bl==true) {
			
			Citizen citizen = new Citizen();
			citizen.setName(name);
			citizen.setAadharNumber(aadhar);
			citizen.setMobileNumber(mobile);
			
		    citizen.printDetails();
		}
		else {
			System.out.println("Enter valid details");
		}
	}
}




