package Pattern;

public class Pattern10 {

	public static void main(String[] args) {
		
		int star=1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=i; j++) {
			
				System.out.print(star+" ");
			star=star+1;
			}
			System.out.println("\n");
	//		star=star+1;
		}
	}
}
