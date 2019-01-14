package day_4_assignment_3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Student s1;
		//Student s2;
		//Student h1 = new Hostelite(2, 'F', "FnameHostel1","LnameHostel1",3000.0,"Hostel1",2);
		//s1=h1;
		//Student d1 = new DayScholar(2,'F',"FnameDay1","LnameDay1",2000.0,"123 Sunny Ln, Irving, TX");
		//s2=d1;
		Hostelite s1 = new Hostelite(2, 'F', "FnameHostel1","LnameHostel1",3000.0,"Hostel1",2);
		DayScholar s2 = new DayScholar(2,'F',"FnameDay1","LnameDay1",2000.0,"123 Sunny Ln, Irving, TX");
		
		System.out.println("Display results for hostelite:");
		/*
		System.out.println("Name : "+s1.getStudentName());
		System.out.println("Type : "+s1.getStudentType());
		System.out.println("Fees : "+s1.getFeesPerMonth());
		System.out.println("Hostel Name : "+((Hostelite) s1).getHostelName());
		System.out.println("Room No. : "+((Hostelite) s1).getRoomNumber());	
		*/
		s1.displayStudentDetails();
		
		System.out.println();
		
		System.out.println("Display results for day scholar:");
		s2.displayStudentDetails();
		/*
		System.out.println("Name : "+s2.getStudentName());
		System.out.println("Type : "+s2.getStudentType());
		System.out.println("Fees : "+s2.getFeesPerMonth());
		System.out.println("Address : "+((DayScholar) s2).getResidentialAddress());
		//System.out.println("Name : "+((DayScholar) s2).getRoomNumber());	
		 
		 */

	}

}
