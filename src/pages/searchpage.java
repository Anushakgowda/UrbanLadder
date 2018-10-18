package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class searchpage
{
	public	WebDriver driver;
	@FindBy(xpath="//input[@id='search']")
	private WebElement searchTB;
	
	@FindBy(xpath="(//a[@data-ga='Image'])[1]")
	private WebElement sofa;
	
	
	
	@FindBy(xpath="//span[@class='text']")
	private WebElement text;



public searchpage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}


public void enterText(String txt) throws InterruptedException
{
	searchTB.sendKeys(txt);
	Thread.sleep(1000);
	searchTB.sendKeys(Keys.ENTER);
	
}

public void clickOnItem()
{
	sofa.click();
}


public void getText()
{
String text1=text.getText();
Reporter.log(text1,true);
}










}
