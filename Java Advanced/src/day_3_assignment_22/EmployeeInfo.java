package day_3_assignment_22;

import java.util.*;

public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector empList = new Vector();
		int empNo = 1000;
		
		for (int count=0;count<5;count++)
		{
			//add empNo to vector
			empNo++;
			Integer i = empNo;	//autoboxing
			//i = new Integer(i);
			empList.add(empNo);
		}
		
		int result;
		for (int i=0;i<empList.size();i++)
		{
			result = (int) empList.get(i); //unboxing
			System.out.println(result);
		}

	}

}
