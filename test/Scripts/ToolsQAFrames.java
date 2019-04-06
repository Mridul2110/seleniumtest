package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ToolsQAFrames {
	WebDriver driver;
  @Test
  public void framesSwitch() {
	  driver.get("https://www.toolsqa.com/iframe-practice-page/");
	  WebDriverWait wait = new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("iframe1")));
      //driver.switchTo().frame("iframe1");
	  wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("firstname"))));
	  //wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[contains(text(),'Automation Practice Form')]"))));
      String currentFrame1 = driver.findElement(By.xpath("//h1[contains(text(),'Automation Practice Form')]")).getText();
      assertEquals(currentFrame1,"Automation Practice Form");
      WebElement firstName = driver.findElement(By.name("firstname"));
	  firstName.sendKeys("Mridul");
	  //driver.switchTo().defaultContent();
	  wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.name("iframe2")));
	  //driver.switchTo().frame("iframe2");
	  String currentFrame2  = driver.findElement(By.xpath("//h1[contains(text(),'Error establishing a database connection')]")).getText();
	  assertEquals(currentFrame2,"Error establishing a database connection");
	  driver.switchTo().defaultContent();
	  String parentFrame = driver.findElement(By.xpath("//h1[contains(text(),'IFrame practice page')]")).getText();
	  assertEquals(parentFrame,"IFrame practice page");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.switchTo().defaultContent();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
