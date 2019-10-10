package common_utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.DashboardPage;
import Pages.LoginPage;
import Pages.PropertyPage;


public class Repository {
	public static WebDriver driver;
	public static LoginPage loginpage;
	public static DashboardPage dashboardpage;
	public static PropertyPage propertypage;
	
	
	public static String chromedriver_path = "./driver/chromedriver";
	public static String url = "http://paytm-staging.axisrooms.com";
	
	public static String username = "7411569912@paytm.com";
	public static String password = "7411569912";
    
	
	public static boolean isAvailable(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 40);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	public static boolean isVisible(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			return false;
		}
		return true;

	}
}
