package org.example;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AppTest extends DriverSetup

{
//    WebDriver browser;
//    @BeforeSuite
//    //open a browser
//    public void openBrowser()
//    {
//        browser = new ChromeDriver();
//    }
//    // close browser
//    @AfterSuite
//    public void closeBrowser()
//    {
//        browser.close();
//    }
@Test
    public  void webpageUrlTest() {
        browser.get("https://othoba.com/");
        //get page url
        String pageUrl=browser.getCurrentUrl();
        System.out.println(pageUrl);
        Assert.assertEquals(pageUrl,"https://othoba.com/");
    }
    @Test
    public void webpageTitleTest() {

        //load webpage https://othoba.com/
        browser.get("https://othoba.com/");
        //get page title
        String pageTitle=browser.getTitle();
        System.out.println(pageTitle);
        //validate title text with " Hassle-free online shopping in Bangladesh | Othoba.com
//       if(pageTitle.equals("Hassle-free online shopping in Bangladesh | Othoba.com"))
//       {
//           System.out.println("Test Pass");
//       }
//       else
//       {
//           System.out.println("Test Failed");
//       }
        Assert.assertEquals(pageTitle,"Hassle-free online shopping in Bangladesh | Othoba.com");

    }
}
