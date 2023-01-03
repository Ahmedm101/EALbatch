package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Easy_Automation_Lab.All_Task.Java_Script_Utilities;

public class NewRealesespage {
      WebDriver driver;
	@FindBy(xpath="(//div[@class='_p13n-zg-nav-tab-all_style_zg-tabs-li-div__1YdPR']/child::a)[4]") WebElement Gift;
	
	public void GiftClick() {
		Java_Script_Utilities.drawBorder(driver, Gift);
		Gift.click();
		
	}
	public NewRealesespage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
