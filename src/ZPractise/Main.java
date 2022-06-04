package ZPractise;

public class Main {

	public static void main(String[] args) {
		OLA ola = new OLA();
		Car car = ola.bookCar(8, 100);
		
		int res = ola.calculateBill(car);
		
		System.out.println(res);

	}

}
