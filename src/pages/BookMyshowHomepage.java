package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookMyshowHomepage {
	public WebDriver driver;
	@FindBy(xpath="(//li[class='region-list'])[3]")
	private  WebElement region;
	
	@FindBy(xpath="(//div[@class='card-img'])[1]")
	private  WebElement firstImg;
	
	@FindBy(xpath="//a[.='Book Tickets']")
	private  WebElement bookTickets;
	
	@FindBy(xpath="//li[@class='_active _slick']")
	private  WebElement date;
	
	@FindBy(xpath="(//a[contains(@class,'showtime-link')])[3]")
	private  WebElement time;
	
	@FindBy(xpath="//li[@id='pop_1']")
	private  WebElement noOfSeats;
	
	@FindBy(xpath="(//a[@class='_available'])[1]")
	private  WebElement selectSeat;
	
	@FindBy(xpath="//a[@id='btmcntbook']")
	private  WebElement cost;
	
	
	

	public BookMyshowHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public void selectRegion()
	{
		region.click();
	}
	public void clickOnFrstBox()
	{
		firstImg.click();
	}
	public void clickOnBookTickets()
	{
	bookTickets.click();
	}
	public void selectDate()
	{
		date.click();
	}
	public void selectTime()
	{
		time.click();
	}
	public void selectSeat()
	{
		selectSeat.click();
	}
	public void getCost()
	{
		cost.getText();
	}
	
	
}
