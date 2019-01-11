package day_2_assignment_8;

public class Loan {
	
	private int loanNo;
	private int accountNo;
	private int customerNo;
	private float loanAmount;
	private int loanDuration;
	private float interest;
	
	private static int loanCounter;
	
	static
	{
		loanCounter = 100;
		
		
		/* These methods when kept inside static block gives error
		public  Loan getLoanInstance()
		{
			Loan loanInstance = new Loan();
			return loanInstance;
		}
		
		public  Loan getLoanInstance(int accountNo, int customerNo, int loanDuration, float loanAmount, float interest)
		{
			Loan loanInstance = new Loan(accountNo, customerNo, loanDuration, loanAmount, interest);
			return loanInstance;
		}
		
		public  int getNumberofObjects()
		{
			return loanCounter;
		}
		*/
	}
	
	
	public static Loan getLoanInstance()
	{
		Loan loanInstance = new Loan();
		return loanInstance;
	}
	
	public static Loan getLoanInstance(int accountNo, int customerNo, int loanDuration, float loanAmount, float interest)
	{
		Loan loanInstance = new Loan(accountNo, customerNo, loanDuration, loanAmount, interest);
		return loanInstance;
	}
	
	public static int getNumberofObjects()
	{
		return loanCounter;
	}
	
	
	private Loan()
	{
		loanCounter++;
	}
	
	private Loan(int accountNo, int customerNo, int loanDuration, float loanAmount, float interest)
	{
		loanCounter++;
		this.setAccountNo(accountNo);
		this.setCustomerNo(customerNo);
		this.setLoanDuration(loanDuration);
		this.setLoanAmount(loanAmount);
		this.setInterest(interest);
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getCustomerNo() {
		return customerNo;
	}

	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}

	public float getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}

	
	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}
	
	public float calculateInstallments()
	{
		System.out.println("Calculate installments");
		return 1.0f;
	}
	
	/*
	public static void main(String args[])
	{
		//creating instances without parameter
		Loan loan1 = new Loan();
		Loan loan2 = new Loan();
		Loan loan3 = new Loan();
		//creating instances with parameter
		Loan loan4 = new Loan(1111,1001,2,1000f,0.1f);
		Loan loan5 = new Loan(1112,1002,5,2000f,0.1f);
		
		System.out.println("Number of instances		:"+loanCounter);
		
	}
	*/
	

}
