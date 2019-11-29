package fmedtest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class FmedTest {

   private static WebDriver driver = null;
   
   
    public static void main(String[] args) throws InterruptedException {
        
         String Datos[][] = new String[8][2];
        Datos[0][0]="39958793";
        Datos[0][1]="Pablo";
        
        Datos[1][0]="Noname";
        Datos[1][1]="123456";
        
        Datos[2][0]="none";
        Datos[2][1]="capricornio";
        
        Datos[3][0]="config";
        Datos[3][1]="   ";
        
        Datos[4][0]="13058439";
        Datos[4][1]="13058439";
        
        Datos[5][0]="lopedevega";
        Datos[5][1]="capricornio";
        
        Datos[6][0]="  ";
        Datos[6][1]="capricornio";
        
        Datos[7][0]="MuchosCAra";
        Datos[7][1]="Aries";
        
        System.setProperty("webdriver.chrome.driver"
                , "chromedriver.exe");
        driver = new ChromeDriver();
        
         driver.get("https://inscripcion.fmed.uba.ar/");
    driver.manage().window().setSize(new Dimension(1936, 1056));
      String resultado;
  for (int i = 0; i < 8; i++) {
    driver.findElement(By.name("usuario")).click();
    driver.findElement(By.cssSelector("td:nth-child(1) > table > tbody > tr:nth-child(4)")).click();
    driver.findElement(By.name("usuario")).sendKeys(Datos [i][0]);
    driver.findElement(By.name("contrasegna")).sendKeys(Datos [i][1]);
    driver.findElement(By.name("submit")).click();
    Thread.sleep(3000);
    
     driver.get("https://inscripcion.fmed.uba.ar/");
        
        
    }
    driver.close();
    }}


/* Luego de automatizar la pagina, revise que cumple con su funcion,
* notando que diseñaron la pagina para que aparezca (*)
* en caso de no completar usuario o contraseña.
*/