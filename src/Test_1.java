import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_1 
{

	/*    Annotations in TestNG:
		
		 1. @Test
		
		 2. @BeforeMethod
		
		 3. @AfterMethod
		
		 4. @Before Test
		
		 5. @After Test
		
		 6. @BeforeSuite
				
		 7. @After Suite*/
		
		
	//BeforeSuite annotation will be called before calling any testcases from this
	//class and testcases from other classes. It will be called only once
	
	@BeforeSuite

	public void runSeleniumServer()	
	{
		System.out.println("Starting Selenium Server");
	}
	
	//@BeforeTest annotation will be called before calling any of the testng annotation
	//of this class. It will be called only once
	
	@BeforeTest
	public void opendbConnection ()
	{
		System.out.println("Create db connection");
	}
	//BeforeMethod Annotation is called before executing every testcase

	
	@BeforeMethod ()
	public void openBrowser()
	{
		System.out.println("Opening Browser");
	}
	
	@Test
	public void testLogin()
	{
		System.out.println("Testing Login Screen");
	}
	
	
	@Test
	public void testFormFill()
	{
		System.out.println("Filling up Registration Form");
	}
	
	//AfterMethod Annotation is called after executing every testcase
	
	@AfterMethod
	public void closeBrowser ()
	{
		System.out.println("Closing Browser");
	}
	
	//After Test annotation will be called after calling all testcases or test annotations.
	// It will be called once
	
	
	@AfterTest
	public void closedbConnection ()
	{
		System.out.println("Closing db Connection");
	}
		
	//AfterSuite annotation will be called after calling any testcases from this class and
	// testcases from other classes . It will be called only once
	
	@AfterSuite
	public void stopSeleniumServer()
	{
		System.out.println("Stopping Selenium Server");
	}
	
	
}
