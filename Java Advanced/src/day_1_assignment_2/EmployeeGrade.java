package day_1_assignment_2;

public class EmployeeGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int employeeID[] = {1001, 1002, 1003, 1004, 1005};
		float customer1Feedback[] = {4.1f, 3.8f, 4.5f, 4.9f, 3.9f};
		float customer2Feedback[] = {4.1f, 3.8f, 4.5f, 4.9f, 3.9f};
		float customer3Feedback[] = {4.1f, 3.8f, 4.5f, 4.9f, 3.9f};
		
		float[] averageFeedback = new float[employeeID.length];
		char[] grade = new char[employeeID.length];
		
		for (int i=0; i<employeeID.length; i++)
		{
			averageFeedback[i] = (customer1Feedback[i]+customer2Feedback[i]+customer3Feedback[i])/3;
			if (averageFeedback[i]>0 && averageFeedback[i]<=2)
			{
				grade[i] = 'C';
			}				
			else if (averageFeedback[i]>2 && averageFeedback[i]<=3)
			{
				grade[i] = 'B';
			}			
			else 
			{
				grade[i] = 'A';
			}
			
			System.out.println("Employee ID			:"+employeeID[i]);
			System.out.println("Average Feedback	:"+averageFeedback[i]);
			System.out.println("Grade				:"+grade[i]);
		}

	}

}
