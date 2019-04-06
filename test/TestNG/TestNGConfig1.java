package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGConfig1 {
  @Test
  public void test1() {
	  System.out.println("Inside test1 inside TestNGConfig1");
  }
  @Test
  public void test2() {
	  System.out.println("Inside test2 inside TestNGConfig1");
  }
  @Test
  public void test3() {
	  System.out.println("Inside test2 inside TestNGConfig1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside beforeMethod inside TestNGConfig1");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside afterMethod inside TestNGConfig1");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside beforeClass inside TestNGConfig1");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Inside afterClass inside TestNGConfig1");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside beforeTest inside TestNGConfig1");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Inside afterTest inside TestNGConfig1");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Inside beforeSuite inside TestNGConfig1");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Inside afterSuite inside TestNGConfig1");
  }

}
