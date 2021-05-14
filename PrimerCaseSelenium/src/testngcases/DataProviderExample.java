package testngcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DataProviderExample {
     WebDriver driver;

    @BeforeTest
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com.pe");

    }
    @AfterTest
    public void tearDown(){
        driver.quit();
    }

    @DataProvider(name ="SearchProvider")
    public Object[][] getDataFromDataProvider(){
        return new Object[][]
                { { "Cinthia", "Yahoo" },
                        { "Zaida", "Hotmail" } };


    }
    @Test(dataProvider = "SearchProvider")
    public void testMethod(String tester, String search) throws InterruptedException {
        WebElement busqueda = driver.findElement(By.name("q"));
        busqueda.sendKeys(search);
        System.out.println("Welcome--->" + tester + "your search word is --->" + search);
        Thread.sleep(3000);
       // String testValue = busqueda.getAttribute("value");
       // System.out.println("Test value is--->" + testValue + "your search word is --->" + search);
        //busqueda.clear();
        //Assert.assertTrue(testValue.equals(search));
    }



}
