package ProdLevel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
     
public class Test1 {   // threadpool size ta mane ki and how can i run the test sequencely like test1,2,3 
	WebDriver driver;
  @Test(threadPoolSize = 2, invocationCount = 3)
  public void m1() {
	  System.out.println("1st methdod from Test1");
	  String UD= System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver",UD+"\\Drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  @Test(threadPoolSize = 2, invocationCount = 2)
  public void m2() {
	  System.out.println("2nd method from Test1");
	  String UD= System.getProperty("user.dir");
	  System.setProperty("webdriver.chrome.driver",UD+"\\Drivers\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
}
