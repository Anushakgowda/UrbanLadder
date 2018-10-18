package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.LoginPage;
import pages.homepage;

public class ModuleTest extends BaseTest{
	@Test
	public void module() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		homepage home=new homepage(driver);
		lp.closePopUp();
		home.header();
	}

}
