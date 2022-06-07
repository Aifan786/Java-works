package S4D1ExpectionHandlingAgain;

public class Account {

	private String accountNumber;
	private double Balance;
	
	public Account(String acnumber, double balance) {
		this.accountNumber = acnumber;
		this.Balance = balance;
	}
	
	public void deposit(int amount) {
		Balance = Balance+amount;
	}
	public double withdraw(int amount) throws InsufficientFundsException {
		
		if(amount>Balance) {
			InsufficientFundsException ife = new InsufficientFundsException("Balance not available");
			throw ife;
		}
		else {
			return amount;
		}
		
	}
}
