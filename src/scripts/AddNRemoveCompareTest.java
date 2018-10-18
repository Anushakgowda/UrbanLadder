package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.AllProductsalePage;
import pages.ListPage;
import pages.LoginPage;

public class AddNRemoveCompareTest  extends BaseTest{
	
	
	@Test
	public void addToCompare() throws InterruptedException
	{
		
		LoginPage lp=new LoginPage(driver);
		
		AllProductsalePage allProdt=new AllProductsalePage(driver);
		
		ListPage wish=new ListPage(driver);
		
		Thread.sleep(2000);
		
		lp.closePopUp();
		Thread.sleep(2000);
		
		
		allProdt.clickSaleLink();
		Thread.sleep(2000);
		
		allProdt.clickOnSofa();
		Thread.sleep(6000);
		
		allProdt.clickOnBarnleyItem();
	
		Thread.sleep(15000);
		
		 wish.clickOnaddToCompare();
		 Thread.sleep(2000);
		 
		 allProdt.clickOnRemoveFromCompare();
		 Thread.sleep(2000);
	}

}
