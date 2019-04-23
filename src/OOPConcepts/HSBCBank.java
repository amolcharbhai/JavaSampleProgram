package OOPConcepts;

public class HSBCBank implements UsBank 
{

	@Override
	public void credit() {
		System.out.println("HSBC---Credit");
		
	}

	@Override
	public void Debit() {
		System.out.println("HSBC---Debit");
		
	}

	@Override
	public void transferMoney() {
		System.out.println("HSBC---Tranfer Money");
		
	}
	public void  EducationLoan(){
		System.out.println("HSBC--EduLoan");
	}
	
	public void CarLoan(){
		System.out.println("HSBC--Car Loan");
	}
	
}
