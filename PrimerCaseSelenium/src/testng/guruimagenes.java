package testng;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class guruimagenes {

    @Test
    public void tester(){

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);

        String link ="http://live.demoguru99.com/index.php/";
        driver.get(link);
        driver.manage().window().maximize();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(src, new File("C:/Users/cinthia/IdeaProjects/PrimerCaseSelenium/img/primercase.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        WebElement tv = driver.findElement(By.partialLinkText("TV"));
        tv.click();
        WebElement boton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/div[3]/button"));
        boton.sendKeys(Keys.ENTER);

        
    }
}
