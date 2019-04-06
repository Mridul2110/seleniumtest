package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class YahooCompose {
	WebDriver driver;
	
  @Test
  public void composeMail() throws InterruptedException {
	  driver.get("https://login.yahoo.com/?.src=ym&lang=&done=https%3A%2F%2Fmail.yahoo.com%2F");
	  WebElement emailField = driver.findElement(By.id("login-username"));
	  emailField.sendKeys("hemantpandey49");
	  Thread.sleep(5000);
     //emailField.sendKeys(Keys.RETURN);
   	 WebElement Nxt = driver.findElement(By.id("login-signin"));
	 WebDriverWait wait = new WebDriverWait(driver,30);
	 //wait.until(ExpectedConditions.(driver.findElement(By.xpath("//input[contains(@value,'Next')]"))));
	 Nxt.click();
	  //String currentWindow = driver.getWindowHandle();	 
	  //driver.switchTo().window(currentWindow); 
	 Thread.sleep(5000);
	  Actions action= new Actions(driver);
	  action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
	  Nxt.click(); 
	  wait.until(ExpectedConditions.elementToBeClickable(By.id("login-passwd")));
	  WebElement passwordField = driver.findElement(By.id("login-passwd"));
	  passwordField.sendKeys("hphd199105199410");
	  WebElement Signin = driver.findElement(By.id("login-signin"));
	  Signin.click();
	  //passwordField.sendKeys(Keys.RETURN);
	  WebElement composeButton = driver.findElement(By.xpath("//a[contains(text(),'Compose')]"));
	  composeButton.click();
	  WebElement toField = driver.findElement(By.id("message-to-field"));
	  toField.sendKeys("mridulvashistha@gmail.com");
	  WebElement subjectField = driver.findElement(By.xpath("//input[@data-test-id='compose-subject']"));
      subjectField.sendKeys("Hi Ketan, I am Mridul"); 
      WebElement bodyField = driver.findElement(By.xpath("//div[@data-test-id='rte']"));
      bodyField.sendKeys("I have done my assignment");
      WebElement sendButton = driver.findElement(By.xpath("//button[@data-test-id='compose-send-button']"));
      sendButton.click();
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().deleteAllCookies();
  }

  @AfterMethod
  public void afterMethod() {
	 // driver.quit();
  }

}
