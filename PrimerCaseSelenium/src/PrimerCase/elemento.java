package PrimerCase;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class elemento  {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://localhost:9080");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("people")).click();
        driver.findElement(By.partialLinkText("contact")).click();
        driver.findElement(By.name("name")).sendKeys("Cinthia");
        String correo="cerh2802@gmail.com";
        driver.findElement(By.name("email")).sendKeys(correo);
        driver.findElement(By.name("message")).sendKeys("Hola como estas");
        driver.findElement(By.id("send_bottom")).sendKeys(Keys.ENTER);
        Alert alerta = driver.switchTo().alert();
        System.out.println(alerta.getText());

       // driver.quit();

    }
}
