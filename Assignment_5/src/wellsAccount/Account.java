package wellsAccount;

public class Account {
	
	private static int accountNo = 1;
	
	private String firstName;
	private String middleName;
	private String lastName;
	
	private String email;
	
	private String accType;
	private String dateofbirth;
	private char gender;
	private String mStatus;

	Account()
	{
		System.out.println("Default parent constructor called");
		firstName = "N/A"; middleName = "N/A"; lastName = "N/A"; email = "N/A"; accType = "N/A"; dateofbirth = "N/A";
		gender = '\0'; mStatus = "N/A";
	}
	
	Account(String fn, String mn, String ln, String e, String actype, String dob, char g, String ms)
	{
		System.out.println("Parameterized parent constructor called");
		firstName = fn; middleName = mn; lastName = ln; email = e; accType = actype; dateofbirth = dob;
		gender = g; mStatus = ms;		
	}
	
	//write getters and setters
	
	public void useATM(int userID)
	{
		System.out.println("User has used the ATM");
	}
	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account salaryEmp1 = new Account("abc","abc","abc","abc@abc.ccom","Salary","1/1/1",'M',"Single");
		System.out.println("salaryEmp1 created");
		
		Account salaryEmp2 = new Account("abcd","abcd","abcd","abcd@abc.ccom","Salary","1/1/1",'F',"Married");
		System.out.println("salaryEmp2 created");
		
		NonSalary nsalaryEmp1 = new NonSalary("abcd","abcd","abcd","abcd@abc.ccom","Salary","1/1/1",'F',"Married");
		System.out.println("nsalaryEmp1 created");
		
		Account salaryEmp3 = new Account();
		System.out.println("salaryEmp3 created");		
		
		NonSalary nsalaryEmp2 = new NonSalary();
		System.out.println("nsalaryEmp2 created");
		
		salaryEmp2.useATM(2);
		nsalaryEmp1.useATM(1);
		nsalaryEmp2.useDiscount();
		
		
		

	}

}
