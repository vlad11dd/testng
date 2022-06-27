import org.testng.SkipException;
import org.testng.annotations.Test;

public class Test_2 {

	@Test
	public void testCaptureScreen()
	{
		System.out.println("Capturing Screen");
		throw new SkipException("Skipping This TestCase");
	}


}
