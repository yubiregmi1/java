package day_4_assignment_4_prob_2;

public class DayScholar extends Student{
	
	private String residentialAddress;
	
	DayScholar(int studentId,char studentType, String studName,	int semFees, String residentialAddress, String cName){
		super(studentId,studentType,studName, semFees, cName);
		this.residentialAddress=residentialAddress;
	}
	
	public void displayDetails(){
		//need to display the Details of the Student and
		//DayScholar
		super.displayDetails();
		System.out.println("Reidential Address	:"+this.residentialAddress);		
		
	}

}
