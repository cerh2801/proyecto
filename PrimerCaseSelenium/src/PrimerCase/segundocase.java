package PrimerCase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class segundocase {
    public static void main( String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
       // webDriver.get("https://www.wikipedia.org");
        String titulo ="https://www.ebay.com/";
        driver.get(titulo);
        System.out.println(titulo);
        driver.manage().window().maximize();
        driver.findElement(By.id("gh-ac")).sendKeys("Gorra");
        driver.findElement(By.id("gh-btn")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//span[text()='ver todo']")).click();
        //driver.findElement(By.xpath("//input[contains(@id,'c3-subPanel-Size_S-0_cbx')]")).click();



    }
}
