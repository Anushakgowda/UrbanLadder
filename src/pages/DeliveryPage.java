package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DeliveryPage {
	
	public WebDriver driver;
	@FindBy(xpath="(//li[@class='product hovercard'])[1]")
	private  WebElement fristImage;
	
	@FindBy(xpath="(//li[@class='text  colour '])[1]")
	private  WebElement color;
	
	@FindBy(xpath="(//button[@class='primary action-button  add-to-cart'])[3]")
	private  WebElement addCart;
	
	@FindBy(xpath="//div[@class='delivery-date']")
	private  WebElement deliverydate;
	
	
	
	
	public DeliveryPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void clickOnFristChair1() throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		Actions a =new Actions(driver);
		a.moveToElement(fristImage).perform();
		Thread.sleep(2000);
		fristImage.click();
	}
	
	
	public void clickColor()
	{
		color.click();
	}
	public void clickAddtocartredItem()
	{
		addCart.click();
	}
	public void getDeliveryDate()
	{
		String dt = deliverydate.getText();
		Reporter.log(dt,true);
	}
	
}
