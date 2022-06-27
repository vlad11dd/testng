package PrioritiesAndDependencies;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPriority 
{
	@Test(priority=1)
	//public void testOne()
	public void testLogin()
	{
		System.out.println("Executing Test One");
		Assert.fail();
	}
	
	@Test(priority=2,dependsOnMethods={"testLogin"})
	//public void testTwo()
	public void testUserReg()
	{
		System.out.println("Executing Test Two");
	}
	
	@Test(priority=3)
	public void testThree()
	{
		System.out.println("Executing Test Three");
	}
	
	@Test(priority=4)
	public void testFour()
	{
		System.out.println("Executing Test Four");
	}
}
