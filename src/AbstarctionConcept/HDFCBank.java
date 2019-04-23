package AbstarctionConcept;

public class HDFCBank extends Bank {

	@Override
	public void loan() {
		System.out.println("HDFC ---- Loan account");

	}

	public void account() {
		System.out.println("HDFC -------- Account Department");
	}
}
