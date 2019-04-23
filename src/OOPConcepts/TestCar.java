package OOPConcepts;

public class TestCar {

	public static void main(String[] args) {

		// Static Polymorphism ---- compile time polymorphim
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafetfy();
		b.engine();

		System.out.println("************************");
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("************************");
		
		//Top Casting 
		Car c1=new BMW();  // Dynamic polymorphism
		c1.start();
		c1.stop();
		c1.refuel();
		

	}

}
