package wellsAccount;

public class NonSalary extends Account {
	
	/*
	private String firstName;
	private String middleName;
	private String lastName;
	
	private String email;
	private String accType;
	private String dateofbirth;
	private char gender;
	private String mStatus;
	*/
	
	NonSalary()
	{
		/*
		System.out.println("Default child constructor called");
		firstName = "N/A"; middleName = "N/A"; lastName = "N/A"; email = "N/A"; accType = "N/A"; dateofbirth = "N/A";
		gender = '\0'; mStatus = "N/A";
		*/
		super();
	}
	
	public NonSalary(String fn, String mn, String ln, String e, String actype, String dob, char g, String ms) {
		// TODO Auto-generated constructor stub
		/*
		System.out.println("Parameterized child constructor called");
		firstName = fn; middleName = mn; lastName = ln; email = e; accType = actype; dateofbirth = dob;
		gender = g; mStatus = ms;
		*/
		super( fn, mn,  ln,  e,  actype,  dob,  g,  ms);
		
	}

	public void useDiscount()
	{
		System.out.println("Discount used by the user");
	}

}
