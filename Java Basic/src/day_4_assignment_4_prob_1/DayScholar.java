package day_4_assignment_4_prob_1;

public class DayScholar extends Student{
	
	private String residentialAddress;
	
	DayScholar(int studentId,char studentType ,String studName,int semFees,String residentialAddress){
		super(studentId, studentType, studName, semFees);
		this.residentialAddress=residentialAddress;
		
	}
	
	void displayDetails(){
		System.out.println("DayScholar display details called");
	}

}
