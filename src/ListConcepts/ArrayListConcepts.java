package ListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {

	public static void main(String[] args) {

		// Static Array - fixed size

		int a[] = new int[4];

		ArrayList ar = new ArrayList();
		ar.add(10);
		ar.add(20);
		ar.add(30);

		System.out.println(ar.size());
		ar.add(40);
		ar.add(40);
		ar.add(50);

		System.out.println(ar.size());
		System.out.println(ar.get(5));

		for (int i = 0; i < ar.size(); i++) {

			System.out.println(ar.get(i));

		}
		// Non genric Vs Genric

		ArrayList<Integer> ar1 = new ArrayList<Integer>();

		ar1.add(100);
		System.out.println(ar1.get(0));

		Employee e1 = new Employee("Amol", 34, "QA");
		Employee e2 = new Employee("Amit", 34, "Support");
		Employee e3 = new Employee("Samirl", 34, "QA");

		ArrayList<Employee> ar2 = new ArrayList<Employee>();

		ar2.add(e1);
		ar2.add(e2);
		ar2.add(e3);

		// Iterator to traverse the array values;
		Iterator<Employee> emp = ar2.iterator();

		while (emp.hasNext()) {
			Employee it = emp.next();
			System.out.println("--------------------");
			System.out.println(it.name);
			System.out.println(it.age);
			System.out.println(it.dept);
			System.out.println("--------------------");

		}

	}

}
