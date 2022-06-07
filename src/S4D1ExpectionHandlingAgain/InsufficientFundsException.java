package S4D1ExpectionHandlingAgain;

public class InsufficientFundsException extends Exception{

	public InsufficientFundsException() {}
	
	InsufficientFundsException(String message){
		super(message);
	}
}
