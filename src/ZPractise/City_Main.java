
package ZPractise;

public class City_Main {

	public void printCity(City city) {
		
		if (city != null) {
			System.out.println("our service is available ");
			city.message();
			System.out.println(city.numberofTowers);
		} else
			System.out.println("invalid city");
	}

	public static void main(String[] args) {
		
		City_Main main = new City_Main();
		main.printCity(City.KOLKATA);

	}
}
