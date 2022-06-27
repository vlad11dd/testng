package MultipleDataProviders;

import org.testng.annotations.Test;

public class NewTestLogin {
	
	//@Test(dataProviderClass=DataProviders.class,dataProvider="dp1")
	@Test(dataProviderClass=DataProviders.class,dataProvider="dp")
	public void testData(String username, String password, Integer age)
	{
		System.out.println(username+"--"+password+"---"+age);
	}
	
	
	//@Test(dataProviderClass=DataProviders.class,dataProvider="dp2")
	@Test(dataProviderClass=DataProviders.class,dataProvider="dp")
	public void testRegistration(String fname,String lname,String email)
	{
		System.out.println(fname+"--"+lname+"--"+email);
	}
}
