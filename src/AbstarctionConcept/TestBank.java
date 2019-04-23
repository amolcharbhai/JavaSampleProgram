package AbstarctionConcept;

public class TestBank {

	public static void main(String[] args) {
		HDFCBank hd = new HDFCBank();

		hd.credit();
		hd.debit();
		hd.loan();
		hd.account();

		Bank b = new HDFCBank();
		b.credit();
		b.debit();
		b.loan();

	}

}
