package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.LivingPage;
import pages.LoginPage;

public class LivingTest extends BaseTest {


	@Test
	public void livingCompare()throws InterruptedException
	{
		
		LoginPage lp=new LoginPage(driver);
		
		LivingPage living= new LivingPage(driver);
		Thread.sleep(3000);
		lp.closePopUp();
		Thread.sleep(5000);
		living.clickOnLiving();
		
		Thread.sleep(2000);
		
		living.clickOnLounchChairs();
		Thread.sleep(15000);
		
		living.clickOnFristChair();
		Thread.sleep(2000);
		
		living.clickOnSecondChair();
		Thread.sleep(10000);
		
		living.clickOnCompareBTN();
		Thread.sleep(2000);
}
	
}
