package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllProductsalePage {
	
	WebDriver driver;
	
	@FindBy(xpath="(//span[@class='topnav_itemname'])[1]")
	private WebElement saleDropDown;
	
	@FindBy(xpath="//span[.='Sofas']")
	private WebElement sofaLink;
	
	
	@FindBy(xpath="(//img[contains(@alt,'Barnley Single Over')])[1]")
	private WebElement barnleyItem;
	
	
	@FindBy(xpath="(//img[@alt='Genoa Wing Chair (Floral)'])[1]")
	private WebElement compareItemOne;
	
	@FindBy(xpath="//img[@alt='Genoa Wing Chair']")
	private WebElement compareItemTwo;
	
	@FindBy(xpath="//span[@class='remove-prod icofont-cross']")
	private WebElement removeFromCOmpare;

	
	
	public AllProductsalePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	 public void  clickSaleLink()
	 {
		 Actions a =new Actions(driver);
			a.moveToElement(saleDropDown).perform();
	 }
	
	 public void clickOnSofa() throws InterruptedException
	 {
		 sofaLink.click();
		 Thread.sleep(10000);
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,2300)");
		
	 }
	 
	public void clickOnBarnleyItem()
	{
		barnleyItem.click();
	}
	
	public void clickOncompareItemOne()
	{
		compareItemOne.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2300)");
	}
	
	
	public void clickOncompareItemTwo()
	{
		compareItemTwo.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2500)");
	}
	
	public void clickOnRemoveFromCompare()
	{
		removeFromCOmpare.click();
	}
}
