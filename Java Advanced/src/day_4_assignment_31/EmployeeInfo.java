package day_4_assignment_31;

import java.util.ArrayList;

public class EmployeeInfo {
	
	public static void main(String[] args) {
	
	ArrayList<Integer> employeeId = new ArrayList<Integer>();
	
	employeeId.add(1001);
	employeeId.add(1002);
	//employeeId.add("1003");
	
	int result;
	
	for (int count=0;count<employeeId.size();count++)
	{
		result = employeeId.get(count);
		System.out.println(result);
	}
	
	}

}
