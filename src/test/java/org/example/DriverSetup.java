package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
    WebDriver browser;
    @BeforeSuite
    //open a browser
    public void openBrowser()
    {
        browser = new ChromeDriver();
    }
    // close browser
    @AfterSuite
    public void closeBrowser()
    {
        browser.close();
    }
}
