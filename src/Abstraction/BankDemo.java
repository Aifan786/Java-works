package Abstraction;

public class BankDemo {

	public static void main(String[] args) {
		Bank bank1 = new SBI();
		Bank bank2 = new PNB();
		Bank bank3 = new ICICI();
		
		System.out.println("Rate of Interest of SBI bank is: "
		                     +bank1.getRateOfInterest()+"%");
		System.out.println("Rate of Interest of PNB bank is: "
		                     +bank2.getRateOfInterest()+"%");
		System.out.println("Rate of Interest of ICICI bank is: "
		                     +bank3.getRateOfInterest()+"%");
	}
}
