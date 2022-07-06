import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "Mother In Law";
		String str2 = "Hitler Woman";
		boolean status = false;

		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");

		if (str1.length() == str2.length()) {
			
			char[] arr1 = str1.toLowerCase().toCharArray();
			char[] arr2 = str2.toLowerCase().toCharArray();

			Arrays.sort(arr1);
			Arrays.sort(arr2);

			status = Arrays.equals(arr1, arr2);
		}

		if (status) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

	}

}
