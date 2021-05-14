package testng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class primero {
    public static void main(String[] args) {

        // sentencia un objeto wendriver
        WebDriver driver;
        //Declarar variables
        String baseurl ="http://demo.guru99.com/test/newtours/";
        String actualresult="";
        String expectedresult="Welcome: Mercury Tours";
        // indicar la localizcion del archivo chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\Chrome\\90.0.4430.24\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseurl);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());

    }



}
