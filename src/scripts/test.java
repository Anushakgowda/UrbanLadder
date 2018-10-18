package scripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import generic.GernericUtilies;

public class test extends GernericUtilies {
	

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/home/tyss/Downloads/geckodriver");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.urbanladder.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
	 List<WebElement> header = driver.findElements(By.xpath("//span[@class='topnav_itemname']|//a[.='Interiors']"));
	Actions a=new Actions(driver);
	for(WebElement h:header)
	{
		 Thread.sleep(2000);
	 a.moveToElement(h).perform();
	 Thread.sleep(2000);
	// GernericUtilies.screenshot(driver);
	 String text1=h.getText().toLowerCase();
	 System.out.println(text1);
	 System.out.println("------------------------");
	
	 List<WebElement> list=driver.findElements(By.xpath("//a[@class='inverted']"));
	 
	for(WebElement a1:list)
	{
		if(a1.getAttribute("href").contains("topnav_"+text1))
		{
		System.out.println(a1.getText());
		
	}	
		 
	}
	 System.out.println("------------------------");
	}
	driver.close();
}
}
