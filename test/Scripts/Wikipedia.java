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

public class Wikipedia {
	WebDriver driver;
  @Test
  public void wikipedia() 
  {
	  driver.get("https://wikipedia.org/"); 
	  WebElement englishLink= driver.findElement(By.xpath("//strong[contains(text(),'English')]"));
	  englishLink.click();
	  WebElement searchField = driver.findElement(By.name("search"));
	  searchField.sendKeys("Selenium");
	  WebElement searchIcon = driver.findElement(By.name("go"));
	  searchIcon.click();
	 // WebElement pageHeading = driver.findElement(By.xpath("//h1[@id='firstHeading']/text()"));
	  WebElement pageHeading = driver.findElement(By.id("firstHeading"));
	  String actualHeading = pageHeading.getText();
	  System.out.println(actualHeading);
	  String expectedHeading = "Selenium";
	  Assert.assertEquals(actualHeading, expectedHeading,"Cannot find Selenium");
  }
  @BeforeMethod
  public void beforeMethod() {
		  System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @AfterMethod
  public void afterMethod() 
  {
	driver.quit();
  }

}
