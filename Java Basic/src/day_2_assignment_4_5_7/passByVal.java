package day_2_assignment_4_5_7;
public class passByVal {

	public static void main (String args[]){
		int sId = 25;
		passByVal val = new passByVal();
		Student std = new Student();
		
		System.out.println("Student id before passByValueMethod : " + std.getStudentId());
		//val.passTheValueMethod(sId);
		val.passTheValueMethod(std);
		System.out.println("Student id after passByValueMethod : " + std.getStudentId());
	}
	
	//public void passTheValueMethod(int sId)
	//{
	//	sId = 10;
	//	System.out.println("The sId are" + sId);
	//}
	
	public void passTheValueMethod(Student s)
	{
		//sId = 10;
		
		System.out.println("The sId are inside the method: " + s.getStudentId());
		s.setStudentId(5);
	}
}