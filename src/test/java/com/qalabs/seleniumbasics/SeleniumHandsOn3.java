package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHandsOn3 {
    public static void main (String[] args) throws InterruptedException{
        String ThisPageURL = "No Page";

        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.facebook.com");

        // Wait some seconds
        Thread.sleep(5000);

        ThisPageURL= myDriver.getCurrentUrl();

        assert ThisPageURL.equals("https://www.facebook.com"):"Pagina no igual";

        WebElement myElement = myDriver.findElement(By.id("email"));
        myElement.sendKeys("juan.tester.123@gmail.com");

        myElement = myDriver.findElement(By.id("pass"));
        myElement.sendKeys("tester123");

        myElement = myDriver.findElement(By.id("loginbutton"));
        myElement.click();
        Thread.sleep(5000);

        // Quit web driver
        myDriver.quit();
    }

}
