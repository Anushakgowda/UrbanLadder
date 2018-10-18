package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.AllProductsalePage;
import pages.ListPage;
import pages.LoginPage;

public class GetPriceTest extends BaseTest{
	
	
	@Test
	public void removeaddToCart() throws InterruptedException
	{
		
		LoginPage lp=new LoginPage(driver);
		
		AllProductsalePage allProdt=new AllProductsalePage(driver);
		
		ListPage wish=new ListPage(driver);
		
		Thread.sleep(2000);
		
		lp.closePopUp();
		Thread.sleep(2000);
		
		lp.MoveToimage();
		Thread.sleep(2000);
		
		lp.clickOnImgLink();
		Thread.sleep(5000);
		
		
		
		lp.enterUserDetails("anushadk12@gmail.com","urbanladder");
		Thread.sleep(5000);
		
		allProdt.clickSaleLink();
		Thread.sleep(2000);
		
		allProdt.clickOnSofa();
		Thread.sleep(6000);
		
		allProdt.clickOnBarnleyItem();
		Thread.sleep(5000);
		
	
		

		
		wish.getPrice();

}
}