import java.util.Scanner;

public class SumOfTwoNumbers {


		public static void main(String[] args) {
			System.out.print("Enter the value of a : ");
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			System.out.println("Value of a is : "+a);
			System.out.print("Enter the value of b : ");
			int b=sc.nextInt();
			sc.close();
			System.out.println("Value of a is : "+b);
			int sum=a+b;
			System.out.print("Sum of a and b : "+sum);

		}
}
