package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class StoreArrayList {
	
	WebDriver driver;
  @Test
  public void printAllGoogleLinks() 
  {
    driver.get("https://www.google.com"); 
	List <WebElement> allGoogleLinks= driver.findElements(By.tagName("a"));
	
	for(WebElement oneElement:allGoogleLinks)
	{
		System.out.println(oneElement.getText()+""+oneElement.getAttribute("href"));
	}
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
  }

}
