
package IFTS20;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class IFTS20 {

    private static WebDriver driver = null;
  
    public static void main(String[] args) throws InterruptedException {
        String Datos[][] = new String[5][2];
        Datos[0][0]="Admin";
        Datos[0][1]="4321";
        
        Datos[1][0]="Pepe";
        Datos[1][1]="555";
        
        Datos[2][0]="lucía";
        Datos[2][1]="9876";
        
        Datos[3][0]="María de los Angeles";
        Datos[3][1]="7894";
        
        Datos[4][0]="Admin";
        Datos[4][1]="1234";
        
        System.setProperty("webdriver.chrome.driver"
                , "chromedriver.exe");
        driver = new ChromeDriver();
   driver.get("http://ifts20.com.ar/testing/");
   driver.manage().window().maximize();
   String resultado;
  for (int i = 0; i < 5; i++) {
    driver.findElement(By.id("usuario")).sendKeys(Datos[i][0]);
    driver.findElement(By.id("clave")).sendKeys(  Datos[i][1]);
    Thread.sleep(3000);
    driver.findElement(By.id("Ingresar")).click();
   
    resultado = driver.getPageSource();
    resultado.indexOf("Ingreso INCorrecto. -");
    
    driver.findElement(By.id("Volver")).click();
        }
 
    driver.close();
    }
    
}
