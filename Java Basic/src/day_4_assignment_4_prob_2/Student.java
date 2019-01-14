package day_4_assignment_4_prob_2;

public class Student extends CourseRegistration {
	
	protected int studentId;
	protected char studentType;
	protected String studentName;
	private int semesterFees;
	private int feesPerMonth;
	
	Student(int studentId, String cName){
		super(cName);
		this.studentId=studentId;
	}
	
	Student(int studentId,char studentType,String studName,int semFees,String cName){
			super(cName);
			this.studentId=studentId;
			this.studentType=studentType;
			this.studentName=studName;
			this.semesterFees=semFees;
	}
	
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Student Id		:"+this.studentId);
		System.out.println("Student Type	:"+this.studentType);
		System.out.println("Student Name	:"+this.studentName);
		System.out.println("Semester fees	:"+this.semesterFees);
		
		
	}

}
