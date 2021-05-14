package com.pruebaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;


public class Prueba {

   public static void main(String[] args){
       ChromeOptions chrome_options = new ChromeOptions();
       chrome_options.addArguments("--window-position=-850,750");
       chrome_options.addArguments("--window-size=800,500");

       WebDriver driver = new ChromeDriver(chrome_options);
       driver.get("http://localhost:9080/");

        WebElement enlace = driver.findElement( By.xpath("//*[@id=\"home\"]/app-nav/nav/div/ul/li[5]/a"));
        enlace.click();

        ArrayList ventanas = new ArrayList( driver.getWindowHandles() );

        driver.switchTo().window( ventanas.get(1).toString() );


       System.out.println( driver.getCurrentUrl() );

       driver.close();






   }
}
