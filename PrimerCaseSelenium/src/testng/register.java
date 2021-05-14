package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class register {

    @Test
    public void register(){

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);

        String link="http://demo.guru99.com/test/newtours";
        driver.get(link);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        WebElement resgister = driver.findElement(By.partialLinkText("REGISTER"));
        resgister.click();
        System.out.println(driver.getTitle());
        WebElement homes = driver.findElement(By.partialLinkText("Home"));
        homes.click();
        driver.close();




    }
}
