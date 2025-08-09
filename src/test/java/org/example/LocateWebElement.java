package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class LocateWebElement extends DriverSetup {
    @Test
    public void testLocateElement() throws InterruptedException {
        browser.get("https://othoba.com/");
        WebElement searchInputBox;
        WebElement modalImage;
        WebElement selectorCheck;

        WebElement testAreaCheck;

//        modalImage = browser.findElement(By.className("mfp-close"));
//        modalImage.click();
        searchInputBox = browser.findElement(By.id("autocomplete-0-input"));
        searchInputBox.sendKeys("QA");
        Thread.sleep(3000);
//        browser.findElement(By.linkText("Compare")).click();

//        searchInputBox1 = browser.findElement(By.name("__RequestVerificationToken"));
//        testAreaCheck = browser.findElement(By.tagName("input"));
//        testAreaCheck.click();
//    browser.navigate().back();
        browser.findElement(By.partialLinkText("Regis")).click();
        browser.findElement(By.tagName("input"));
        browser.findElement(By.name("Phone")).sendKeys("019");
        Thread.sleep(2000);
        selectorCheck = browser.findElement(By.cssSelector("input[name='Email']"));
        selectorCheck.sendKeys("a@gmail.com");
        Thread.sleep(2000);
        browser.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Tisha");
        Thread.sleep(2000);
        browser.findElement(By.cssSelector("#LastName")).sendKeys("Tani");
        Thread.sleep(2000);

        browser.findElement(By.cssSelector(".btn.btn-primary.dl-register-button-click")).click();
        Thread.sleep(3000);
        browser.navigate().back();
        List<WebElement> all_links_elements = browser.findElements(By.xpath("//a"));


        for (WebElement link_element : all_links_elements) {
            String text = link_element.getText();
            System.out.println(text);
        }
        Thread.sleep(3000);
    }
}
