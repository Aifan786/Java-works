package S4D1ExpectionHandlingAgain;

public class UserRegistration {


	public void registerUser(String userName, String userCountry) throws InvalidCountryException {
		
		if(userCountry.equals("India")) {
			System.out.println("User registration done successfully..");
		}
		else {
			InvalidCountryException ice = new InvalidCountryException("User Outside India cannot be registered");
			throw ice;
		}
	}
}
