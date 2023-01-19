package Easy_Automation_Lab.All_Task;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v106.browser.model.BrowserCommandId;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon extends Utilities {

	public static void main(String[] args) throws InterruptedException {
		Ibrowser("Edge", "https://www.amazon.com/");
		//task 3 b
		String UrlofHomepage =driver.getCurrentUrl();
		String FRSofHomepage="https://www.amazon.com/";
		if(UrlofHomepage.equalsIgnoreCase(FRSofHomepage)) {
			System.out.println("the url is correct");
		}
		else{
			System.out.println("the url is incorrect");
		}
		
		WebElement Account_and_lists= driver.findElement(By.cssSelector("span[class='nav-line-2 ']"));
		WebDriverWait exwait = new WebDriverWait(driver, Duration.ofSeconds(30));
		exwait.until(ExpectedConditions.elementToBeClickable(Account_and_lists));
		Actions mouse=new Actions(driver);
		mouse.moveToElement(Account_and_lists).build().perform();
	//	Screenshots();
		WebElement SellingAccount = driver.findElement(By.xpath("(//a[@class='nav-link nav-item']/child::span)[17]"));
		exwait.until(ExpectedConditions.elementToBeClickable(SellingAccount));
		mouse.moveToElement(SellingAccount).build().perform();
		mouse.keyDown(Keys.SHIFT).click().build().perform();
		mouse.keyUp(Keys.SHIFT).build().perform();
	    Set<String>	SessionIDs =driver.getWindowHandles();
	    Iterator<String> it=  SessionIDs.iterator();
	    String parentwindow= it.next();
	    String childwindow= it.next();
	    driver.switchTo().window(childwindow);
	    String URLofSellingaccountpage =  driver.getCurrentUrl();
	    String FRSofSellingaccountpage ="https://www.amazon.com/b/?node=12766669011&ld=AZUSSOA-yaflyout&ref_=nav_AccountFlyout_cs_sell";
	    if(URLofSellingaccountpage.equalsIgnoreCase(FRSofSellingaccountpage)) {
	    	System.out.println("the url is correct");
	    }
	    else {
	    	System.out.println("the url is incorrect");
	    }
	   WebElement Searchfield= driver.findElement(By.xpath("//div[@class='nav-search-field ']/descendant::input"));
	   Searchfield.click();
	   Searchfield.sendKeys("Phone");
	   mouse.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
	   mouse.keyUp(Keys.CONTROL).build().perform();
	   mouse.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
	   mouse.keyUp(Keys.CONTROL).build().perform();
	   WebElement SearchIcon=  driver.findElement(By.cssSelector("span[id='nav-search-submit-text']>input:first-of-type"));
	   SearchIcon.click();
	   driver.switchTo().window(parentwindow);
	   driver.navigate().refresh();
	  
	   WebElement All=   driver.findElement(By.cssSelector("select[id='searchDropdownBox']"));
	   //All.click();
	   WebDriverWait exwait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
	   exwait1.until(ExpectedConditions.elementToBeClickable(All));
	   All.click();
	  WebElement Searchfield1 = driver.findElement(By.xpath("//div[@class='nav-search-field ']/descendant::input"));
	  Searchfield1.click();
	  mouse.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
	  mouse.keyUp(Keys.CONTROL).build().perform();
	  driver.quit();
	   
	    // create exwait in child window but if you are in same iwndow you odnt have to make explicit wait 
		// set string you will have to make new after very new window opens 
		

	}
	//selling account show css
	// please check the url string line 20 and 42
	//pg 84 use desendant xpath you mean the locator will be decendant and take help of class or id from ancestor? line 50
    // what happens when you do test run and so many ss taken that time delete the extra ones
	
}
