package Pattern;

/*
 1 
 2 7 
 3 8 13 
 4 9 14 19 
 5 10 15 20 25

 */
public class Pattern12 {
	public static void main(String[] args) {
		// int temp = 1;

		for (int i = 1; i <= 5; i++)
		{
			int temp = i;
			for (int j = i; j >= 1; j--) {
				System.out.print(temp + " ");
				temp = temp + 5;
			}
			System.out.println();
		}

	}
}
