package day_1_assignment_11;

public class Wells {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeGrade [] employee = new EmployeeGrade[5];
		
		//initialization of references
		//first initialize the parameters to pass to the constructor
		int emp_no[] = {1001,1002,1003,1004,1005};
		String name[] = {"A","B","C","D","E"};
		float cust1_feedback[] = {2.3f,4.0f,4.1f,4.1f,4.6f};
		float cust2_feedback[] = {2.3f,4.0f,4.1f,4.1f,4.6f};
		float cust3_feedback[] = {2.3f,4.0f,4.1f,4.1f,4.6f};
		for (int i=0;i<employee.length;i++)
		{
			employee[i] = new EmployeeGrade(emp_no[i],name[i],cust1_feedback[i],cust2_feedback[i],cust3_feedback[i]);
		}
		
		//calculate grade
		for (int i=0;i<employee.length;i++)
		{
			employee[i].calculateAverageFeedback();
			employee[i].calculateGrade();
		}
		
		//display result
		for (int i=0;i<employee.length;i++)
		{
			employee[i].displayInfo();			
		}
		

	}

}
