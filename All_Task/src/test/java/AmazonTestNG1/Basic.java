package AmazonTestNG1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Basic {
  @Test
  public void f() {
	  System.out.println("this is the test method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is the before method");	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is the after method");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is the beforeclass method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is the after class method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is the before test method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is the after test method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is before suite method");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is after suite method");
  }
  @Test
  public void Test2() {
	  System.out.println("this is test 2");
  }

}
