package S2D2InheritanceAssingment;

public class MainStudent {

	public static void main(String[] args) {
		
		System.out.println("DayScholar");
		DayScholar dScholar  = new DayScholar(5024, "Arun", 500.0, 1500.0);
		dScholar.display();
		double payFee = dScholar.payFee(1250.0);
		System.out.println("Remaining amount to be paid: "+payFee);
		
		System.out.println("************************");
		
		System.out.println("Hosteller");
		
		Hosteller hosteller = new Hosteller(3405, "Pawan", 500.0, 3000.0);
		hosteller.display();
		double paysFee = hosteller.payFee(2050.0);
		System.out.println("Remaining amount to be paid: "+paysFee);
	}
}
