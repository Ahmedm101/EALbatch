package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Easy_Automation_Lab.All_Task.Java_Script_Utilities;

public class Movies_and_TVpage {
	WebDriver driver;
	@FindBy(css = "#nav-logo-sprites") WebElement AmazonLogo;
	
	public void AmazonLogoclick() {
		Java_Script_Utilities.drawBorder(driver, AmazonLogo);
		AmazonLogo.click();
	}
	public Movies_and_TVpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
