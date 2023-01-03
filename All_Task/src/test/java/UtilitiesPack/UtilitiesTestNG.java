package UtilitiesPack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class UtilitiesTestNG {
	
    public WebDriver driver;
  
  @BeforeClass
  public void beforeClass() {
	  Ibrowser("chrome","https://www.amazon.com");
	  
  }

  @AfterClass
  public void afterClass() throws IOException {
	  Screenshot("//Screenshots//Amazon//");
  }
  public void Ibrowser(String NameOftheBrowser, String Url) {
		String UD=	 System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",UD+"\\Drivers\\chromedriver.exe" );
		
		if(NameOftheBrowser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.get(Url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(NameOftheBrowser.equalsIgnoreCase("Edge")) {
			System.getProperty("user.dir");
			System.setProperty("webdriver.edge.driver", UD+"\\Drivers\\msedgedriver.exe");
			driver= new EdgeDriver();
			driver.get(Url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}
  public void Screenshot(String folder) throws IOException {
		String UD= System.getProperty("user.dir");
		Date dateformat = new Date();
		String DATE = dateformat.toString().replace(":", "_").replace(" ", "_");
		File SS =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		
			FileHandler.copy(SS,new File(UD+folder+DATE+"all_ss.jpg"));
  }
}