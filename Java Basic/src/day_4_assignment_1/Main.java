package day_4_assignment_1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student h1 = new Hostelite(2, 'F', "FnameHostel1","LnameHostel1",3000.0,"Hostel1",2);
		Hostelite h1 = new Hostelite(2, 'F', "FnameHostel1","LnameHostel1",3000.0,"Hostel1",2);

		System.out.println("Display results for first hostelite:");
		System.out.println("Name : "+h1.getStudentName());
		System.out.println("Name : "+h1.getStudentType());
		System.out.println("Name : "+h1.getFeesPerMonth());
		System.out.println("Name : "+h1.getHostelName());
		System.out.println("Name : "+((Hostelite)h1).getRoomNumber());		

	}

}
