package day_4_assignment_7;

public class Student {
	
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected final int semesterFees = 12000;
	protected double feesPerMonth;
	
	Student()
	{
		
	}
	
	public void setStudentId(int sId){
		this.studentId=sId;
	}
	
	public void setStudentType(char sType){
		this.studentType=sType;
	}
	
	public void setStudentName(String sName){
		this.studentName=sName;
	}
	
	public void calculateFees()
	{
		this.feesPerMonth = semesterFees/6.0;
	}	
	
	public void displayDetails(){
		System.out.println("Student ID :"+studentId);
		System.out.println("Student Type :"+studentType);
		System.out.println("Student Name :"+studentName);
		System.out.println("Fees per month :"+feesPerMonth);
	}

}
