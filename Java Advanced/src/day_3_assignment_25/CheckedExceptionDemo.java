package day_3_assignment_25;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ExceptionDemo ed = new ExceptionDemo();
		try {
			Class.forName("day_3_assignment_25.ExceptionDemo");
			//Class.forName("ExceptionDemo");
			//ExceptionDemo ed = new ExceptionDemo();
		}
		catch (Exception e)
		{
			System.out.println("Exception caught");
			System.out.println("Exception "+e);
		}
		
		

	}

}
