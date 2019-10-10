package Test_cases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.LoginPage;
import common_utils.Repository;


public class DriverSetup extends Repository {
	@BeforeClass
	public void beforeSuite() {
		System.setProperty("webdriver.chrome.driver",chromedriver_path);
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--no-sandbox");
//      options.addArguments("--disable-dev-shm-usage");
//		options.addArguments("headless");
//		options.addArguments("window-size=1200x600");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@Test(priority = 1)
	public void login() throws InterruptedException {
		loginpage = new LoginPage(driver);
	    dashboardpage=loginpage.login(username, password);
	}

	@AfterClass
	public void afterSuite() {

   //   driver.quit();
	}
}
	
