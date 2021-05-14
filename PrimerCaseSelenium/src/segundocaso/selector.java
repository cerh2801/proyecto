package segundocaso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class selector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("http://localhost:9080");
        String nombre="Cinthia";
        driver.findElement(By.name("name")).sendKeys(nombre);
        Select topics = new Select(driver.findElement(By.id("topic-select-menu")));
        topics.selectByVisibleText("Other");
    }

    public static class testng1 {

        @Test(priority = 1, description = "prueba 1")
        public void pruebainicial(){

            System.out.println("prueba realizada 1");

        }
        @Test(priority = 2, description = "prueba 2")
        public void pruebados(){

            System.out.println("prueba realizada 2");
        }
        @Test(priority = 3, description = "prueba 3")
        public void pruebatres(){

            System.out.println("prueba realizada 3");
        }
    }
}
