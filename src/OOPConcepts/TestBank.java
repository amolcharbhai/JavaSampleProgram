package OOPConcepts;

public class TestBank {

	public static void main(String[] args) {
		HSBCBank hs= new HSBCBank();
		hs.credit();
		hs.Debit();
		hs.transferMoney();
		hs.EducationLoan();
		hs.CarLoan();
		System.out.println(UsBank.min_bal);
		
		//		Dynamic polymorphism:Only Overwridden method are called 
		System.out.println("Dynamic polymorphism----");

		UsBank b=new HSBCBank();
		b.credit();
		b.Debit();
		b.transferMoney();
		
	}

}
