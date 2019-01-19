package day_4_assignment_33;

public class TestStringMock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String message = "What's in the name";
		StringMock sm = new StringMock();
		
		char s = 'a';		
		System.out.println("Input String: "+message);
		System.out.println("Search for character 'a': "+sm.search(message, s));
		
		s='q';
		System.out.println("Search for character 'q': "+sm.search(message, s));

	}

}
