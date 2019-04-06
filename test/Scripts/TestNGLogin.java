package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestNGLogin {
	
	WebDriver driver;
  @Test
  public void  LoginTest () {
	  
	    driver.get("http://selenium-examples.nichethyself.com/");
		WebElement username = driver.findElement(By.id("loginname"));
		username.sendKeys("stc123");
		driver.findElement(By.id("loginpassword")).sendKeys("12345");
		driver.findElement(By.id("loginbutton")).click();
		
		String expectedTitle = "My Account";
		String actualTitle = driver.getTitle();
		
		assertEquals(expectedTitle, actualTitle, "Test Case Failed");
		
  }
  @BeforeMethod
  public void beforeMethod() {
	  
  System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.manage().window().maximize();
  
  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
