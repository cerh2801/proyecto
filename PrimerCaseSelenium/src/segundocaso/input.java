package segundocaso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class input {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://localhost:9080");
        String nombre="Cinthia";
        driver.findElement(By.name("name")).sendKeys(nombre);
        driver.findElement(By.id("no_newsletter")).click();
    }
}
