package TestingENV;

import org.testng.annotations.Test;

public class Test4 {
  @Test(groups={"smoke"})
  public void testcase1() {
	  System.out.println("this is TC1 logic");
	  //sign in page link verification---basmoke test
  }
  @Test(groups= {"smoke","sanity"})
  public void testcase2() {
	  System.out.println("this is TC2 logic");
	  //click on sign in mandatory fields --- sanity + smoke
  }
  @Test(groups= {"smoke","sanity","regression"})
  public void testcase3() {
	  System.out.println("this is TC3 logic");
  }
  @Test(groups= {"sanity"})
  public void testcase4() {
	  System.out.println("this is TC4 logic");
  }
  @Test(groups= {"regression"})
  public void testcase5() {
	  System.out.println("this is TC5 logic");
  }
  @Test(groups= {"smoke","regression"})
  public void testcase6() {
	  System.out.println("this is TC6 logic");
  }
}
