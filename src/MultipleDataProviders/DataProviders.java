package MultipleDataProviders;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {
	/*
	@Test(dataProvider="dp1")
	public void testFormFill(String username, String password, Integer age)
	{
		System.out.println(username+"--"+password+"---"+age);
	}
	
	@DataProvider(name="dp1")
	public static Object[][] getData1()
	{
		Object[][] data=new Object[2][3];
		
		data[0][0]="vaishalibakale@gmail.com";
		data[0][1]="pass123";
		data[0][2]=29;

		data[1][0]="vairajapu@gmail.com"; 
		data[1][1]="pass456";
		data[1][2]=39;
		return data;
		
	}
	
	@DataProvider(name="dp2")
	public static Object[][] getData2()
	{
		Object[][] data=new Object[2][3];
		
		data[0][0]="vallabh";
		data[0][1]="D";
		data[0][2]="vallabh@gmail.com";

		data[1][0]="dadu"; 
		data[1][1]="Z";
		data[1][2]="dadu@gmail.com";
		return data;
		
	}*/
	
	@DataProvider(name="dp")
	public static Object[][] getData(Method m)
	{
		Object[][] data=null;
		
		if(m.getName().equals("testData"))
		{
			data=new Object[2][3];
		
			data[0][0]="vallabh@gmail.com";
			data[0][1]="pass123";
			data[0][2]=25;

			data[1][0]="dadu@gmail.com"; 
			data[1][1]="pass456";
			data[1][2]=12;
			
		}
		else if(m.getName().equals("testRegistration"))
		{
			data=new Object[2][3];
			data[0][0]="vallabh";
			data[0][1]="D";
			data[0][2]="vallabh@gmail.com";

			data[1][0]="dadu"; 
			data[1][1]="Z";
			data[1][2]="dadu@gmail.com";
				
		}
		return data;
		
		
		
	}
}
