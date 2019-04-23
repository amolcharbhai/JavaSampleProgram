package Pattern;
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7*/


public class Pattern1 {

	public static void main(String[] args) {

		int Rows = 7;

		for (int i = 1; i <= Rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();

		}

	}

}
