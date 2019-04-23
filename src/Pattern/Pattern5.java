package Pattern;

/*
 7 6 5 4 3 2 1
 7 6 5 4 3 2
 7 6 5 4 3
 7 6 5 4
 7 6 5
 7 6
 7
 */

public class Pattern5 {

	public static void main(String[] args) {

		int rows = 7;

		for (int i = 1; i <= rows; i++) {
			for (int j = 7; j >= i; j--) 
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
