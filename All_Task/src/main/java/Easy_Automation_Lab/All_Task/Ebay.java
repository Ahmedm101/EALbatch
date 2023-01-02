package Easy_Automation_Lab.All_Task;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.implementation.bytecode.ShiftLeft;

public class Ebay extends Utilities {

	public static void main(String[] args) throws InterruptedException, IOException {
		Ibrowser("chrome", "https://www.ebay.com");
		driver.navigate().back();
		driver.navigate().forward();
		String UrlofHomepage =driver.getCurrentUrl();
		String FRSofHomepage="https://www.ebay.com/";
		if(UrlofHomepage.equalsIgnoreCase(FRSofHomepage)) {
			System.out.println("the url is correct");
		}
		else {
			System.out.println("the url is incorrect");
		}
	   WebElement myEbay=	driver.findElement(By.xpath("(//div[@class='gh-menu']/child::a[@class='gh-eb-li-a gh-rvi-menu'])[1]"));
	   Actions mouse = new Actions(driver);
	   mouse.moveToElement(myEbay).build().perform();
	   Screenshot("\\Screenshots\\Ebay\\");
	   WebElement Summary= driver.findElement(By.xpath("(//ul[@id='gh-ul-nav']/descendant::a)[1]"));
	   mouse.moveToElement(Summary).click().build().perform();
	   String UrlofSignInpage = driver.getCurrentUrl();
	   String FRSofSignInpage = "https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2Fmye%2Fmyebay%2Fsummary\r\n";
	   if(UrlofSignInpage.equalsIgnoreCase(FRSofSignInpage)) {
		   System.out.println("the url is correct");
	   }
	   else {
		   System.out.println("the url is incorrect");
	   }
	   driver.navigate().back();
	   WebElement AllCategories = driver.findElement(By.cssSelector("#gh-cat"));
	   WebDriverWait exwait = new WebDriverWait(driver, Duration.ofSeconds(30));
	   exwait.until(ExpectedConditions.elementToBeClickable(AllCategories)).click();
	   Select All= new Select(AllCategories);
	   All.selectByVisibleText("Books");
	   WebElement Searchfield =driver.findElement(By.xpath("//input[@id='gh-ac']"));
	   Searchfield.click();
	   Searchfield.sendKeys("QA testing books");
	   WebElement ShopbyCategory=driver.findElement(By.xpath("//button[@id='gh-shop-a']"));
	   ShopbyCategory.click();
	   WebElement Motors =driver.findElement(By.xpath("(//h3[@class='gh-sbc-parent']/child::a)[1]"));
	   mouse.moveToElement(Motors).build().perform();
	   mouse.keyDown(Keys.SHIFT).click().build().perform();
	   mouse.keyUp(Keys.SHIFT);
	   Screenshot("\\Screenshots\\Ebay\\");
	   Set<String>SessionIDs =driver.getWindowHandles();
	   Iterator<String> it = SessionIDs.iterator();
	   String window1 =it.next();
	   String window2 =it.next();
	   driver.switchTo().window(window2);
	   WebElement Registry = driver.findElement(By.cssSelector("span[id='gh-ug-flex']>a"));
	   Registry.click();
	  Set<String> SessionID2= driver.getWindowHandles();
	  Iterator<String> it1 =SessionID2.iterator();
	  String parentwindow= it1.next();
	  String childwindow=it1.next();
	  String Childwindow1=it1.next();
	  driver.switchTo().window(Childwindow1);
	  
	   WebElement firstname= driver.findElement(By.xpath("//input[@id='firstname']"));
	   firstname.click();
	   WebElement lastname=driver.findElement(By.cssSelector("input[id='lastname']"));
	   lastname.click();
	   WebElement email = driver.findElement(By.cssSelector("input[id='Email']"));
	   email.click();
	   WebElement password =driver.findElement(By.cssSelector("input[id='password']"));
	   password.click();
	   //Screenshot();
	   // down't allow to click create new account
	   System.out.println(window1);
	   System.out.println(window2);
	   driver.navigate().refresh();
	   driver.close();
	   driver.switchTo().window(window2);
	   driver.close();
	   driver.switchTo().window(window1);
	   driver.close();
	   
	   /* having problem with screenshot method, when ding screenshot befor summery doesn't work. 
	    * check exwait for allcategories. if visible then no click()? or should we write the click on next line. Allcategories.click();
	    * how about set <String> if we make it seperate then windows name will be so many do we make it global so how 
	    * and manually register button doesn't open in window, it oome intab but while testing it opens in new window if it does in work is it bug?
	    */
	   
	   
	  
	  
	}

}
