package OOPConcepts;


// When same method is present in parent class as well as in child class with the same name and same number of arguments.

public class BMW extends Car {
	public void start() {
		System.out.println("BMW--- Start");
	}

	public void theftSafetfy() {
		System.out.println("BMW----theftSafety");
	}
}