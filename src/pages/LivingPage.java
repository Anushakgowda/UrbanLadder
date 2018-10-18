package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LivingPage {
public WebDriver driver;
	
	@FindBy(xpath="(//span[@class='topnav_itemname'])[2]")
	private WebElement livingDropDown;


	@FindBy(xpath="//span[.='Lounge Chairs']")
	private  WebElement lounchChairs;
	
	
	@FindBy(xpath="(//li[@class='product hovercard'])[1]")
	private  WebElement fristImage;
			
	@FindBy(xpath="(//a[@class='button button-with-border add-to-compare'])[1]")
	private  WebElement fristChair;
	
	@FindBy(xpath="(//li[@class='product hovercard'])[3]")
	private  WebElement secondImage;
	
	@FindBy(xpath="(//a[@class='button button-with-border add-to-compare'])[4]")
	private  WebElement secondChair;
	
	
	
	@FindBy(xpath="//button[.='Compare']")
	private  WebElement compareBTN;
	
	
	public LivingPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnLiving()
	{
		Actions a =new Actions(driver);
		a.moveToElement(livingDropDown).perform();
	}
	

	public void clickOnLounchChairs()
	{
		lounchChairs.click();
		
	}
	
	public void clickOnFristChair() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		Actions a =new Actions(driver);
		a.moveToElement(fristImage).perform();
		Thread.sleep(2000);
		fristChair.click();
	}
	

	public void clickOnSecondChair() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(4000);
		Actions a1 =new Actions(driver);
		a1.moveToElement(secondImage).perform();
		Thread.sleep(8000);
		Actions a =new Actions(driver);
		a.moveToElement(secondChair).perform();
		Thread.sleep(4000);
		secondChair.click();
	}
	
	
	
	public void clickOnCompareBTN() throws InterruptedException
	{
		Thread.sleep(3000);
		compareBTN.click();
	}

}
