import java.util.Arrays;

public class LargestAndSmallestNumber {

	public static void main(String[] args) {

		int[] arr = { 5,1,-5,2,100,95 };
		int min = arr[0];
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) 
			{
				max = arr[i];
			} else if(arr[i]<min)
			{
				min = arr[i];
			}
		}

		System.out.println("The largest number: " + max);
		System.out.println("The smallest number: " + min);

		// With sort() method
		/*
		 * Arrays.sort(arr); System.out.println("Smallest Number: "+arr[0]);
		 * System.out.println("Largest Number: "+arr[arr.length-1]);
		 */

	}

}
