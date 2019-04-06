package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class ThirdOptiom {
	
	WebDriver driver;
  @Test
  public void dropDown() throws InterruptedException {
	  
	  driver.get("https://the-internet.herokuapp.com/dropdown"); 
	  WebElement selectElement = driver.findElement(By.xpath("//select[@id='dropdown']"));
	  List <WebElement> dropdownOptions = driver.findElements(By.tagName("option"));
	  Select dropdown = new Select(selectElement);
	  dropdown.selectByValue("2");
	  String ExpectedOption = dropdownOptions.get(2).getText();
	  System.out.println(ExpectedOption);
	  String SelectedOption = dropdown.getFirstSelectedOption().getText();
	  //String ExpectedOption = "Option 2";
	  Assert.assertEquals(SelectedOption, ExpectedOption);
	  Thread.sleep(3000);
	  
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
