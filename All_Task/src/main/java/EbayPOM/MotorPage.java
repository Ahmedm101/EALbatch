package EbayPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MotorPage {
	  WebDriver driver;
      @FindBy(xpath="//a[text()='register']") WebElement Register;  // i have used text path here as it had link text 
      
      public void RegisterClick() {
    	  //z
    	  Register.click();
      }
      public MotorPage(WebDriver driver) {
    	  this.driver= driver;
    	  PageFactory.initElements(driver, this);
      }
}
