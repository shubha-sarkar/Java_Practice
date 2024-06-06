//Count the number of digits without using string

public class CountNoOfDigit {

	public static void main(String[] args) {
		int n = 22555;
		int count = 0;
		while (n != 0) {
			n = n / 10;
			count++;
		}
		System.out.print("Number of digits : " + count);

	}

}

/*
 * Output: Number of digits : 5
 */