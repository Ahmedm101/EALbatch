package EbayPOM;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Easy_Automation_Lab.All_Task.Java_Script_Utilities;
import Easy_Automation_Lab.All_Task.Utilities;



public class EbayHomepage { // we cannot call method from src test class
	WebDriver driver;
	Actions mouse;
	
	
	@FindBy(xpath="(//div[@class='gh-menu']/child::a)[1]") WebElement MyEbay;
	@FindBy(xpath="//a[text()=' Summary']") WebElement Summary;
	@FindBy(xpath ="//div[@id='gh-cat-box']/child::select") WebElement AllCategories;
	@FindBy(xpath="//input[@id='gh-ac']") WebElement SearchField;
	@FindBy(xpath="//button[@id='gh-shop-a']") WebElement ShopbyCategory;
	@FindBy(xpath ="(//h3[@class='gh-sbc-parent']/child::a)[1]") WebElement Motor;
	
	
	
	
	public void MyEbayclick() throws InterruptedException {  //when we use the flashing when there is a bug and did you meant to flash white color too?
	//g	
		Java_Script_Utilities.flash_blue(MyEbay,driver);
		Java_Script_Utilities.flash_red(MyEbay, driver);
		Java_Script_Utilities.flash_white(MyEbay, driver);
	//h	
		Java_Script_Utilities.drawBorder(driver, MyEbay);
	   // Utilities.Screenshots("Ebay");
	//i	
		mouse = new Actions(driver); ;
	    mouse.moveToElement(MyEbay).build().perform();
		
		
		}
	public void SummaryClick() {
		//j
		Java_Script_Utilities.drawBorder(driver, Summary);
		//Utilities.Screenshots();
		//k
		mouse.moveToElement(Summary).click().build().perform();
		
	}
	public void AllCategoriesClick() {
		//o
		WebDriverWait exwait = new WebDriverWait(driver,Duration.ofSeconds(30));
		exwait.until(ExpectedConditions.elementToBeClickable(AllCategories));
		Java_Script_Utilities.drawBorder(driver, AllCategories);
		//q
		AllCategories.click();
		Select All = new Select(AllCategories);
		All.selectByIndex(4);
		Java_Script_Utilities.drawBorder(driver, AllCategories);

	}
	public void SearchFieldClick() {
		//s
		Java_Script_Utilities.scrollIntoView(driver, SearchField);
		SearchField.click();
		SearchField.clear();
		//t
		SearchField.sendKeys("QA testing books"); // should i make a seperate Searchfield method for QA testing books so the SCROLL doesn't repeat ?
	}
	public void ShopbyCategoryClick() {
		//w
		ShopbyCategory.click();
		
	}
	public void MotorClick() {
		//x
		Actions act = new Actions( driver);
		act.moveToElement(Motor).keyDown(Keys.SHIFT).click().build().perform(); // how come i had to make new Action class here but why not for Summary
		act.keyUp(Keys.SHIFT).build().perform();
	}
	public EbayHomepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	
	
	
	
	

}
