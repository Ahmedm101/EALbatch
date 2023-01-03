package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Easy_Automation_Lab.All_Task.Java_Script_Utilities;

public class Giftpage {

	  WebDriver driver;
	@FindBy(linkText = "Movies & TV") WebElement Movies_and_tv;
	
	public void Movies_and_tv_click() {
		Java_Script_Utilities.drawBorder(driver, Movies_and_tv);
		Movies_and_tv.click();
	}
	public Giftpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
}
