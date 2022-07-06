
public class MethodOverloadingPractice {
	
	public void method1()
	{
		System.out.println("no arguments");
	}
	
	public void method2(int i)
	{
		System.out.println("int agument");
	}
	
	public void method3(double d)
	{
		System.out.println("double argument");
	}

	public static void main(String[] args) 
	{
		MethodOverloadingPractice mop=new MethodOverloadingPractice();
		mop.method1();
		mop.method2(10);
		mop.method3(10.5);
	}

}
