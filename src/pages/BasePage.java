package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
 public  void verifyTitle(String eTitle)
 {
	 System.out.println(eTitle);
	 WebDriverWait wait=new WebDriverWait(driver,10);
		
	try {
		wait.until(ExpectedConditions.titleContains(eTitle));
		Reporter.log("Title is Matching:"+eTitle,true);
		
	} catch (Exception e) 
	{
	
		Reporter.log("Title is not matching: Expected Title is:"+eTitle,true);
		Reporter.log("Actual Title is:"+driver.getTitle(),true);
	}
 }
}
