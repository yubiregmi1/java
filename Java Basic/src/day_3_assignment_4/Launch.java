package day_3_assignment_4;

public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student;
		student = new Student();
		
		//initialize variables
		int sId = 1;
		char type = 'D';
		String firstname = "FirstName";
		String lastname = "LastName";
		
		//invoke setter methods
		student.setStudentId(sId);
		student.setStudentType(type);
		student.setStudentName(firstname, lastname);
		//display details
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentType());
		System.out.println(student.getStudentName());
		
		//create a new object
		student = new Student(2,'F',"NewFname","NewLname");
		//display details
		System.out.println(student.getStudentId());
		System.out.println(student.getStudentType());
		System.out.println(student.getStudentName());
		
		
		
		
		
	
		

	}

}
