package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	public static WebDriver driver;

  @Test
  public void f() {
	  	driver.manage().window().maximize();
		 driver.findElement(By.id("username")).sendKeys("nagendra123");
		 driver.findElement(By.id("password")).sendKeys("25121999");
		 driver.findElement(By.id("login")).click();
		 String a = driver.getTitle();
		 Assert.assertEquals(a,"Adactin.com - Search Hotel");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Nagendra\\Downloads\\chromedriver.exe");
			  driver = new ChromeDriver();
			 driver.navigate().to("https://adactinhotelapp.com");
  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
