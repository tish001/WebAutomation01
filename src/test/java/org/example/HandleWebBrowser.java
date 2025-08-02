package org.example;

import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HandleWebBrowser extends DriverSetup {
    @Test
    public void handleBrowser() throws InterruptedException {

        browser.get("https://www.google.com");
        Thread.sleep(2000);
        System.out.println(browser.getCurrentUrl());
        System.out.println(browser.getTitle());
        browser.navigate().to("https://www.facebook.com");
        Thread.sleep((2000));
        browser.navigate().back();
        Thread.sleep(2000);
        browser.navigate().forward();
        Thread.sleep(2000);

//        browser.navigate().refresh();
//        Thread.sleep(2000);
//
//        browser.manage().window().maximize();
//        Thread.sleep(2000);
//        browser.manage().window().minimize();
//        Thread.sleep(2000);
//        browser.manage().window().maximize();
//        Thread.sleep(2000);
//        browser.manage().window().fullscreen();
//        Thread.sleep(2000);

        browser.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
        browser.get("https://othoba.com/");
        Thread.sleep(2000);
        // Get the current window handle and store it
        String currentWindowHandle = browser.getWindowHandle();
//        System.out.println(currentWindowHandle);
        // Then switch to it (usually used to switch back)
        browser.switchTo().window(currentWindowHandle);
        Thread.sleep(5000);
        List<String> handles =new ArrayList<String>(browser.getWindowHandles());
        for(String handle:handles)
        {
            browser.switchTo().window(handle);
            System.out.println(handle);
            System.out.println("We are currently at "+ browser.getTitle() + "page");
            Thread.sleep(3000);
        }


    }

}
