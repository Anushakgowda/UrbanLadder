package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.DeliveryPage;
import pages.LivingPage;
import pages.LoginPage;

public class DeliveryDateTest extends BaseTest{
	@Test
	public void Delivery() throws Exception 
	{
		DeliveryPage del=new DeliveryPage(driver);
		LoginPage lp=new LoginPage(driver);
		
		LivingPage living= new LivingPage(driver);
		
		lp.closePopUp();
		Thread.sleep(5000);
		living.clickOnLiving();
		
		Thread.sleep(2000);
		
		living.clickOnLounchChairs();
		Thread.sleep(15000);
		
		del.clickOnFristChair1();
		Thread.sleep(2000);
		
		del.clickColor();
		Thread.sleep(15000);
		del.clickAddtocartredItem();
		Thread.sleep(1500);
		del.getDeliveryDate();
	}

}
