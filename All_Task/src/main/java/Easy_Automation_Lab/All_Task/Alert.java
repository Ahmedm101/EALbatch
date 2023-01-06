package Easy_Automation_Lab.All_Task;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Alert extends Utilities{

	public static void main(String[] args) throws InterruptedException {
		Ibrowser("edge", "https://www.hyrtutorials.com");
		
	    WebElement SeleniumPractise=	driver.findElement(By.cssSelector("ul[id='nav1']>li:nth-of-type(4)>a"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(SeleniumPractise).build().perform();
		Screenshot();
	    WebElement Alert =	driver.findElement(By.cssSelector("li[class='parent']~li:nth-of-type(9)>a"));
	    mouse.moveToElement(Alert).click().build().perform();
	    WebElement Alert1=   driver.findElement(By.cssSelector("button[id='alertBox']"));
	    Java_Script_Utilities.jsClick(driver, Alert1);
	    driver.switchTo().alert().accept();
	    Screenshot();
	   Thread.sleep(3000);
	    WebElement Alert2 = driver.findElement(By.cssSelector("button[id='confirmBox']"));
	   Alert2.click();
	 
	    driver.switchTo().alert().accept();
	    Screenshot();
	    Thread.sleep(3000);
	    Alert2.click();
	    driver.switchTo().alert().dismiss();
	    Screenshot();
	    Thread.sleep(2000);
	   WebElement Alert3 = driver.findElement(By.cssSelector("button[id='promptBox']"));
	   Alert3.click();
	   driver.switchTo().alert().sendKeys("xxx");
	   // ekhane sscreenshot dile accept ta hochena keno?
	  Thread.sleep(2000);
	   driver.switchTo().alert().accept();
	   Screenshot();
	   driver.close();
		
		
		//* i had to use here thread nahole hochilona, so in work sometimes i need to use thread or do explicit 
	  
	}
	public static void Screenshot() {
	String UD=	System.getProperty("user.dir");
	Date Dateformat = new Date();
	String DATE = Dateformat.toString().replace(":", "_").replace(" ", "_");
	File SS= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(SS,new File(UD+"\\Screenshots\\Alert\\"+DATE+"All_ss.jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}

}
