package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Flipkart {
	WebDriver driver;
  @Test
  public void flipkart() 
  {
	  driver.get("https://www.flipkart.com/");
	  WebElement closeLogin = driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
	  closeLogin.click();
		List <WebElement> allFlipkartLinks= driver.findElements(By.tagName("a"));
		allFlipkartLinks.size();
		System.out.println(allFlipkartLinks.size());
		
		for(WebElement oneElement:allFlipkartLinks)
		{
			System.out.println(oneElement.getText()+""+oneElement.getAttribute("href"));
		}
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
