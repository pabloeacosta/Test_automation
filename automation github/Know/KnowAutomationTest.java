package knowautomation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KnowAutomation {

    private static WebDriver driver = null;
            
    public static void main(String[] args) throws InterruptedException{
        String Datos [][] = new String[6][3];
        
        Datos[0][0]="pablo";
        Datos[0][1]="joan@com";
        Datos[0][2]="123456";
        
        Datos[1][0]="marta";
        Datos[1][1]="martita@hotmail";
        Datos[1][2]="   ";
        
        Datos[2][0]="   ";
        Datos[2][1]="   ";
        Datos[2][2]="ptolomeo";
        
        Datos[3][0]="agustin";
        Datos[3][1]="   ";
        Datos[3][2]="lucario";
        
        Datos[4][0]="   ";
        Datos[4][1]="boquitaelmasgrande@gmail.hotmail.com";
        Datos[4][2]="Estoesunaprueba";
        
        Datos[5][0]="  ";
        Datos[5][1]=" no@hotmail.com";
        Datos[5][2]="Funciona??";
        
        System.setProperty("webdriver.chrome.driver"
                , "chromedriver.exe");
        driver = new ChromeDriver();
        
         driver.get("http://54.39.99.59/");
    driver.manage().window().setSize(new Dimension(1477, 753));
     String resultado;
  for (int i = 0; i < 6; i++) {
    
    driver.findElement(By.name("full name")).click();
    driver.findElement(By.name("full name")).sendKeys(Datos [i][0]);
    driver.findElement(By.name("email")).sendKeys(Datos [i][1]);
    driver.findElement(By.name("password")).sendKeys(Datos [i][2]);
    driver.findElement(By.id("form-submit")).click();
    
    Thread.sleep(3000);
    
    /* Si bien esta pagina una "plantilla", tiene muchos errores graves. 
    * Podes ingresar cualquier dato que lo va a tomar,
    * solo tiene que en cuenta los caracteres despues del @,
    * la botonera funciona, pero no redirecciona a las paginas que deberia.
    *Revisar testeo manual
    */
        
        
    
}

    }}