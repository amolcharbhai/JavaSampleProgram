package JavaBasics;

public class SingleTon {

	public static void main(String[] args) {
		abc obj1 = abc.getInstance();

	}
}

class abc {
	static abc obj = new abc();

	private abc() {

	}

	public static abc getInstance() {
		return obj;
	}
}