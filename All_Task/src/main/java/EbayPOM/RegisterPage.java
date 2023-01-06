package EbayPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Easy_Automation_Lab.All_Task.Java_Script_Utilities;
import Easy_Automation_Lab.All_Task.Utilities;

public class RegisterPage {
     WebDriver driver;
	
	@FindBy(css= "input[id='firstname']") WebElement Firstname;
	@FindBy(css="input[id='lastname']") WebElement Lastname;
	@FindBy(css="input[id='Email']") WebElement Email;
	@FindBy(css="input[id='password']") WebElement Password;
	@FindBy(css="button[id='EMAIL_REG_FORM_SUBMIT']") WebElement CreateAccount;
	
	public void FirstnameSendkeys() {
		Firstname.click();
		Firstname.sendKeys("Maliha");
	}
	public void LastnameSendkeys() {
		Lastname.click();
		Lastname.sendKeys("Ahm");
	}
	public void EmailSendkeys() {
		Email.click();
		Email.sendKeys("abc@gmail.com");
	}
	public void PasswordSendkeys() {
		Password.click();
		Password.sendKeys("123Milohello");
	}
	public void CreateAccount() {
		//cc
		Java_Script_Utilities.flash_blue(CreateAccount, driver);
		Java_Script_Utilities.drawBorder(driver, CreateAccount);
	//	Utilities.Screenshots();
		//dd
		CreateAccount.click();
	}
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
