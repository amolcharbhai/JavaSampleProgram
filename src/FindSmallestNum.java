public class FindSmallestNum {

	public static void main(String[] args) {

		int Arr1[] = { 19, 23, 45, 34, 233, 45, 23, 12, 35, 45, 67, 88, 23, 11,
				8 };
		int temp;
		for (int i = 0; i < Arr1.length; i++) 
		{
			for (int j = i+1; j < Arr1.length; j++) 
			{
				if (Arr1[i] > Arr1[j])
				{
					temp = Arr1[i];
					Arr1[i] = Arr1[j];
					Arr1[j] = temp;
				}
			}
		}
System.out.println("The Smallest number of Array is :"+ Arr1[0]);
	}

}
