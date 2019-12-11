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

public class RadioButtonsAndCheckBoxes {
	 WebDriver driver;
	 String baseUrl;
	 
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "http://letskodeit.teachable.com/pages/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}
		
		
	

	@Test
	public void test() throws InterruptedException {
	 WebElement bmwRadiobtn = driver.findElement(By.id("bmwradio"));
	bmwRadiobtn.click();
	
	Thread.sleep(2500);
	WebElement benzRadiobtn = driver.findElement(By.id("benzradio"));
	benzRadiobtn.click();
	
	Thread.sleep(2500);
	WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
	bmwCheckBox.click();
	
	Thread.sleep(2500);
	WebElement benzCheckbox = driver.findElement(By.id("benzcheck"));
	benzCheckbox.click();
	
	System.out.println("BMW Radio button is selected? " + bmwRadiobtn.isSelected());
	System.out.println("Benz Radio button is selected? " + benzRadiobtn.isSelected());
	System.out.println("BMW Checkbox is selected?" + bmwCheckBox.isSelected());
	System.out.println("Benz Checkbox is selected?" + benzCheckbox.isSelected());
	
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}

	

}
