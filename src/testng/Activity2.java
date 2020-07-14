package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;

public class Activity2 {
	
	WebDriver driver;
  @Test
  public void testCase1() {
	 
	  //
	  String title=driver.getTitle();
	  System.out.println(" Page Title: "+title);
	  Assert.assertEquals("Target Practice", title);
	  
  }
  
  @Test
  public void testCase2() {
	 
	 WebElement blackButton = driver.findElement(By.xpath("//button[@class='ui black button']"));
	 Assert.assertTrue(blackButton.isDisplayed());
	  
	  
  }
  @Test(enabled=false)
  public void testCase3() {
	 
	System.out.println("Skipping testcase3");
  }
  
  @Test
  public void testCase4() throws SkipException {
	 
	System.out.println("Skipping testcase3");
	throw new SkipException("throwinf skipp exception and will display in report also");
  }
 
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.setProperty("webdriver.gecko.driver","C:\\eclipse_SeleniumWorkspace_SDETTrainning\\SDET_TestNG_Project\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/target-practice");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
