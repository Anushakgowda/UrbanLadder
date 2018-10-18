package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.LoginPage;
import pages.UserPage;

public class RemoveFromWishlistTest extends BaseTest {
	
	@Test
	public void removewishList() throws InterruptedException
	{
		
		LoginPage lp=new LoginPage(driver);
		
		UserPage user=new UserPage(driver);
		
	
		
		Thread.sleep(2000);
		
		lp.closePopUp();
		Thread.sleep(2000);
		
		lp.MoveToimage();
		Thread.sleep(2000);
		
		lp.clickOnImgLink();
		Thread.sleep(5000);
		
		lp.enterUserDetails("anushadk12@gmail.com","urbanladder");
		Thread.sleep(5000);
		
		user.ClickOnWishListImg();
		Thread.sleep(5000);
		
		user.ClickOnWishList();
		
		 
	}

}
