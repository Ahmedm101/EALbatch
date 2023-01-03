package AmazonTestNG1;

import org.testng.annotations.Test;

import AmazonPOM.AmazonHomepage;
import AmazonPOM.Giftpage;
import AmazonPOM.Movies_and_TVpage;
import AmazonPOM.NewRealesespage;
import UtilitiesPack.UtilitiesTestNG;

public class Amazon2 extends UtilitiesTestNG {
  @Test(priority=1)
  public void f() {
	  AmazonHomepage ob = new AmazonHomepage(driver);
	  ob.sendkeysonSearchbar("computer");
	  ob.Realeaseclick(); 
	  
	  NewRealesespage rp = new NewRealesespage(driver);
	  rp.GiftClick();
	  
	  Giftpage gp = new Giftpage(driver);
	  gp.Movies_and_tv_click();
  }
  @Test(priority=2, dependsOnMethods="f")
  public void Test2() throws InterruptedException {
	  Movies_and_TVpage ob = new Movies_and_TVpage(driver);
	  ob.AmazonLogoclick();
	 
	  AmazonHomepage hp = new AmazonHomepage(driver);
	  hp.sendkeysonSearchbar("phone");
	  Thread.sleep(4000);
	  hp.Searchiconclick();  //why is clicking phone twice 
	  
	  
	 // how come before class is working here but after class is not 
	  
  }
}
