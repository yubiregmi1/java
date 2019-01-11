package day_1_assignment_11;

public class EmployeeGrade {
	
	private int employeeNo;
	private String employeeName;
	
	private float customer1Feedback;
	private float customer2Feedback;
	private float customer3Feedback;
	
	private float averageFeedback;
	
	private char grade;
	
	
	EmployeeGrade()
	{
		this.setEmployeeNo(101);
		this.setEmployeeName("Ram");
		this.setCustomer1Feedback(4.1f);
		this.setCustomer2Feedback(4.0f);
		this.setCustomer3Feedback(4.3f);
	}
	
	
	EmployeeGrade(int employeeNo, String employeeName, float customer1Feedback, float customer2Feedback, float customer3Feedback)
	{
		this.setEmployeeNo(employeeNo);
		this.setEmployeeName(employeeName);
		this.setCustomer1Feedback(customer1Feedback);
		this.setCustomer2Feedback(customer2Feedback);
		this.setCustomer3Feedback(customer3Feedback);
	}
	
	public void initializeEmployee(int employeeNo, String employeeName, float customer1Feedback, float customer2Feedback, float customer3Feedback)
	{
		this.setEmployeeNo(employeeNo);
		this.setEmployeeName(employeeName);
		this.setCustomer1Feedback(customer1Feedback);
		this.setCustomer2Feedback(customer2Feedback);
		this.setCustomer3Feedback(customer3Feedback);
	}
	
	public void initializeEmployee(int employeeNo, String employeeName, float customer1Feedback, float customer2Feedback)
	{
		this.setEmployeeNo(employeeNo);
		this.setEmployeeName(employeeName);
		this.setCustomer1Feedback(customer1Feedback);
		this.setCustomer2Feedback(customer2Feedback);
		
	}
	
	public void calculateAverageFeedback()
	{
		if (customer3Feedback!=0)
			averageFeedback = (customer1Feedback+customer2Feedback+customer3Feedback)/3;
		else
			averageFeedback = (customer1Feedback+customer2Feedback)/2;
	}
	
	public void calculateGrade()
	{
		if (averageFeedback>0 && averageFeedback<=2)
		{
			grade = 'C';
		}				
		else if (averageFeedback>2 && averageFeedback<=3)
		{
			grade = 'B';
		}			
		else 
		{
			grade = 'A';
		}
	}
	
	public void displayInfo()
	{
		System.out.println("Employee no:	"+employeeNo);
		System.out.println("Employee name:	"+employeeName);
		System.out.println("Employee average feedback:	"+averageFeedback);
		System.out.println("Employee grade	:	"+grade);
	}

	public int getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public float getCustomer1Feedback() {
		return customer1Feedback;
	}

	public void setCustomer1Feedback(float customer1Feedback) {
		this.customer1Feedback = customer1Feedback;
	}

	public float getCustomer2Feedback() {
		return customer2Feedback;
	}

	public void setCustomer2Feedback(float customer2Feedback) {
		this.customer2Feedback = customer2Feedback;
	}

	public float getCustomer3Feedback() {
		return customer3Feedback;
	}

	public void setCustomer3Feedback(float customer3Feedback) {
		this.customer3Feedback = customer3Feedback;
	}

}
