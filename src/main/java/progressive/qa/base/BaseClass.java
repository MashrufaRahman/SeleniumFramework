package progressive.qa.base;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass {
	 public static void main(String[] args) {

	
	  //System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	  //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromdriver.exe"); 
	 WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.progressive.com/");
	  System.out.println("This is the main method");
	 
	 

	/*
	 WebDriver driver;

	@BeforeTest

	public void practice() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mashr\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void testing() throws InterruptedException {
		driver.get("https://www.progressive.com/");
		Thread.sleep(4000);
	}

	@AfterTest
	public void tearUp() {
		driver.close();
		}
		
*/
	}
	 @Test
	 public static void test() {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.progressive.com/");
		 System.out.println("This is from testNG");
 
	 }
	 @Test
	 public void test1() {
		System.out.println("Test1"); 
	 }
	 @Test
	 public void test2() {
			System.out.println("Test2"); 
		 }
	 @Test
	 public void test3() {
			System.out.println("Test3"); 
		 }
}

	

