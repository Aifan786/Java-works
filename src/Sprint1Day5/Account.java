package Sprint1Day5;

public class Account {

	private int accountId;
	private String accountType;
	private int balance;
	
	public void setId(int accountId) {
		this.accountId = accountId;           
	}
	public int getId() {
		return accountId;
	}
	
	public void setType(String accountType) {
		this.accountType = accountType;           
	}
	public String getType() {
		return accountType;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;           
	}
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int deduct) {
		if(deduct<balance) {
			int withdrawAmount = balance-deduct;
			System.out.println("Balance amount after withdraw:"+ withdrawAmount);
			
		}
		else {
			System.out.println("Sorry!!! No enough balance");
		}
	}
	
//	public Account getAccountDetails() {
//		if(balance>0) {
//			
//		}
//	}
	
	
	
}
