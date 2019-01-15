package day_4_assignment_7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DayScholar dayScholar=new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Thomas");
		((DayScholar) dayScholar).setResAddress("Res add");
		dayScholar.calculateFees();
		dayScholar.displayDetails();

	}

}
