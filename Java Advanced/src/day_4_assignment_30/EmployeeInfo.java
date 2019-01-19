package day_4_assignment_30;

import java.util.*;

public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeBean[] employees = new EmployeeBean[4];
		
		for(int i=0;i<4;i++)
		{
			employees[i] = new EmployeeBean();
		}
		
		List<EmployeeBean> employeeList = new ArrayList<EmployeeBean>();
		
		for (int i=0;i<4;i++)
		{
			employeeList.add(employees[i]);
		}
		
		System.out.println(employeeList.size());
		int i;
		Iterator<EmployeeBean> it = employeeList.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next().displayDetails());
			//System.out.println("Employee Name: "+it.next().getEmployeeName());
			//System.out.println("Employee DOB: "+it.next().getDateOfBirth());
			
		}

	}

}
