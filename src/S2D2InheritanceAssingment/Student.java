package S2D2InheritanceAssingment;

public class Student {

	int studId;
	String studName;
	double examFee;
	
	public void displayDetails() {
		System.out.println("Student Id: "+studId);
		System.out.println("Student Name: "+studName);
		System.out.println("Exam Fee: "+examFee);
	}

}

class DayScholar extends Student{
	double transportFee;
	
	 DayScholar(int studId, String studName, double examFee, double tpFee) {
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
		this.transportFee = tpFee;
	}
	 
	 public void display() {
		 super.displayDetails();
	 }
	 
	 public double payFee(double fee) {
		 System.out.println("Transport fee: "+transportFee);
		double fees = transportFee-fee; 
		return fees;
	 }
}

class Hosteller extends Student{
	double hostelFee;
	
	Hosteller(int studId, String studName, double examFee, double htFee) {
		this.studId = studId;
		this.studName = studName;
		this.examFee = examFee;
		this.hostelFee = htFee;
	}
	
	public void display() {
		super.displayDetails();
	}
	
	public double payFee(double fee) {
	     System.out.println("Hostel fee: "+hostelFee);
		double fees = hostelFee-fee; 
		return fees;
	 }
}
