package PrimerCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wikipedia {
    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver","C:\\webdriver\\Firefox\\geckodriver-v0.28.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");
    }
}
