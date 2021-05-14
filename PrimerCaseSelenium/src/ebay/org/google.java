package ebay.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class google {
    String titulo="https://www.google.com";
    WebDriver driver;
    String ChromePath= System.getProperty("user.dir")+"\\driver\\chromedriver.exe";

    @BeforeTest(groups = {"A","B"})
    public void launchBrowser() {

        System.setProperty("webdriver.chrome.driver", ChromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(titulo);
    }


    @AfterTest(groups = {"B"})
    public void salir(){
       driver.close();
    }

    @DataProvider(name = "SearchProvider")
     public Object[][] getDataFromDataProvider(){
        return new Object[][]{
                {"Fernando","Google"},
                {"Luisa","Yahoo"},
                {"Sara","Gmail"},
                {"Lorena","Amazon"}

        };

    }
    @Test(dataProvider = "SearchProvider")
    public void testMethod(String tester, String search) throws InterruptedException{

        WebElement searchtext= driver.findElement(By.name("q"));
        searchtext.sendKeys(search);
        System.out.println("Welcome:"+ tester +"your search is :"+search);
        Thread.sleep(3000);

        String testValue = searchtext.getAttribute("value");
        System.out.println("Test value es:"+ testValue +"and is equal to :"+search);
        searchtext.clear();


    }



}
