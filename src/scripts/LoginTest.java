package scripts;

import org.testng.annotations.Test;
import generic.BaseTest;
import pages.LoginPage;
import pages.UserPage;

public class LoginTest extends BaseTest {
	
	@Test
	public void loginLogout() throws InterruptedException
	{
		
		LoginPage lp=new LoginPage(driver);
		UserPage up=new UserPage(driver);
		Thread.sleep(2000);
		
		lp.closePopUp();
		Thread.sleep(2000);
		
		lp.MoveToimage();
		Thread.sleep(2000);
		
		lp.clickOnImgLink();
		Thread.sleep(5000);
		
		
		
		lp.enterUserDetails("anushadk12@gmail.com","urbanladder");
		Thread.sleep(5000);
		
		String eTitle="Furniture Online: Buy Home Wooden Furniture in India @ 30% OFF - Urban Ladde";
		Thread.sleep(2000);
		
		lp.verifyTheTitle(eTitle);
		
		
		lp.MoveToimage();
		Thread.sleep(2000);

		
		up.clickONLogout();
	}

}
