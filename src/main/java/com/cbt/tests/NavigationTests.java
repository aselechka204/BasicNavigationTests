package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTests {


    public static void main(String[] args) {

  chromeM();
  fireFoxM();
  edgeM();


    }


    public static void chromeM() {

        WebDriver driver =BrowserFactory.getDriver("chrome");

        driver.get("http://google.com");
        String title= driver.getTitle();
        System.out.println(title);

       driver.navigate().to("http://etsy.com");
        String title2=driver.getTitle();
        System.out.println(title2);

        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(),title);

         driver.navigate().forward();

        StringUtility.verifyEquals(driver.getTitle(),title2);

         driver.quit();
    }



    public static void fireFoxM() {

        WebDriver driver =BrowserFactory.getDriver("firefox");

        driver.get("http://google.com");
        String title= driver.getTitle();
        System.out.println(title);

        driver.navigate().to("http://etsy.com");
        String title2=driver.getTitle();
        System.out.println(title2);

        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(),title);

        driver.navigate().forward();

        StringUtility.verifyEquals(driver.getTitle(),title2);

        driver.quit();
    }

    public static void edgeM() {

        WebDriver driver =BrowserFactory.getDriver("edge");

        driver.get("http://google.com");
        String title= driver.getTitle();
        System.out.println(title);

        driver.navigate().to("http://etsy.com");
        String title2=driver.getTitle();
        System.out.println(title2);

        driver.navigate().back();
        StringUtility.verifyEquals(driver.getTitle(),title);

        driver.navigate().forward();

        StringUtility.verifyEquals(driver.getTitle(),title2);

        driver.quit();
    }

}
