package day_4_assignment_32;

import java.lang.reflect.*;

public class TestReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class<?> classObj = Class.forName("day_4_assignment_32.Employee");
			Method[] methods = classObj.getDeclaredMethods();
			Field[] fields = classObj.getDeclaredFields();
			
			System.out.println("There are "+methods.length+" methods:");
			for (int i=0;i<methods.length;i++)
			{
				System.out.println(methods[i].getName());
			}
			
			System.out.println("There are "+fields.length+" fields:");
			for (int i=0;i<fields.length;i++)
			{
				System.out.println(fields[i].getName());
			}
			
			//System.out.println(methods);
			//System.out.println(fields);
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
		
		

	}

}
