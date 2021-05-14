package segundocaso;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class checkboxes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://localhost:9080");
        WebElement checkbox = driver.findElement(By.id("conditions"));
        if ( checkbox.isSelected()){
            checkbox.sendKeys(Keys.SPACE);
            // enviar los datos de formulario identificar el formulario
            driver.findElement(By.id("conditions")).submit();

        }
    }
}
