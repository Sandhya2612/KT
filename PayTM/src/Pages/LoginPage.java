package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPage {
	
		WebDriver driver;
		
		@FindBy(id="inputEmail")
		public WebElement email;
		
		@FindBy(id="inputPassword")
		public WebElement password;
		
		@FindBy(xpath="/html/body/div/div/form/button")
		public WebElement signin;
		
		public LoginPage(WebDriver driver)
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}	
		
		public DashboardPage login(String uname,String pwd) {
			
			email.clear();
			password.clear();
			email.sendKeys(uname);
			password.sendKeys(pwd);
			signin.click();
			return new DashboardPage(driver);
		}
	

}
