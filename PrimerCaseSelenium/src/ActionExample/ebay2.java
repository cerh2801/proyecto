package ActionExample;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ebay2 {

    String titulo="https://www.ebay.com";
    WebDriver driver;
    String ChromePath= System.getProperty("user.dir")+"\\driver\\chromedriver.exe";
    String producto = "Gorra";
    String marcas = "adidas";


    @BeforeTest
    public void launchBrowser() {

        System.setProperty("webdriver.chrome.driver", ChromePath);
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(titulo);
        driver.manage().window().maximize();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File("C:/Users/cinthia/IdeaProjects/PrimerCaseSelenium/img/ebay.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    @Test
    public void buscar() {
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.findElement(By.id("gh-ac")).sendKeys(producto);
        driver.findElement(By.id("gh-btn")).sendKeys(Keys.ENTER);

    }
    @DataProvider(name = "SearchProvider")
    public Object[][] getDataFromDataProvider(){
        return new Object[][]{
                {"Fernando","Camisa"},
                {"Luisa","Polo"},
                {"Sara","Mochila"},
                {"Lorena","Cartera"}

        };

    }
    @Test(dataProvider = "SearchProvider")
    public void testMethod(String tester, String search) throws InterruptedException{

        WebElement searchtext= driver.findElement(By.id("gh-ac"));
        searchtext.sendKeys(search);
        System.out.println("Welcome:"+ tester +" your search is :"+search);
        Thread.sleep(3000);
        String testValue = searchtext.getAttribute("value");
        System.out.println("Test value es:"+ testValue +" and is equal to :"+search);
        searchtext.clear();
        WebElement enlace = driver.findElement(By.id("s0-14-11-0-1-2-6-0-2[1]-20[0]-4"));
        enlace.click();
        driver.findElement(By.id("c3-mainPanel-Brand")).sendKeys(Keys.ENTER);
        WebElement product=driver.findElement(By.id("c3-subPanel-_x-searchable-0-1-textbox"));
        product.sendKeys(marcas);
        WebElement marcar= driver.findElement(By.id("c3-subPanel-_x-searchable-0-5[0[0]]-0_cbx"));
        marcar.click();

    }







}
