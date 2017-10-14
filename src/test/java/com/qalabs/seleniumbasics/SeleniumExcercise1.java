package com.qalabs.seleniumbasics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;

public class SeleniumExcercise1 {
    public static void main(String[] args) throws InterruptedException{
        WebDriver myDriver = WebDriverFactory.getDriver("firefox");
        myDriver.get("https://www.google.com.mx");
        System.out.println("Page URL.-" + myDriver.getCurrentUrl());
        System.out.println("Page Title.-" + myDriver.getTitle());
        //System.out.println("Page Source.-" + myDriver.getPageSource());
        //Thread.sleep(1000);

        myDriver.navigate().to("https://www.facebook.com");
        System.out.println("Page URL.-" + myDriver.getCurrentUrl());
        System.out.println("Page Title.-" + myDriver.getTitle());
        //System.out.println("Page Source.-" + myDriver.getPageSource());
        //Thread.sleep(1000);

        myDriver.navigate().to("https://www.ESPN.com");
        System.out.println("Page URL.-" + myDriver.getCurrentUrl());
        System.out.println("Page Title.-" + myDriver.getTitle());
        //System.out.println("Page Source.-" + myDriver.getPageSource());
        //Thread.sleep(1000);

        myDriver.navigate().back();
        myDriver.navigate().back();
        System.out.println("Page URL.-" + myDriver.getCurrentUrl());
        myDriver.navigate().forward();
        System.out.println("Page URL.-" + myDriver.getCurrentUrl());

        myDriver.close();


    }
}
