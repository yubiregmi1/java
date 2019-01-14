package day_4_assigment_6;

public class DynamicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student dayScholar=new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Thomas");
		((DayScholar) dayScholar).setResAddress("Res add");
		dayScholar.getDetails();

	}

}
