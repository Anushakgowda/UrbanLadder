package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage  {

	public WebDriver driver;
	
	
	@FindBy(xpath="//a[contains(text(),'Close')]")
	private  WebElement closeBTN;
	
	@FindBy(xpath="//span[contains(@class,'header-icon-link user-profile-icon')]")
	private WebElement loginImage;
	
	@FindBy(xpath="//a[.='Log In']")
	private WebElement loginLink;
	
	
	@FindBy(xpath="(//input[@id='spree_user_email'])[2]")
	private WebElement unTB;
	
	@FindBy(xpath="(//input[@id='spree_user_password'])[3]")
	private WebElement pwTB;
	
	
	@FindBy(xpath="//input[@class='button primary']")
	private WebElement loginBTN;
	
	
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public void verifyTheTitle(String eTitle)
	{
		 WebDriverWait wait=new WebDriverWait(driver,10);
			
			try 
			{
				String aTitle = driver.getTitle();
				wait.until(ExpectedConditions.titleIs(eTitle));
				Assert.assertEquals(aTitle, eTitle);
				Reporter.log("Title is Matching:"+eTitle,true);
				
			} 
			catch (Exception e) 
			{
			
				Reporter.log("Title is not matching: Expected Title is:"+eTitle,true);
				Reporter.log("Actual Title is:"+driver.getTitle(),true);
			}
	}
	
	public void closePopUp()
	{
		closeBTN.click();
	}
	
	public void MoveToimage()
	{
		Actions a =new Actions(driver);
		a.moveToElement(loginImage).perform();
	}
	
	public void clickOnImgLink()
	{
		loginLink.click();
	}
	
	public void enterUserDetails(String un,String pw) throws InterruptedException
	{
		unTB.sendKeys(un);
		pwTB.sendKeys(pw);
		loginBTN.click();
		Thread.sleep(5000);
		
	}
	
	
}
