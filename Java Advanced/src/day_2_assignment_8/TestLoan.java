package day_2_assignment_8;

public class TestLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating instances without parameter
		Loan loan1 = Loan.getLoanInstance();		
		Loan loan2 = Loan.getLoanInstance();
		Loan loan3 = Loan.getLoanInstance();
		//creating instances with parameter
		Loan loan4 = Loan.getLoanInstance(1111,1001,2,1000f,0.1f);		
		Loan loan5 = Loan.getLoanInstance(1112,1002,5,2000f,0.1f);
		
		System.out.println("Total number of objects :" + Loan.getNumberofObjects());
		
	}

}
