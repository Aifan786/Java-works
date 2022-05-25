package S2D2Inheritance;

public class Banking {

	public static void main(String[] args) {
		SBI sbi = new SBI();
		ICICI icici = new ICICI();
		
		System.out.println("SBI rate of Interest is"+" "+ sbi.getRateOfInterest());
		System.out.println("ICICI rate of Interest is"+" "+ icici.getRateOfInterest());
	}
}

class Bank{
	int getRateOfInterest() {
		return 0;
	}
}

class SBI extends Bank{
	@Override
	int getRateOfInterest() {
		return 5;
	}
}

class ICICI extends Bank{
	@Override
	int getRateOfInterest() {
		return 8;
	}
}