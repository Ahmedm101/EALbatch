package AmazonTestNG1;

import org.testng.annotations.Test;


import UtilitiesPack.UtilitiesTestNG;

import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Amazon1 extends UtilitiesTestNG {
	 
  @Test
  public void f() {
	  WebElement Searchbox = driver.findElement(By.id("twotabsearchtextbox"));
	  Searchbox.click();
	  
  }
  
 
}
