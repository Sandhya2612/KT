package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver");
		WebDriver driver=new ChromeDriver();
       driver.get("https://accounts.google.com/signup");
      WebElement firstname=driver.findElement(By.id("firstName"));
      WebElement lastname=driver.findElement(By.id("lastName"));
      WebElement username=driver.findElement(By.id("username"));
      WebElement password=driver.findElement(By.xpath("//*[@id=\"passwd\"]/div[1]/div/div[1]/input"));
      WebElement confirmpwd=driver.findElement(By.xpath("//*[@id=\"confirm-passwd\"]/div[1]/div/div[1]/input"));
      WebElement next=driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/span/span"));
      firstname.sendKeys("Sandhya");
      lastname.sendKeys("Reddy");
      username.sendKeys("sandhya261294");
      password.sendKeys("Sandhya@2612");
      confirmpwd.sendKeys("Sandhya@2612");
      next.click();
      Thread.sleep(4000);
      WebElement phone=driver.findElement(By.id("phoneNumberId"));
      phone.sendKeys("9880067069");
      
       
	}

}
