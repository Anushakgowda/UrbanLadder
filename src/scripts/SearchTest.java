package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.LoginPage;
import pages.searchpage;

public class SearchTest extends BaseTest
{
	@Test
	public void search() throws InterruptedException
	{
	LoginPage lp=new LoginPage(driver);
	searchpage search=new searchpage(driver);
	
	lp.closePopUp();
	search.enterText("sofa");
	
	Thread.sleep(5000);
	
	search.clickOnItem();
	Thread.sleep(5000);
	search.getText();

}
}