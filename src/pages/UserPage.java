package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BaseTest;

public class UserPage {
	
public	WebDriver driver;
	
	@FindBy(xpath="//a[@title='Wishlist']")
	private WebElement wishListIMG;
	

	@FindBy(xpath="//div[@class='wishproduct wishblock']")
	private WebElement wishList;
	
	
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logOutBTN;
	
	
	public UserPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void ClickOnWishListImg()
	{
		Actions a=new Actions(driver);
		a.moveToElement(wishListIMG).perform();
		wishListIMG.click();
	}
	
	public void ClickOnWishList()
	{
		Actions a=new Actions(driver);
		a.moveToElement(wishList).perform();
		wishList.click();
	}

	public void clickONLogout()
	{
		logOutBTN.click();
	}
	
}
