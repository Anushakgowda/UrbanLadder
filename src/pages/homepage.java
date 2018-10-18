package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class homepage {
	public WebDriver driver;
	@FindBy(xpath="//a[contains(text(),'Close')]")
	private  WebElement closeBTN;
	
	
	@FindBy(xpath="//span[@class='topnav_itemname']|//a[.='Interiors']")
	private List<WebElement> header;
	
	
	
	
	
	public homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void closeBotton()
	{
		closeBTN.click();
	}
	public void header() throws InterruptedException
	{
		
		for(WebElement h:header)
		{
			 Thread.sleep(2000);
		
		
		
		 String text1=h.getText();
		 System.out.println(text1);
		 
		 System.out.println("------------------------");
		Assert.assertEquals(text1,"Sale");
	}

}
}


