package PrimerCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class StaticWeb {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://localhost:9080");
        driver.manage().window().maximize();

        //lista del id indicado

        List<WebElement> elementos = driver.findElements(By.name("email"));

        for ( WebElement elemento:elementos){
            System.out.println(elemento.getAttribute( "id"));

        }
        //texto del id people
        List<WebElement> element = driver.findElements(By.xpath("//*[@id=\"people\"]"));
        for ( WebElement elemento:element){
            System.out.println(elemento.getText());

        }








    }
}