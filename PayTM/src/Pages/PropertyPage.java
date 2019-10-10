package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertyPage {
 WebDriver driver;
 
    @FindBy(id="hotelName")
    public WebElement hotelName;
    
    @FindBy(id="displayname")
    public WebElement displayName;
    
    @FindBy(className="select2-search__field")
    public WebElement hotelType;
    
    @FindBy(xpath="//span[@class='select2-selection select2-selection--multiple']")
    public WebElement propertyTheme;
    
    
 
	public PropertyPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
}
