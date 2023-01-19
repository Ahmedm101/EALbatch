package ProdLevel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3 {
	WebDriver driver;
	@Test
	  public void m5() {
		  System.out.println("1st method from Test3 ");
		  String UD= System.getProperty("user.dir");
		  System.setProperty("webdriver.chrome.driver",UD+"\\Drivers\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
	@Test
	  public void m6() {
		  System.out.println("2nd method from Test3 ");
		  String UD= System.getProperty("user.dir");
		  System.setProperty("webdriver.chrome.driver",UD+"\\Drivers\\chromedriver.exe" );
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }
  
}