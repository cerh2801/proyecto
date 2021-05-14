package PrimerCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class tabs {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://localhost:9080");
        driver.manage().window().maximize();
        String abrirnuevotab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        WebElement enlace = driver.findElement(By.xpath("//*[@id=\"home\"]/app-nav/nav/div/ul/li[3]/a"));
        enlace.sendKeys(abrirnuevotab);
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        System.out.println( tabs.size());
        driver.switchTo().window(tabs.get(1).toString());
        System.out.println(driver.getCurrentUrl());
    }
}
