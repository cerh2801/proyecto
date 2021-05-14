package testng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class testuno {

    @Test
    public void testing() {

        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        String ruta ="http://demo.guru99.com/test/newtours/";
        driver.get(ruta);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

    }


}
