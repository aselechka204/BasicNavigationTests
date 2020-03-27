package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {


        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");

        getTitle(urls);

    }

    public static void getTitle(List <String>urls) {

        WebDriver driver = BrowserFactory.getDriver("chrome");

        List<String> titls= new ArrayList<>();
        for (String each:urls) {
            driver.get(each);
            WebDriverWait wait= new WebDriverWait(driver, 10);
            wait.until(WebDriver::getTitle);
            titls.add(driver.getTitle());

        }
        StringUtility.verifyEquals(titls.get(0),titls.get(1));
        StringUtility.verifyEquals(titls.get(1),titls.get(2));


        driver.quit();
    }
}
