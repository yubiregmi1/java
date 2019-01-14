package day_4_assignment_4_prob_2;

public class CourseRegistration {
	
	static protected int regId;
	protected String courseName;
	
	CourseRegistration(){
		regId++;
	}
	
	CourseRegistration (String cName){
		regId++;
		this.courseName=cName;
		
	}
	public void displayDetails(){
		System.out.println("Registration ID :"+regId);
		System.out.println("CourseName :"+courseName);
	}

}
