package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.BookMyshowHomepage;

public class BookMyShowTest {
	
	
	public class ModuleTest extends BaseTest{
		@Test
		public void bookMyShow() throws InterruptedException
		{
			BookMyshowHomepage show=new BookMyshowHomepage(driver);
			show.selectRegion();
			show.clickOnFrstBox();
			show.clickOnBookTickets();
			show.selectDate();
			show.selectTime();
			show.selectSeat();
			show.selectSeat();
			show.getCost();
		}
	}
	
}
