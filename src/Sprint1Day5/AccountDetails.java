package Sprint1Day5;

public class AccountDetails {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		
		a1.setId(105);
		a1.setType("Savings");
		a1.setBalance(20000);
		
		a1.withdraw(5000);
//		a1.getAccountDetails();
		
	}
}
