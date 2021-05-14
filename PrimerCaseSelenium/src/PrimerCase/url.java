package PrimerCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class url {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://localhost:9080");
        driver.manage().window().maximize();
        System.out.println( driver.getTitle());
        String rutaantigua= driver.getCurrentUrl();
        WebElement link= driver.findElement(By.xpath("//*[@id=\"home\"]/app-nav/nav/div/ul/li[2]/a"));
        link.click();
        String nuevaruta= driver.getCurrentUrl();
        System.out.println(nuevaruta);
        if(rutaantigua.equals(nuevaruta)){
            System.out.println("Error");
        }else{
            System.out.println("Navegacion ok");
        }
    }

}
