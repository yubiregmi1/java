package day_3_assignment_24;

public class ExceptionHandlingDemo {
	
	public static void main(String args[])
	{
		String name = null;
		int total = 100, count=10;
		
		try {
		//System.out.println(name.length());
		name = "John";
		//System.out.println(name.length());
		int average = total/count;
		System.out.println(average);
		System.out.println(name.length());
		System.out.println("End of try block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch block");
			System.out.println("Arithematic Exception "+e.getMessage());
			//e.printStackTrace();			
		}
		catch(NullPointerException e)
		{
			System.out.println("Catch block");
			System.out.println("Object is null "+e.getMessage());
			//e.printStackTrace();			
		}
		finally
		{
			System.out.println("Finally block");

		}
		System.out.println("Continuing the execution...");
	}

}
