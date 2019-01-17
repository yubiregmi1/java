package day_3_assignment_26;

public class InsufficientBalanceException extends Exception{
	
	public InsufficientBalanceException(){ 
		super("Sufficient Balance not available");
	}

}
