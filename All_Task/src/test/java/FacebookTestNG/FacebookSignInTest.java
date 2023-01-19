package FacebookTestNG;

import org.testng.annotations.Test;

import FacebookPOM.FacebookHomepage;
import UtilitiesPack.UtilitiesTestNG;

import org.testng.annotations.DataProvider;

public class FacebookSignInTest extends UtilitiesTestNG{
  @Test(dataProvider = "FacebookData")                             // same like groups, priority we can use with comma
  public void f(String email , String password,String search) throws InterruptedException {
	  
	  FacebookHomepage ob=new FacebookHomepage(driver);
	  ob.email(email);
	  ob.pass(password);
	  ob.loginbtnclick();
	  Thread.sleep(2000);
	  driver.navigate().back();
	  Thread.sleep(4000);
	 
  }

  @DataProvider
  public Object[][] FacebookData() {     //object is the return type, dp is the method name 
    return new Object[][] {
      new Object[] { "computer" },
      new Object[] { "bcd@gmail.com", "bfg576!" },
      new Object[] { "hinki@gmail.com", "reh678!"},
    };
  }
}
