package testng;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity1 {
	 WebDriver driver;
  @Test
  public void act1() {
	  
	  String title = driver.getTitle();
	  
	  System.out.println("title of the current page: "+title);
	  Assert.assertEquals("trainning Support", title);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver","C:\\eclipse_SeleniumWorkspace_SDETTrainning\\SDET_TestNG_Project\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.training-support.net");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
