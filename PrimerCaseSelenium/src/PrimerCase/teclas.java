package PrimerCase;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class teclas {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://localhost:9080");
        WebElement documents= driver.findElement(By.tagName("body"));
        documents.sendKeys(Keys.ENTER);
        Alert alerta = driver.switchTo().alert();
        System.out.println(alerta.getText());
    }

}
