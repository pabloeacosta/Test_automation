package BasicWeb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Linktest {

	public static void main(String[] args) {
		// http://chromedriver.storage.googleapis.com/index.html
				
				WebDriver driver;
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\usuario\\eclipse-workspace\\SeleniumTutorial\\libs\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				
				String baseURL = "http://www.google.com";
				driver.manage().window().maximize();
				driver.get(baseURL);
				
				driver.findElement(By.name("q")).sendKeys("letskodeit");		
				driver.findElement(By.name("btnK")).click();
			}
		
				

			}

		


