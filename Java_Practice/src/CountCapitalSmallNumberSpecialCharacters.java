
public class CountCapitalSmallNumberSpecialCharacters {

	public static void main(String[] args) {

		String str = "Hi Shubh@ 013";
		str = str.replaceAll(" ", "");
		StringBuffer cap = new StringBuffer();
		StringBuffer sml = new StringBuffer();
		StringBuffer num = new StringBuffer();
		StringBuffer spChar = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				cap = cap.append(str.charAt(i));
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				sml = sml.append(str.charAt(i));
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				num = num.append(str.charAt(i));
			} else
				spChar = spChar.append(str.charAt(i));

		}

		System.out.println("Capital letters: " + cap);
		System.out.println("Count of capital letters: " + cap.length());
		System.out.println();

		System.out.println("Small letters: " + sml);
		System.out.println("Count of small letters: " + sml.length());
		System.out.println();

		System.out.println("Numbers: " + num);
		System.out.println("Count of numbers: " + num.length());
		System.out.println();

		System.out.println("Special characters: " + spChar);
		System.out.println("Count of special characters: " + spChar.length());

	}

}


/* OUTPUT:
Capital letters: HS
Count of capital letters: 2

Small letters: ihubh
Count of small letters: 5

Numbers: 013
Count of numbers: 3

Special characters: @
Count of special characters: 1
*/
