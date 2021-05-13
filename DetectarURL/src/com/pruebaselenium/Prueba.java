package com.pruebaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Prueba {

   public static void main(String[] args){
       ChromeOptions chrome_options = new ChromeOptions();
       chrome_options.addArguments("--window-position=-850,750");
       chrome_options.addArguments("--window-size=800,500");

       WebDriver driver = new ChromeDriver(chrome_options);
       driver.get("http://localhost:9080/");

       driver.navigate().to( "http://localhost:9080/#history" );

       System.out.println( driver.getCurrentUrl() );

       driver.navigate().to( "http://localhost:9080/#products" );

       System.out.println( driver.getCurrentUrl() );

       driver.navigate().back();

       System.out.println( driver.getCurrentUrl() );


   }
}
