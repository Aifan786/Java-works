package ZPractise;

public class Car {

	private int numberOfPassenger;
	private int numberOfKms;
	
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}
	public int getNumberOfKms() {
		return numberOfKms;
	}
	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}
	
}
class Sedan extends Car{
	final int farePerKm =20;
}
class HatchBack extends Car{
	final int farePerKm =15;
}

class OLA{
	
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		if(numberOfPassenger<=3) {
			HatchBack hatchBack = new HatchBack();
			hatchBack.setNumberOfPassenger(numberOfPassenger);
			hatchBack.setNumberOfKms(numberOfKMs);
			return hatchBack;
		}
		else {
			Sedan sedan = new Sedan();
			sedan.setNumberOfPassenger(numberOfPassenger);
			sedan.setNumberOfKms(numberOfKMs);
			return sedan;
		}
		
	}
	
	public int calculateBill(Car car) {
		if(car instanceof HatchBack) {
			
			HatchBack hatchBack = (HatchBack)car;
			
			int numberOfKms = hatchBack.getNumberOfKms();
			int farePerKm = hatchBack.farePerKm;
			return numberOfKms*farePerKm;
		}
		else {
			Sedan sedan =  (Sedan)car;
			int numberOfKms = sedan.getNumberOfKms();
			int farePerKm = sedan.farePerKm;
			return numberOfKms*farePerKm;
		}
	}
}



