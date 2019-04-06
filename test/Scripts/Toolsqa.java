package Scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Toolsqa {
	WebDriver driver;
  @Test
  public void practiceForm() 
  {
	  driver.get("http://toolsqa.com/automation-practice-form/");
	  WebElement firstName = driver.findElement(By.name("firstname"));
	  firstName.sendKeys("Mridul");
	  System.out.println(firstName.getAttribute("value"));
	  WebElement lastName = driver.findElement(By.name("lastname"));
	  lastName.sendKeys("Vashistha");
	  System.out.println(lastName.getAttribute("value"));
	  WebElement maleRadioButton = driver.findElement(By.id("sex-0"));
	  maleRadioButton.click();
	  WebElement experience = driver.findElement(By.id("exp-5"));
	  experience.click();
	  WebElement dateField = driver.findElement(By.id("datepicker"));
	  dateField.sendKeys("07-03-2019");
	  WebElement manualTester = driver.findElement(By.id("profession-0"));
	  manualTester.click();
	  WebElement automationTester = driver.findElement(By.id("profession-1"));
	  automationTester.click();
	  WebElement qtp = driver.findElement(By.id("tool-0"));
	  qtp.click();
	  WebElement seleniumIDE = driver.findElement(By.id("tool-1"));
	  seleniumIDE.click();
	  WebElement seleniumWebdriver = driver.findElement(By.id("tool-2"));
	  seleniumWebdriver.click();
	  WebElement continent = driver.findElement(By.id("continents"));
	  Select continentDropdown = new Select(continent);
	  continentDropdown.selectByVisibleText("Australia");
	  WebElement seleniumCommands = driver.findElement(By.id("selenium_commands"));
	  Select seleniumCommandsDropdown = new Select(seleniumCommands);
	  seleniumCommandsDropdown.selectByVisibleText("Wait Commands");
	  //WebElement text1 = driver.findElement(By.className("bcd"));
	  //String text2 = driver.findElement(By.xpath("//*[@id=\"NextedText\"]/text()")).getText();
	  String text = driver.findElement(By.className("abc")).getText();
	  //String text = driver.findElement(By.xpath("//text()[contains(., 'Text2')]")).toString();
	  String expectedText = "Text1\n"+"Text2";
	  //String text = "Text"
	  System.out.println();
	  Assert.assertEquals(text, expectedText);
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
	  //driver.quit();
  }

}
