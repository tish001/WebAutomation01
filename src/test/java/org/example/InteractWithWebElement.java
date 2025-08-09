package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractWithWebElement extends DriverSetup {
    @Test
    public void interactWithElement() throws InterruptedException {

        browser.get("https://othoba.com/");
        browser.findElement(By.linkText("Register")).click();
        WebElement header = browser.findElement(By.tagName("h1"));
        String first_header = header.getText();
        System.out.println(first_header);

        WebElement autocomplete_input_box = browser.findElement(By.xpath("//input[@id='autocomplete-0-input']"));

        autocomplete_input_box.sendKeys("book");

        Thread.sleep(5000);

        autocomplete_input_box.clear();
        Thread.sleep(5000);

        autocomplete_input_box.sendKeys("grocery");
        Thread.sleep(2000);
        String text = autocomplete_input_box.getAttribute("placeholder");

        System.out.println("placeholder: " + text);
        Thread.sleep(3000);
       WebElement submitButton = browser.findElement(By.id("register-button"));
     String background_color = submitButton.getCssValue("background-color");
      System.out.println(background_color);
        //     browser.get("https://rahulshettyacademy.com/AutomationPractice/");
//
//        WebElement radio_option_1 = browser.findElement(By.xpath("//input[@name='gender']"));
////
//    System.out.println("Display Status: " + radio_option_1.isDisplayed());
//    System.out.println("Select Status: " + radio_option_1.isSelected());
//       Thread.sleep(2000);
//     radio_option_1.click();
//   System.out.println("After click Select Status: " + radio_option_1.isSelected());
//    Thread.sleep(2000);
//
//        WebElement radio_option_2 = browser.findElement(By.xpath("//input[@value='radio2']"));
//
//
//        radio_option_2.click();
//
//        System.out.println("After click another one Select Status for radio button 1: " + radio_option_1.isSelected());
//        WebElement box = browser.findElement(By.id("displayed-text"));
//
//        System.out.println("Before: " + box.isDisplayed());
//
//        browser.findElement(By.id("hide-textbox")).click();
//
//        Thread.sleep(3000);
//
//        System.out.println("After: " + box.isDisplayed());
//        Thread.sleep(3000);
//        WebElement checkBox2 = browser.findElement(By.id("checkBoxOption2"));
//
//        System.out.println("Is enabled :" +checkBox2.isEnabled());
//
//        checkBox2.click();
//        Thread.sleep(2000);

    }
}
