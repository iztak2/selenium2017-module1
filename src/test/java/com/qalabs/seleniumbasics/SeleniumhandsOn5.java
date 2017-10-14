package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class SeleniumhandsOn5 {
    public static void main (String[] args) throws InterruptedException{


        String ThisPageURL = "No Page";

        // Define which browser to use
        String browser = "firefox";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.facebook.com");

        // Wait some seconds
        Thread.sleep(1000);

        ThisPageURL= myDriver.getCurrentUrl();

        assert ThisPageURL.equals("https://www.facebook.com"):"Pagina no igual";

        WebElement myElement = myDriver.findElement(By.id("email"));
        myElement.sendKeys("juan.tester.123@gmail.com");

        myElement = myDriver.findElement(By.id("pass"));
        myElement.sendKeys("tester123");

        myElement = myDriver.findElement(By.id("loginbutton"));
        myElement.click();
        Thread.sleep(1000);

        myElement = myDriver.findElement(By.name("q"));
        myElement.sendKeys("QA Minds Lab");
        myElement.sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        myElement = myDriver.findElement(By.xpath("//div[text()='QA Minds Lab']"));
        myElement.click();
        Thread.sleep(5000);

        myElement = myDriver.findElement(By.xpath("//*[@name='xhpc_message_text']"));
        myElement.sendKeys("Hellow QA Minds -Carlos Galvan");

        myElement = myElement.findElement(By.xpath("//button[@data-testid='react-composer-post-button']"));
        myElement.submit();

        Thread.sleep(10000);

        // Quit web driver
        //myDriver.quit();

    }

}
