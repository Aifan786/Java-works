package Abstraction;

abstract class Bank {

	abstract int getRateOfInterest();
}

class SBI extends Bank{

	@Override
	 int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 7;
	}
	
}

class PNB extends Bank{

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8;
	}
	
}

class ICICI extends Bank{

	@Override
	int getRateOfInterest() {
		// TODO Auto-generated method stub
		return 9;
	}
	
}






