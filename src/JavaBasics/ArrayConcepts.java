package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
		int i[] = new int[4];
		i[0] = 1;
		i[1] = 2;
		i[2] = 3;
		i[3] = 4;

		System.out.println(i.length);

		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		}
	}
}
