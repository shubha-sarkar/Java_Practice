
public class RemoveDuplicateCharactersFromString {

	public static void main(String[] args) {
		
		String str = "Shubha";
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (!result.contains(String.valueOf(str.charAt(i)))) {
				result = result + String.valueOf(str.charAt(i));
			}

		}
		System.out.println(result);

	}

}
