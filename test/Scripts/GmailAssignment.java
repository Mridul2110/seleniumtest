package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class GmailAssignment {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  driver.get("https://www.google.com");
	  WebElement gmailLink = driver.findElement(By.xpath("//a[@href=\"https://mail.google.com/mail/?tab=wm\"][contains(text(),'Gmail')]"));
	  gmailLink.click();
	  WebElement emailField = driver.findElement(By.xpath("//input[@type='email']"));
	  emailField.sendKeys("abc");
	  WebElement Nxt = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	  Nxt.click();
	  WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
	  passwordField.sendKeys("abc");
	  WebElement SignInbtn = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
	  SignInbtn.click();
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  
	  System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
