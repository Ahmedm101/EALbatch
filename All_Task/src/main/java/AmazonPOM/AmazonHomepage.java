package AmazonPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Easy_Automation_Lab.All_Task.Java_Script_Utilities;

public class AmazonHomepage {
       WebDriver driver;
	@FindBy(id = "twotabsearchtextbox") WebElement Searchbar;
	@FindBy(xpath="//div[@id='nav-xshop']/child::a[7]") WebElement Realese;
	@FindBy(css="#nav-search-submit-button") WebElement SearchIcon;
	public void sendkeysonSearchbar(String item) {
		Java_Script_Utilities.drawBorder(driver, Searchbar);
		Searchbar.click();
		Searchbar.clear();
		Searchbar.sendKeys(item);
	}
	public void Realeaseclick() {
		Java_Script_Utilities.jsClick(driver, Realese);
		Java_Script_Utilities.drawBorder(driver, Realese);
		Realese.click();
	}
	public void Searchiconclick() {
		Java_Script_Utilities.jsClick(driver, SearchIcon);
		SearchIcon.click();
	}
	public AmazonHomepage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
}
