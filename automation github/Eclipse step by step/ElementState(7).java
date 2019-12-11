package BasicWeb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementState {
	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseUrl = "https://www.google.com";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		
	}
	@Test
	public void test() {
	WebElement e1 = driver.findElement(By.name("q"));
	e1.sendKeys("lets kode it") ;
	System.out.println("E1 is Enabled? " + e1.isEnabled());
	}
	
	@After
	public void tearDown() throws Exception {
	}

	

}
