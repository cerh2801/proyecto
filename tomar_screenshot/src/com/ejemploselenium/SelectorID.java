package com.ejemploselenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SelectorID {
    public static void main( String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chrome\\chromedriver.exe");

        ChromeOptions chrome_options = new ChromeOptions();
        /// actualiza el valor negativo, puede que el browser aparezca fuera de tu pantalla
        chrome_options.addArguments("--window-position=-850,750");
        chrome_options.addArguments("--window-size=800,500");


        WebDriver driver = new ChromeDriver(chrome_options);
        driver.get("http://localhost:9080");

        driver.manage().window().maximize();

        File src = ((TakesScreenshot) driver).getScreenshotAs( OutputType.FILE );

        try{
            FileUtils.copyFile( src , new File( "C:/selenium/imagen.png") );
        }catch ( IOException e){
            System.out.println(e.getMessage());
        }








    }
}
