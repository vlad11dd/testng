import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_Parameterization 
{

	
	@Test(dataProvider="getData")
	public void testFormFill(String username, String password, Integer age)
	{
		System.out.println(username+"--"+password+"---"+age);
	}

	

	@DataProvider
	public Object[][] getData()
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

	

	
}
