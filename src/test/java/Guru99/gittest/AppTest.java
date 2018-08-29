package Guru99.gittest;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * Unit test for simple App.
 */

public class AppTest 
  {
	protected WebDriver driver;
	
	@Test	
	public void guru99tutorials() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Webdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String eTitle="Meet Guru99 - Free Training Tutorials & Video for IT Courses";
        String aTitle="";
        driver.get("http://guru99.com/");
        driver.manage().window().maximize();
        aTitle=driver.getTitle();
        
        if (aTitle.contentEquals(eTitle))
        {
        	System.out.println("Test Passed");
        }
        else {
        		System.out.println("Test Failed");
        	}
	}
  }
	
	
	