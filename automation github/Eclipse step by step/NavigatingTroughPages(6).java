package BasicWeb;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatingTroughPages {
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
		public void test() throws InterruptedException {
			
			driver.get(baseUrl);
			String title = driver.getTitle();
			System.out.println("Title of the page is:" + title);
			
			String currentUrl =  driver.getCurrentUrl();
			System.out.println("Current Url is:" + currentUrl);
			
			String UrlLogin = "https://sso.teachable.com/secure/42299/users/sign_in?clean_login=true&reset_purchase_session=1";
			driver.navigate().to(UrlLogin);
			System.out.println("Navigate to Login");
			
			currentUrl =  driver.getCurrentUrl();
			System.out.println("Current Url is:" + currentUrl);
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			System.out.println("Navigate back");
			currentUrl =  driver.getCurrentUrl();
			System.out.println("Current Url is:" + currentUrl);
			
			Thread.sleep(2000);
			
			driver.navigate().forward();
			System.out.println("Navigate foward");
			currentUrl =  driver.getCurrentUrl();
			System.out.println("Current Url is:" + currentUrl);
			
			Thread.sleep(2000);
			
			driver.navigate().back();
			System.out.println("Navigate back");
			currentUrl =  driver.getCurrentUrl();
			System.out.println("Current Url is:" + currentUrl);	
			
			driver.navigate().refresh();
			System.out.println("Navigate refresh");
			driver.get(currentUrl);
			System.out.println("Navigate refresh");
			
			
			String PageSource = driver.getPageSource();
			System.out.println(PageSource);
		}
 
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
