package S4D1ExpectionHandlingAgain;

public class AccountDemo {

	public static void main(String[] args) {
		
		Account account = new Account("4005342",5000.50);
		account.deposit(2000);
		
		try {
			double withdraw =  account.withdraw(10000);
			System.out.println("Your withdraw amount is: "+withdraw);
		}
		catch (Exception e) {
			System.out.println(e.getMessage()); 
		}
		
	}
}
