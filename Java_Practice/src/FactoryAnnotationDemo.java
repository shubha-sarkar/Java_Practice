import org.testng.annotations.Factory;

public class FactoryAnnotationDemo {
	
	@Factory
	public Object[] getTestClasses()
	{
		return new Object[]
				{
					new FactoryAnnotationTest1(),
					new FactoryAnnotationTest2()
				};
	}

}
