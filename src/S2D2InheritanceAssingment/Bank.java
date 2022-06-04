
package S2D2InheritanceAssingment;

public class Bank {

	String branchName;
	String IfscCode;
	
	public void displayDetails() {
		System.out.println("Branch name: "+branchName);
		System.out.println("IFSC code: "+IfscCode);
	}
	
}

class AxisBank extends Bank{
	public AxisBank() {
		// TODO Auto-generated constructor stub
	}
	double rateOfInterest;
	 AxisBank(String name, String code, double rate) {
		this.branchName = name;
		this.IfscCode = code;
		this.rateOfInterest = rate;
	}
	 @Override
	 public void displayDetails() {
		 super.displayDetails();
	 }
	 
	 public void getCreditCard() {
		 System.out.println("Get the Credit Card from the Axis bank");
	 }
}

class ICICIBank extends Bank{
	
	double rateOfInterest;
	ICICIBank(String name, String code, double rate){
		this.branchName = name;
		this.IfscCode = code;
		this.rateOfInterest = rate;
	}
	@Override
	public void displayDetails() {
		 super.displayDetails();
	 }
}



