package com.cbt.utilities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {

    public static void main(String[] args) {

        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com/", "https://walmart.com","https://westelm.com/");

          getTitle2(urls);
    }

    public static void getTitle2(List<String> url) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        List<String> list = new ArrayList<>();
        for (String eachList : url) {
            driver.get(eachList);
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(WebDriver::getTitle);
           String title= driver.getTitle();
             if(eachList.equals("https://luluandgeorgia.com")){
                 if(eachList.contains(title.replace(" ","").toLowerCase())){
                     System.out.println("Passed Lulu");
                 }else{
                     System.out.println("Lulu failed");
                 }
             }else if(eachList.equals("https://wayfair.com/")){
                 String [] title1 = title.split(" ");
                 if(eachList.contains(title1[0].toLowerCase())){
                     System.out.println("Wayfare passed");
                 }else{
                     System.out.println("Walfare failed");
                 }
             }else if(eachList.equals("https://walmart.com")){
                String [] title2 = title.split("|");
                if(eachList.contains(title2[0].toLowerCase())){
                    System.out.println("Walmart Passed");
                }else{
                    System.out.println("Walmart Failed");
                }

             }else if(eachList.equals("https://westelm.com/")){
                String [] title3 = title.split(":");
                if(eachList.contains(title3[0].toLowerCase())){
                    System.out.println("West Elm Passed");
                }else{
                    System.out.println("West Elm Failed");
                }
             }



        }






        driver.quit();
    }

}
