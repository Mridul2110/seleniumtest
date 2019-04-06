package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class GmailNewTab {
	WebDriver driver;
  @Test
  public void gmailNewTab() throws Exception {
	  
	  driver.get("https://www.google.com");
	  
	  String parentWindowId = driver.getWindowHandle();
	  WebDriverWait wait = new WebDriverWait(driver,30);
	//  wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@href=\"https://mail.google.com/mail/?tab=wm\"][contains(text(),'Gmail')]"))));
	  WebElement gmailLink = driver.findElement(By.xpath("//a[@href=\"https://mail.google.com/mail/?tab=wm\"][contains(text(),'Gmail')]"));
	  //gmailLink.click();
	  Actions action= new Actions(driver);
	  Action openInNewTab=  action.moveToElement(gmailLink)
		        .keyDown(Keys.CONTROL)
		        .sendKeys(Keys.SHIFT)
		        .click()
		        .build();
	  openInNewTab.perform();
	  
	  /*Action switchTab = action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build();
	  switchTab.perform();
	  openInNewTab.perform();*/
	  
	/*Set<String> allWindow=  driver.getWindowHandles();
	
	for(String oneWindow : allWindow) {
		if(!oneWindow.equals(parentWindowId)) {
			driver.switchTo().window(oneWindow);
			 try {
			 System.out.println(driver.getCurrentUrl());
			 break;
			 }
			 catch(NoSuchElementException e) {
				 
			 }
		}
	}*/
	  
	  //driver.switchTo().window(parentWindowId);
	  System.out.println(driver.getTitle());
    WebElement googleSearch = driver.findElement(By.id("q"));
    Thread.sleep(5000);
    googleSearch.sendKeys("Selenium jobs in pune");
	  
	        

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
