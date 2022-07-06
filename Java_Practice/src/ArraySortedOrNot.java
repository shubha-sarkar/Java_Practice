
public class ArraySortedOrNot {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		System.out.println(arraySortedOrNot(arr));

	}

	static boolean arraySortedOrNot(int[] arr) {
		for (int i = 0; i < arr.length; i++) 
			{
			for (int j = i + 1; j < arr.length; j++) 
				{
				if (arr[j] < arr[i])
					return false;
				}
			}
		return true;

	}

}
