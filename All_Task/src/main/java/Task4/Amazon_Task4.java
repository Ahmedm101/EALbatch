package Task4;

import java.io.IOException;
import java.io.Serial;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Easy_Automation_Lab.All_Task.Java_Script_Utilities;
import Easy_Automation_Lab.All_Task.Utilities;

public class Amazon_Task4 extends Utilities {
          static WebElement Searchfield;
          static  Set<String> SessionID;
          static Iterator<String> it;
          static String window1 ;
         static  String window2 ;
          
	public static void main(String[] args) throws IOException, InterruptedException {
		Ibrowser("chrome", "https://www.amazon.com");
	   String Titleofhomepage= driver.getTitle();
	   String FRStitleofHomepage="Amazon.com. Spend less. Smile more.";
	   if(Titleofhomepage.equalsIgnoreCase(FRStitleofHomepage)) {
		   System.out.println("the title is correct");
	   }
	   else {
		   System.out.println("the title is incorrect");
	   }
	   WebElement AccountandLists =driver.findElement(By.cssSelector("div[class='nav-line-1-container']+span"));
	   WebDriverWait exwait = new WebDriverWait(driver,Duration.ofSeconds(30));
	   exwait.until(ExpectedConditions.elementToBeClickable(AccountandLists));
	   Java_Script_Utilities.drawBorder(driver, AccountandLists);
	   Screenshot("\\Screenshots\\Amazon\\");
	   Actions mouse= new Actions(driver);
	   mouse.moveToElement(AccountandLists).build().perform();
	   WebElement Selling =driver.findElement(By.xpath("(//a[@class='nav-link nav-item']/child::span)[17]"));
	   exwait.until(ExpectedConditions.elementToBeClickable(Selling));
	   Java_Script_Utilities.flash(Selling, driver);
	   Thread.sleep(3000);
	   Java_Script_Utilities.drawBorder(driver, Selling);
	   Screenshot("\\Screenshots\\Amazon\\");
	   mouse.moveToElement(Selling).keyDown(Keys.SHIFT).click().build().perform();
	   mouse.keyUp(Keys.SHIFT).build().perform();
	    SessionID =driver.getWindowHandles();
	    it= SessionID.iterator();
	    window1  = it.next();
	    window2 =it.next();
	   driver.switchTo().window(window2);
	   String TitleOfSellingPage = driver.getTitle();
	   String FrsTitleofSellingPage ="Amazon.com: Sell Products Online with Selling on Amazon.";
	   if(TitleOfSellingPage.equalsIgnoreCase(FrsTitleofSellingPage)) {
		   System.out.println("the title is correct");
	   }
	   else {
		   System.out.println("the title is incorrect");
	   }
	  List<WebElement> button= driver.findElements(By.tagName("button"));
	  int buttontag= button.size();
	  System.out.println(buttontag);
	  Searchfield= driver.findElement(By.xpath("//div[@class='nav-search-field ']/child::input[@id='twotabsearchtextbox']"));
	  Java_Script_Utilities.drawBorder(driver, Searchfield);
	  Searchfield.click();
	  Searchfield.sendKeys("phone");
	  Screenshot("\\Screenshots\\Amazon\\");
	  mouse.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
	  mouse.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
	  mouse.keyUp(Keys.CONTROL).build().perform();
	  WebElement icon=  driver.findElement(By.cssSelector("input[id='nav-search-submit-button']"));
	  icon.click();
	  WebElement Text=  driver.findElement(By.cssSelector("div[class='a-section a-spacing-small a-spacing-top-small']>span:first-of-type"));
	  Java_Script_Utilities.drawBorder(driver, Text);
	  String textforphone= Text.getText();
	  String FRStextforphone="1-16 of over 10,000 results for";
	  if(textforphone.equalsIgnoreCase(FRStextforphone)) {
		  System.out.println("the text is correct");
	  }
	  else {
		  System.out.println("the text is incorrect");
	  }
	  List<WebElement> links=  driver.findElements(By.tagName("a"));
	  int alllink= links.size();
	  for(int i =0;i<alllink;i++) {
		  System.out.println("text of the link is"+links.get(i).getText());
		  System.out.println("the link is "+links.get(i).getAttribute("href"));
		   }
	  WebElement MotoG= driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small'])[16]"));
	  Java_Script_Utilities.scrollIntoView(driver, MotoG);
	  Java_Script_Utilities.drawBorder(driver, MotoG);
	  Screenshot("\\Screenshots\\Amazon\\");
	  Java_Script_Utilities.scrollPageDown(driver);
	  Screenshot("\\Screenshots\\Amazon\\");
	  String UrlofPhonepage =driver.getCurrentUrl();
	  String FRSforUrlofPhonepage="https://www.amazon.com/s?k=phone&crid=39BQBBL0DFIV9&sprefix=phone%2Caps%2C160&ref=nb_sb_noss_1";
	  if(UrlofPhonepage.equalsIgnoreCase(FRSforUrlofPhonepage)) {
		  System.out.println("the url is correct");
	  }
	  else {
		  System.out.println("the url is incorrect");
	  }
	  Thread.sleep(3000);
	/*  Java_Script_Utilities.generateAlert(driver,"You're on Amazon");
	  Screenshot("\\Screenshots\\Amazon\\");
	  Thread.sleep(2000);
	 driver.switchTo().alert().accept(); */
	  driver.navigate().back();
	  driver.switchTo().window(window1);
	  driver.navigate().refresh();
   	  WebElement All= driver.findElement(By.cssSelector("select[id='searchDropdownBox']"));
	/*  WebDriverWait exwait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
	  exwait1.until(ExpectedConditions.elementToBeClickable(All)).click();*/
	  All.click();
	  Select all = new Select(All);
	  all.selectByIndex(5);
	   Searchfield= driver.findElement(By.xpath("//div[@class='nav-search-field ']/child::input[@id='twotabsearchtextbox']"));
	   Searchfield.click();
	   mouse.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
	   mouse.keyUp(Keys.CONTROL).build().perform();
	   WebElement Allsidebar = driver.findElement(By.cssSelector("a[id='nav-hamburger-menu']>span"));
	   exwait.until(ExpectedConditions.elementToBeClickable(Allsidebar)).click();
	   WebElement Allrealeases = driver.findElement(By.xpath("(//div[@id='hmenu-content']/descendant::a)[2]"));
	   mouse.moveToElement(Allrealeases).keyDown(Keys.SHIFT).click().build().perform();
	   mouse.keyUp(Keys.SHIFT).build().perform();
	   SessionID= driver.getWindowHandles();
	    it =SessionID.iterator();
	    window1=it.next();
	    window2=it.next();
	    String window3=it.next();
	    driver.switchTo().window(window3);
	   WebElement Firespray =  driver.findElement(By.xpath("//div[@id='B0BCHJ8JL3']"));
	   Java_Script_Utilities.scrollIntoView(driver, Firespray);
	   Java_Script_Utilities.drawBorder(driver, Firespray);
	   Screenshot("\\Screenshots\\Amazon\\");
	   driver.quit();
	   
	   
	  
	  
	  
	   
	   
	   

	}
	//line 42. should i move to element build perform then do line 43? or can we do do direct move to element and shift.
    //line 37 css selector didn't work cani show demo and see if i am wrong here ?
	//line 41 shoudl we print the colors from java script method for bg color
	//line 61-63 only how many buttons no need to print any text,id or whatsoever
	//in general for css or xpath can we do only input[id] or we will have to do input[id][name] to make it unique?
	//line 86 why not alllink it shows error. why we will have to do links,can you please explain this 84-88
	//line 104, how about if we have to generate both ok and cancel for alert also with messages ?
	//line 116 does exwait works for select tag ?
	//line 134 if the 2nd window was closed so it would have been window1 and window 2 right ?
}

