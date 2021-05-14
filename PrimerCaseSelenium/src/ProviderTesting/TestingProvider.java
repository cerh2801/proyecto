package ProviderTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestingProvider {
    WebDriver driver;
    String titulo = "https://www.google.com";


    @Test
     public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get(titulo);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
 //* mo olvdar indicar el url al que ingresara
    @DataProvider(name = "data-provider")
    public Object[][] getDataFromDataProvider() {
        return new Object[][]
                { { "Yahoo" },
                        { "Amazon" } };
    }

    @Test(dataProvider = "data-provider")
    public void testMethod(String tester, String search) throws InterruptedException{
        WebElement buscar = driver.findElement(By.name("q"));
        buscar.sendKeys(search);
        System.out.println("Welcome ->: " +tester+ "your search key is "+search);
        Thread.sleep(2000);

        String testValue = buscar.getAttribute("value");
        System.out.println("Test value is-->"+testValue+"and is equal is" +search);
        buscar.clear();
        Assert.assertTrue(testValue.equalsIgnoreCase(search));

    }
    @Test(dataProvider = "data-provider")
            public void testMethods(String search) throws InterruptedException
    {
        WebElement buscar = driver.findElement(By.name("q"));
        buscar.sendKeys(search);
        Thread.sleep(2000);

        String testValue = buscar.getAttribute("value");
        System.out.println("Test value is-->"+testValue+"and is equal is" +search);
        buscar.clear();
        Assert.assertTrue(testValue.equalsIgnoreCase(search));

    }


}
