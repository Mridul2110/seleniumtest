package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class RefreshMethods {
	WebDriver driver;
  @Test
  public void refreshMethods() {
	  driver.get("https://accounts.google.com");
	  driver.findElement(By.name("identifier")).sendKeys(Keys.F5);
	  driver.navigate().refresh();
	  driver.navigate().to(driver.getCurrentUrl());
	  driver.get(driver.getCurrentUrl());
	  driver.findElement(By.name("identifier")).sendKeys("\uE035");
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
  }

}
