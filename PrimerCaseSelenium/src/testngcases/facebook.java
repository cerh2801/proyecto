package testngcases;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class facebook {

    static WebDriver driver;

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);

        String link = "https://es-la.facebook.com";
        driver.get(link);
        driver.manage().window().maximize();
        try{

            WebElement txtuser= driver.findElement(By.id("email"));
            Actions builder = new Actions(driver);
            Action seriesOfActions = builder
                    .moveToElement(txtuser)
                    .click()
                    .keyDown(Keys.SHIFT)
                    .sendKeys("Hello")
                    .keyDown(Keys.SHIFT)
                    .doubleClick()
                    .contextClick(txtuser)
                    .build();
            seriesOfActions.perform();
            Thread.sleep(2000);
            System.out.println("Test passed");
        }catch (NoSuchElementException ne){
           System.err.println("Test Failed: element was no found");
        }catch (Exception e){
            System.err.println("Test Failed" +e);
        }
        finally{
            driver.close();

        }

    }
}
