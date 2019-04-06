package Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "test\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://selenium-examples.nichethyself.com/");
		WebElement username = driver.findElement(By.id("loginname"));
		username.sendKeys("stc123");
		driver.findElement(By.id("loginpassword")).sendKeys("12345");
		driver.findElement(By.id("loginbutton")).click();
		driver.manage().window().maximize();
		
		String expectedTitle = "My account";
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle))
		{
		System.out.println("Login Test Case Passed");
		}
		else
		{
			System.out.println("Login Test Case failed");
		}
	}

}
