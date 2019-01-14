package day_4_assignment_4_prob_1;

public class Student {
	
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees;
	protected int feesPerMonth;
	
	Student(int studentId){
		this.studentId=studentId;
	}
	
	Student(int studentId,char studentType,String studName,int	semFees){
		//super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studName;
		this.semesterFees = semFees;
	}
	
	void displayDetails(){
		System.out.println("Student display details called");
	}

}
