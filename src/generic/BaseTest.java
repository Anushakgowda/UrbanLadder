package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void openApplication()
	{
		System.setProperty("webdriver.gecko.driver","/home/tyss/Downloads/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/home/tyss/Downloads/chromedriver");
		 driver=new ChromeDriver();
	//	driver.get("https://www.urbanladder.com/");
		driver.get("https://in.bookmyshow.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void closeApplication(ITestResult res)
	{
		int status = res.getStatus();
		if(status==2)
		{
			String name = res.getMethod().getMethodName();
			GernericUtilies.screenshot(driver,name);
		}
		driver.close();
		
	}

}
