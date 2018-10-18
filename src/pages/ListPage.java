package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ListPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//span[.='Add to Wishlist']")
	private WebElement wishlist;
	
	@FindBy(xpath="(//button[@name='button'])[1]")
	private WebElement addToCart;
	

	@FindBy(xpath="//div[@class='add-to-compare text-center']")
	private WebElement addToCompare;
	
	@FindBy(xpath="//div[@id='cart-badge']")
	private WebElement cartIMG;
	
	@FindBy(xpath="(//div[@class='icofont-cross_thin'])[2]")
	private WebElement remove;
	
	@FindBy(xpath="//button[@id='compare-cta']")
	private WebElement newcompareBTN;
	
	@FindBy(xpath="//div[@class='price discounted-price']")
	private WebElement price ;
	
	
	
	public  ListPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void clickWishList()
	{
		wishlist.click();
	}
	
	
	public void clickOnaddToCart()
	{
		addToCart.click();
	}
	
	public void clickOnaddToCompare()
	{
		addToCompare.click();
	}
	

	public void clickonCratImg()
	{
		cartIMG.click();
	}
	
	public void clickOnRemove()
	{
		remove.click();
	}
	
	
	
	
	public void clickOnNewCompareBtn()
	{
		newcompareBTN.click();
	}
	
	
	
	public void getPrice()
	{
		String text = price.getText();
		Reporter.log(text,true);
	}
}
