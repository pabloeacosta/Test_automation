package BasicWeb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicActionsJUnit {
	WebDriver driver;
	String baseUrl = "https://letskodeit.teachable.com";
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://letskodeit.teachable.com";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@Test
	public void test() throws Exception {
		driver.get(baseUrl);
		driver.findElement(By.xpath(".//div[@id='navbar']//a[@href ='/sign_in']")).click();
		System.out.println("Clicked on login");
		
		driver.findElement(By.id("user_email")).sendKeys("email@gmail.com");
		System.out.println("Sending keys to user name field"); 
		driver.findElement(By.id("user_password")).sendKeys("Testing");
		System.out.println("Sending keys to user name password");
		Thread.sleep(1500);
		driver.findElement(By.id("user_email")).clear();
		System.out.println("Clearing username field");
	
	}

	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}


}
