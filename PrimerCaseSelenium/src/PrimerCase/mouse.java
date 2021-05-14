package PrimerCase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class mouse {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);

       String link="http://localhost:9080";
       driver.get(link);
       driver.manage().window().maximize();

        WebElement imagen = driver.findElement(By.id("vitamin_a"));
        Actions accion = new Actions(driver);
        accion.moveToElement(imagen).build().perform();
        Alert alerta = driver.switchTo().alert();
        System.out.println(alerta.getText());



    }
}
