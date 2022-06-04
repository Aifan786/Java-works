package S2D2InheritanceAssingment;

public class Demo {

	public static Bank getBank(String bank) {

		if (bank == "axis") {
			return new AxisBank("Axis", "789564566", 7.5);

		} else if (bank == "icici") {
			return new ICICIBank("ICICI", "9864956845", 5.5);

		} else {
			return null;
		}

	}

//	private static void display(Bank b) {
//
//		if (b == null) {
//			System.out.println("Error");
//		} else {
//			if (b.branchName == "axis") {
//
//				AxisBank a1 = (AxisBank) b;
//				a1.getCreditCard();
//			}
//			b.displayDetails();
//		}
//
//	}

	public static void main(String[] args) {
		
		AxisBank b1= (AxisBank)getBank("axis");
		
		b1.displayDetails();
		b1.getCreditCard();
		
		Bank b2= getBank("icici");
		b2.displayDetails();
		
		Bank b3 =getBank("Sbi");
		if(b3==null) {
			System.out.println("Error");
		}	

	}
}










