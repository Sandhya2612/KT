package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;
	
	@FindBy(id="property-dd-create-hotel")
	public WebElement createHotel;
	
	@FindBy(xpath="//*[@id=\"hotelDetailsList_filter\"]/label/input")
	public WebElement searchProperty;
	
	@FindBy(className="hotel_id_link")
	public WebElement selectHotel;
	
	@FindBy(className="btn-status-danger")
	public WebElement inActive;
	
	@FindBy(className="btn-status-success")
	public WebElement Active;
	
//--------------Create Property elements-----------
	
	@FindBy(xpath="//*[@class='fa fa-plus']")
	public WebElement createButton;
	
	
	
	public DashboardPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	
	public void searchProperty()
	{
		searchProperty.sendKeys("1639");
		
	}
	
	public PropertyPage selectProperty()
	{
		selectHotel.click();
		return new PropertyPage(driver);
	}
	
	public PropertyPage clickCreate()
	{
		createButton.click();
		return new PropertyPage(driver);
	}
	
}
