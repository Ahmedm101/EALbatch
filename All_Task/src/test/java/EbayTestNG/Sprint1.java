package EbayTestNG;

import org.testng.annotations.Test;

import Easy_Automation_Lab.All_Task.Java_Script_Utilities;
import EbayPOM.EbayHomepage;
import EbayPOM.MotorPage;
import EbayPOM.RegisterPage;
import UtilitiesPack.UtilitiesTestNG;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Sprint1 extends UtilitiesTestNG {   // so we dont have to make object in order to call method from other class also from different package
  @Test (priority=1)                                         // but we are making object of POM class because of the constructor ?
  public void Test1() throws IOException, InterruptedException {
	  //d
	  driver.navigate().back();
	  //e
	  driver.navigate().forward();
	  //f
	  String UrlofHomepage= driver.getCurrentUrl();
	  String FrsUrlofHomepage ="https://www.ebay.com/";
	  if(UrlofHomepage.equalsIgnoreCase(FrsUrlofHomepage)) {
		  System.out.println("the url is correct");
	  }
	  else {
		  System.out.println("the url is incorrect");
	  }
	  EbayHomepage hp = new EbayHomepage(driver);
	  hp.MyEbayclick();
	  Screenshot();// we can call non static method here and screenshot is taking here
	  hp.SummaryClick();
	  Thread.sleep(2000);
	  Screenshot(); // screenshot is taking here of the summary page ? how we will take the border screenshot 
	  //l
	  String UrlofSummarypage = driver.getCurrentUrl();
	  String FrsUrlofSummarypage ="https://signin.ebay.com/ws/eBayISAPI.dll?SignIn&ru=https%3A%2F%2Fwww.ebay.com%2Fmye%2Fmyebay%2Fsummary";
	  if(UrlofSummarypage.equalsIgnoreCase(FrsUrlofSummarypage)) {
		  System.out.println("the url is correct");
	  }
	  else {
		 Screenshot();  // i put a ss here is it ok 
	  }
	  //m
	  driver.navigate().back();
	  }
      
     @Test(priority =2, dependsOnMethods="Test1")
     public void Test2() throws IOException, InterruptedException {
    	 EbayHomepage hp = new EbayHomepage(driver);
    	 hp.AllCategoriesClick();
    	 //p
    	 List<WebElement> alllinks= driver.findElements(By.tagName("a"));
    	 for(int i =0;i<alllinks.size();i++) {
    		 System.out.println("the link text of the elements = "+alllinks.get(i).getText() );
    		 System.out.println("the link of the elements = "+alllinks.get(i).getAttribute("href"));
    	 }
    	 hp.AllCategoriesClick();
    	 Thread.sleep(2000);
    	 Screenshot();  //ss keno nichena at the folder
    	 //s
    	 Java_Script_Utilities.scrollPageDown(driver);
    	 Screenshot();
    	 hp.SearchFieldClick();
    	 Thread.sleep(3000);
    	 Screenshot();
    	 hp.SearchFieldClick();
    	 //u
    	 String UrlofHomepage=driver.getCurrentUrl();
    	 String FrsUrlofHomepage ="https://www.ebay.com/";
    	 if(UrlofHomepage.equalsIgnoreCase(FrsUrlofHomepage)) {
    		 System.out.println("the url is correct");
    	 }
    	 else {
    		 Screenshot();
    		  }	 
     }
     @Test( priority =3, dependsOnMethods= "Test2")
     public void Test3( ) throws IOException {
    	 EbayHomepage hp = new EbayHomepage(driver);
    	 hp.ShopbyCategoryClick();
    	 hp.MotorClick();
    	 //y
    	 Screenshot();
    	 Set<String> SessionIDs = driver.getWindowHandles();
    	 Iterator<String> it =SessionIDs.iterator();
    	 String ParentWindow = it.next();
    	 String ChildWindow = it.next();
    	 driver.switchTo().window(ChildWindow);
    	 Screenshot();
    	 MotorPage mp = new MotorPage(driver);
    	 mp.RegisterClick();
    	 //aa
    	 RegisterPage rp = new RegisterPage(driver);
    	 rp.FirstnameSendkeys();
    	 rp.LastnameSendkeys();
    	 rp.EmailSendkeys();
    	 rp.PasswordSendkeys();
    	 //bb
    	 Screenshot();
    	 rp.CreateAccount();
    	 //ee
    	 System.out.println(ParentWindow);
    	 System.out.println(ChildWindow);
    	 //ff
    	 driver.navigate().refresh();
    	 //gg
    	 String TitleofSignUpPage =driver.getTitle();
    	 String FrsTitleofSignUpPage="";
    	 System.out.println(TitleofSignUpPage);
    	 
    	 //so here we did afterclass for the quit. how about when we want to close the windows individually ??
    	 //what happends when we need to do the click again but without flashing or anything so i make the method 2() at POM??
    	 // please check all the SS in ebay folder 
    	 // there shpuld be 11 SS including the after method which is the ss of all the test why there is only 9 in the folder??
     }

}
