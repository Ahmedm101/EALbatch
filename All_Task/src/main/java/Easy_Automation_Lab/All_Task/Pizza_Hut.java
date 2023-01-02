package Easy_Automation_Lab.All_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Pizza_Hut extends Utilities {

	public static void main(String[] args) throws InterruptedException {
		Ibrowser("chrome", "https://www.pizzahut.com");
		Screenshot();
	    WebElement Menu=	driver.findElement(By.cssSelector("span[class='MuiButton-label']"));
	    Menu.click();
	    Screenshot();
	/*    WebElement TripleTreatBox=  driver.findElement(By.cssSelector("img[class='jss90 false']"));
	    TripleTreatBox.click();
	    Thread.sleep(3000);
	/*    Java_Script_Utilities.jsClick(driver, Menu);
	    Menu.click();
	    WebElement cross= driver.findElement(By.cssSelector("mask[id='close-icon-b-6']~g>path"));
	    cross.click();
	    Menu.click(); */
	   WebElement pizza=   driver.findElement(By.xpath("(//ul[@id='menu-list-grow']/descendant::a/div)[1]"));
	   pizza.click();
	   Thread.sleep(2000);
	   Screenshot();
	  WebElement Peparonni=  driver.findElement(By.xpath("(//a[@class='btn btn-primary btnModal'])[1]"));
	  Peparonni.click();  
	  Thread.sleep(2000);
	  Screenshot();
	  driver.navigate().back();
	  Thread.sleep(2000);
	  WebElement Backyard =  driver.findElement(By.xpath("(//a[@class='btn btn-primary btnModal'])[8]"));
	  Java_Script_Utilities.scrollIntoView(driver, Backyard);
	  Screenshot();
	  Thread.sleep(2000);
	  Backyard.click();
	  Thread.sleep(2000);
	  Screenshot();
	  driver.navigate().back();
	  driver.navigate().back();
	  Screenshot();
	  WebElement TripleTreatBox=  driver.findElement(By.cssSelector("img[class='jss90 false']"));
	    TripleTreatBox.click();
	    Screenshot();
	  WebElement delivery=  driver.findElement(By.xpath("(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-justify-content-xs-center'])[3]"));
	  delivery.click();
	  Screenshot();
	  WebElement address=  driver.findElement(By.cssSelector("input[id='w2-address']"));
	  address.click();
	  address.sendKeys("7519 longbow ln");
	  WebElement city= driver.findElement(By.cssSelector("input[id='w2-city']"));
	  city.click();
	  city.sendKeys("Arlington");
	
	 // city.clear(); clear keno hochena?
	 WebElement State =  driver.findElement(By.xpath("//input[@id='w2-state']"));
	 State.click();
	 State.sendKeys("TX");
	  
	  WebElement zipcode=  driver.findElement(By.xpath("//input[@id='w2-zip']"));
	  zipcode.click();
	  zipcode.sendKeys("76002");
	  Screenshot();
	  WebElement Search= driver.findElement(By.xpath("(//span[@class='MuiButton-label'])[3]"));
	  Search.click();
	  Screenshot();
	 WebElement Continue =  driver.findElement(By.xpath("//span[@class='jss263']"));
	 Continue.click();
	 Thread.sleep(2000);
	 Screenshot();
	 WebElement Alert = driver.findElement(By.cssSelector("#modal-button-OK"));
	 Alert.click();
	 Screenshot();
	 Java_Script_Utilities.scrollPageDown(driver);
	 Screenshot();
	 driver.close();
	 
	  

	}
  // if i don't give thread then SS Doesn't come right as its too quick
	//line 14-line20 why not happening ?
}
