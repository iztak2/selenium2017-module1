package com.qalabs.seleniumbasics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;

public class SeleniumExcercise4 {

    public static void main(String[] args) throws InterruptedException{
        WebDriver myDriver = WebDriverFactory.getDriver("chrome");
        myDriver.get("https://www.youtube.com.mx");
        System.out.println("Page URL.-" + myDriver.getCurrentUrl());
        System.out.println("Page Title.-" + myDriver.getTitle());
        WebElement myElement = myDriver.findElement(By.id("search-container"));
        if (myElement.isDisplayed()==true){
            System.out.println("Elemento Mostrado");
        }else{
            System.out.println("Elemento NO Mostrado");
        }
        if (myElement.isEnabled() ==true){
            System.out.println("Elemento Habilitado");
            myElement.sendKeys("Selenium");

        }else{
            System.out.println("Elemento NO Habilitado");
        }

    }

}
