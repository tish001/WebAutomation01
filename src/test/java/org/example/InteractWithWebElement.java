package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractWithWebElement extends DriverSetup {
    @Test
    public void interactWithElement() throws InterruptedException {
        WebElement modalImage;

        browser.get("https://othoba.com/");
        modalImage = browser.findElement(By.className("mfp-close"));
        modalImage.click();
        browser.findElement(By.linkText("Register")).click();
//        WebElement h1 = browser.findElement(By.tagName("h1"));
//        String first_header = h1.getText();
//        System.out.println(first_header);
        WebElement header = browser.findElement(By.xpath("//h1[normalize-space()='Register']"));
        String first_header = header.getText();
        System.out.println(first_header);
      WebElement radio_label_1 = browser.findElement(By.xpath("//label[@for='gender-Male']"));

        System.out.println("Display Status: " + radio_label_1.isDisplayed());
        System.out.println("Select Status: " + radio_label_1.isSelected());
        Thread.sleep(2000);
        radio_label_1.click();
        System.out.println("After click Select Status: " + radio_label_1.isSelected());
        Thread.sleep(2000);

        WebElement radio_label_2 = browser.findElement(By.xpath("//label[@for='gender-Female']"));
        Thread.sleep(2000);

        radio_label_2.click();

        System.out.println("After click another one Select Status for radio button 1: " + radio_label_2.isSelected());
        Thread.sleep(2000);
        WebElement checkBox2 = browser.findElement(By.id("Newsletter"));

        System.out.println("Is enabled :" +checkBox2.isEnabled());

        checkBox2.click();

        Thread.sleep(3000);
        WebElement autocomplete_input_box = browser.findElement(By.xpath("//input[@id='autocomplete-0-input']"));


        autocomplete_input_box.sendKeys("book");

        Thread.sleep(2000);
        autocomplete_input_box.sendKeys(Keys.CONTROL + "a");

        autocomplete_input_box.sendKeys(Keys.DELETE);
        Thread.sleep(2000);
        autocomplete_input_box.sendKeys("Grocery");
        Thread.sleep(2000);
        String text = autocomplete_input_box.getAttribute("placeholder");
        System.out.println("placeholder: " + text);
        Thread.sleep(3000);
        WebElement submitButton = browser.findElement(By.id("register-button"));
        String background_color = submitButton.getCssValue("background-color");
        System.out.println(background_color);
        Thread.sleep(3000);
//        WebElement box = browser.findElement(By.id("displayed-text"));
//
//        System.out.println("Before: " + box.isDisplayed());
//
//        browser.findElement(By.id("hide-textbox")).click();
//
//        Thread.sleep(3000);

//        System.out.println("After: " + box.isDisplayed());
//        Thread.sleep(2000);


    }
}
