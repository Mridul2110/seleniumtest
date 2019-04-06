package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SeleniumWaitTest {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2"); 
	 
	  WebElement Start = driver.findElement(By.xpath("//div[@id='start']/button"));
	  Start.click();
	  WebElement finish = driver.findElement(By.id("finish"));
	  String DisplayedText= finish.getText();
	  Assert.assertEquals(DisplayedText,"Hello World!");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() {
driver.quit();
  }

}
