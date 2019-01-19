package day_4_assignment_30;

import java.util.Calendar;
import java.util.Date;

public class EmployeeBean {
	
	static
	{
		Date date=new Date();
		//Calendar calendar = Calendar.getInstance();
	}
	
	private static int counter=1;
	private int employeeID;
	private String employeeName;
	Calendar dateOfBirth;
	
	EmployeeBean()
	{
		this.employeeID = counter;
		this.employeeName = "Default"+this.employeeID;
		dateOfBirth = Calendar.getInstance();
		//this.dateOfBirth = new Calendar();
		counter++;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Calendar getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Calendar dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public boolean displayDetails()
	{
		System.out.println("Employee ID: "+this.getEmployeeID());
		System.out.println("Employee Name: "+this.getEmployeeName());
		System.out.println("Employee DOB: "+this.getDateOfBirth());
		return true;
		
	}
	
	

}
