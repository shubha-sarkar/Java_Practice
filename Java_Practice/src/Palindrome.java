import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// Reverse a string
		System.out.print("Enter the string: ");
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		sc.close();
		String revstr="";
		for(int i=str.length()-1; i>=0; i--)
		{
			revstr = revstr + str.charAt(i);
		}
	if(revstr.equalsIgnoreCase(str))
		{
			System.out.println("Palindrome");
		}
	else
		{
			System.out.println("Not Palindrome");
		}

	}

}
