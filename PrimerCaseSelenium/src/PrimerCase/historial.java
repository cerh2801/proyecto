package PrimerCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class historial {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://localhost:9080");
        driver.manage().window().maximize();
        driver.navigate().to("http://localhost:9080/#history");
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("http://localhost:9080/#products");
        System.out.println(driver.getCurrentUrl());
        driver.navigate().back();

    }
}
