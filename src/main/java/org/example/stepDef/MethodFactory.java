package org.example.stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodFactory {
    static WebDriver driver= new ChromeDriver();
    public static void initiateBrowser(){
        System.setProperty("web.chrome.driver", "src/driver");
        driver.manage().window().maximize();
    }

    public static void navigateurl() {
        driver.get("You web url");
    }

    public static void enterText(String identifier, String testData){
        driver.findElement(By.id(identifier)).sendKeys(testData);
    }

    public static void clickElementById(String identifier){
        driver.findElement(By.id(identifier)).click();
    }

    public static void clickElementByXpath(String identifier){
        driver.findElement(By.xpath(identifier)).click();
    }
}
