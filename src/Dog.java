
public class Dog implements Animal 
{
	
	@Override
	public void run() {
		System.out.println("Dog Running");
		
	}

	@Override
	public void sleep() {
		System.out.println("Dog Sleeping");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog eating");
		
	}
	public void Bark(){
		System.out.println("Dog is Barking ");
	}

}
