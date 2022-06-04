package S3D1_Abstraction_Interface;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {
		if(amount>1000) {
			 
			 return new TajHotel();
		}
		else if(amount>200 && amount<1000) {	
			return new RoadSideHotel();
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount");
		
		int amount = sc.nextInt();
		
		Demo demo = new Demo();
		Hotel hotel =demo.provideFood(amount);
		
		if(hotel != null) {
			hotel.chickenBiryani();
			hotel.masalaDosa();
			
			if(hotel instanceof TajHotel) {
				
				TajHotel taj = (TajHotel)hotel;
				taj.welcomeDrink();
			}
		}
		else {
			System.out.println("Please enter a valid amount");
		}
	}

}
