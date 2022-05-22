package Sprint1;

public class A {

	int i = 10;
	
	void funA() {
		System.out.println("inside funA of A");
	}

	public static void main(String[] args) {
	
		//A a1 = new A(); 
		//a1.funX();
		
		new A().funA(); //only one time
	}
}

//public class Account
//{
//static String bankName;
//long accountNumber;
//String accountHolderName;
//double balance;
//
//public static void main(String[] args){
//	
//Account.bankName="SBI";
////Day3: Introduction of OOPs 14
//Account ac1=new Account();
//ac1.accountHolderName="Ramesh";
//ac1.accountNumber=13422323432L;
//ac1.balance=5000;
//
//Account ac2=new Account();
//ac2.accountHolderName="Amit";
//ac2.accountNumber=25422323432L;
//ac2.balance=6000;
//System.out.println("Account 1 details");
//System.out.println(ac1.bankName);
//System.out.println(ac1.accountHolderName);
//System.out.println(ac1.balance);
//System.out.println("======================");
//System.out.println("Account 2 details");
//System.out.println(ac2.bankName);
//System.out.println(ac2.accountHolderName);
//System.out.println(ac2.balance);
//}
//	
//}
