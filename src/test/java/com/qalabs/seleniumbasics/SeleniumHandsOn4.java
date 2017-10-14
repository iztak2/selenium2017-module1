package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumHandsOn4 {
    public static void main (String[] args) throws InterruptedException{
        String ThisPageURL = "No Page";

        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.amazon.com.mx");

        // Wait some seconds
        Thread.sleep(10000);

        ThisPageURL= myDriver.getCurrentUrl();

        assert ThisPageURL.equals("https://www.facebook.com"):"Pagina no igual";

        WebElement myElement = myDriver.findElement(By.id("twotabsearchtextbox"));
        myElement.sendKeys("Selenium");
        myElement.sendKeys(Keys.ENTER);

        Thread.sleep(10000);

        // Quit web driver
        myDriver.quit();
    }

}
