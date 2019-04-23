package AbstarctionConcept;

abstract  public class Bank {

	public abstract void loan();
	
	public void credit(){
		System.out.println("Bank ---- Credit Method");
	}
	
	public void debit (){
		System.out.println("Bank--- Debit Method");
	}

	
}
