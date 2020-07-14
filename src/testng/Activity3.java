package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class Activity3 {
	
	WebDriver driver;
	
  @Test
  public void act3() {
	  
	  driver.findElement(By.id("username")).sendKeys("admin");
	  driver.findElement(By.id("password")).sendKeys("password");
	  
	  driver.findElement(By.xpath("//button[text()='Log in']")).submit();
	  
	 //String expectedmsg = driver.findElement(By.id("action-confirmation")).getText();
	  //System.out.println("expected msg: "+expectedmsg);
	  //String actualMsg = "Welcome Back, admin";
	  
	  //Assert.assertEquals(expectedmsg, actualMsg);
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver","C:\\eclipse_SeleniumWorkspace_SDETTrainning\\SDET_TestNG_Project\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.training-support.net/selenium/login-form");
  }

  @AfterClass
  public void afterClasS() {
	  driver.close();
  }

}
