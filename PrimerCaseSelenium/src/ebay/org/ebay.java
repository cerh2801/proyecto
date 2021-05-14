package ebay.org;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ebay {
    WebDriver driver;
    String producto = "Gorra";
    String marcas = "adidas";
    int numero;
    String titulo = "https://www.ebay.com";

    @Test
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get(titulo);
        driver.manage().window().maximize();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("C:/Users/cinthia/IdeaProjects/PrimerCaseSelenium/img/ebayimg.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.findElement(By.id("gh-ac")).sendKeys(producto);
        driver.findElement(By.id("gh-btn")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("s0-14-11-0-1-2-6-0-2[1]-20[0]-4")).click();

        driver.findElement(By.id("c3-mainPanel-Brand")).click();
        driver.findElement(By.id("c3-subPanel-_x-searchable-0-1-textbox")).sendKeys(marcas);
        driver.findElement(By.id("c3-subPanel-_x-searchable-0-5[0[0]]-0_cbx")).click();

        driver.findElement(By.id("c3-mainPanel-Size")).click();
        driver.findElement(By.id("c3-subPanel-Size_S-0_cbx")).click();
        driver.findElement(By.xpath("//*[@id=\"c3-footerId\"]/div[2]/button")).sendKeys(Keys.ENTER);
        WebElement number = driver.findElement(By.cssSelector(".srp-controls__count-heading"));
        System.out.println("El numero de productos es: " + number.getText());
        driver.findElement(By.partialLinkText("Mejor resultado seleccionados.")).click();



    }
}











