package ActionExample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Actions {
    String titulo="http://demo.guru99.com/test/newtours";
    WebDriver driver;
    String ChromePath= System.getProperty("user.dir")+"\\driver\\chromedriver.exe";

    @BeforeTest
   public void launchBrowser() {
      // System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
              // String ChromePath= System.getProperty("user.dir")+"\\driver\\chromedriver.exe";
               System.setProperty("webdriver.chrome.driver", ChromePath);
               driver= new ChromeDriver();
               driver.manage().window().maximize();
               driver.get(titulo);
    }
    @Test(priority = 1, description = "registro de elementos")
    public void register() {
       driver.findElement(By.linkText("Home")).click();
       System.out.println(driver.getTitle());
       driver.findElement(By.linkText("REGISTER")).click();
        System.out.println(driver.getTitle());
       driver.findElement(By.linkText("Home")).click();
        System.out.println(driver.getTitle());

    }
    //*no ejecutar la clase
    @Test(priority = 0, enabled = false)
    public void support() throws InterruptedException{

        driver.findElement(By.linkText("Home")).click();
        driver.findElement(By.linkText("SUPPORT")).click();
        driver.findElement(By.linkText("Home")).click();

    }
    @AfterTest
    public void salir(){

        driver.close();

    }

}
