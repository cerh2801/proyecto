package PrimerCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ventanas {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://localhost:9080");
        driver.manage().window().maximize();

        WebElement enlace = driver.findElement(By.xpath("/html/body/app-root/app-home/header/app-nav/nav/div/ul/li[6]/a"));
        enlace.click();
        ArrayList ventanas = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(ventanas.get(1).toString());
        System.out.println(driver.getCurrentUrl());
        driver.close();


    }
}
