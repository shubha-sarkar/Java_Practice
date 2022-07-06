
public class CountCapitalSmallNumberSpecialCharacters {

	public static void main(String[] args) {

		String str = "Hi Shubh@ 013";
		str = str.replaceAll(" ", "");
		System.out.println(str);
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		StringBuffer sb3 = new StringBuffer();
		StringBuffer sb4 = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				sb1 = sb1.append(str.charAt(i));
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				sb2 = sb2.append(str.charAt(i));
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				sb3 = sb3.append(str.charAt(i));
			} else
				sb4 = sb4.append(str.charAt(i));

		}

		System.out.println("Capital letters: " + sb1);
		System.out.println("Number of capital letters: " + sb1.length());
		System.out.println("Capital letters: " + sb2);
		System.out.println("Number of capital letters: " + sb2.length());
		System.out.println("Capital letters: " + sb3);
		System.out.println("Number of capital letters: " + sb3.length());
		System.out.println("Capital letters: " + sb4);
		System.out.println("Number of capital letters: " + sb4.length());

	}

}
