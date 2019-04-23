package Pattern;

/*1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 1 2 3 4 5 6
 1 2 3 4 5 6 7
 1 2 3 4 5 6
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1*/
public class Pattern3 {

	public static void main(String[] args) {

		int Rows = 7;

		for (int i = 1; i <= Rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
		for (int k = Rows-1; k >= 1; k--) {
			for (int l = 1; l <= k; l++) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}

}
