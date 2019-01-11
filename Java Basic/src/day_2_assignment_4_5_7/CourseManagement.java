package day_2_assignment_4_5_7;
public class CourseManagement
{
	public static void main (String args[])
	{
		//int studentId = 2;
		//char studentType = 'F';
		
		Student student = new Student();
		//student.setStudentId(studentId);
		//student.setStudentType(studentType);
		
		int studentId_getter; char studentType_getter;
		studentId_getter = student.getStudentId();
		studentType_getter = student.getStudentType();
		
		//System.out.println("Student id (instantiated): " + studentId);
		System.out.println("Student id (getter)		 : " + studentId_getter);
		//System.out.println("Student type (instantiated): " + studentType);
		System.out.println("Student type (getter)	   : " + studentType_getter);
		
	}
}