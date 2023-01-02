package Easy_Automation_Lab.All_Task;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
        
public class Java_Script_Utilities {
         static WebDriver driver;
  
    public static void jsClick(WebDriver driver, WebElement element) {
	JavascriptExecutor jsexecutor = (JavascriptExecutor)driver;
	jsexecutor.executeScript("arguments[0].click()",element);
		
    }
    
    public static void scrollIntoView(WebDriver driver, WebElement element) {
    	JavascriptExecutor jsexecutor= (JavascriptExecutor)driver;
    	jsexecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }
	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor jsexecutor = (JavascriptExecutor)driver;
		jsexecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor jsexecutor = (JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	//BLUE
	public static void flash(WebElement element,WebDriver driver) {
		String bgcolor=element.getCssValue("backgroundColor");
		System.out.println(bgcolor);
		for(int i=0;i<10;i++) {
			changeColor("#0000FF", element, driver);
			changeColor(bgcolor, element, driver);
		}
		
	}
	public static void drawBorder(WebDriver driver, WebElement element) {
		JavascriptExecutor jsexecutor =(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].style.border='3px solid red'", element);
	}
	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor jsexecutor = (JavascriptExecutor)driver;
		jsexecutor.executeScript("alert('"+message+"')");
		
	} 
}