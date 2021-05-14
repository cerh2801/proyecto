package mobi.carlossolis;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PropiedadesNavegador {

    public static void main( String[] args){

        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.addArguments("--window-position=-850,750");
        chromeOptions.addArguments("--window-size=800,500");
        chromeOptions.addArguments("--headless");

        WebDriver webDriver = new ChromeDriver( chromeOptions );

        webDriver.get("https://www.wikipedia.org");


        String titulo = webDriver.getTitle();

        System.out.println( titulo);

    }
}
