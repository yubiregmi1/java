package day_4_assignment_33;

public class StringMock {
	
	String capacity;
	
	public StringMock()
	{
		
	}
	
	public StringMock(String capacity)
	{
		this.capacity = capacity;
	}
	
	@Deprecated
	public static int search(String string, char searchItem)
	{
		int index=-1;		
		//convert string to char array
		char[] charArray = string.toCharArray();
		
		//search the character
		for(int i = 0; i<charArray.length; i++)
		{
			if (charArray[i] == searchItem)
			{
				index=i;
				return index;
			}
		}
		
		return index;
	}
	
	

}
