package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class InteractWithDropDown extends DriverSetup {

    @Test
    public void testDropdown() throws InterruptedException {
        WebElement modalImage;
        browser.get("https://othoba.com/");
        modalImage = browser.findElement(By.className("mfp-close"));
       modalImage.click();
        browser.findElement(By.linkText("Register")).click();
        WebElement dropdown = browser.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        dropdown.click();
        Thread.sleep(4000);
       Select select = new Select(dropdown);
       List<WebElement> options = select.getOptions();

        for (WebElement option: options){
            System.out.println(option.getText());
        }

        select.selectByVisibleText("5");
        Thread.sleep(2000);

        System.out.println( select.getFirstSelectedOption().getText());

        select.selectByValue("20");
        Thread.sleep(2000);
        System.out.println( select.getFirstSelectedOption().getText());

//        select.selectByIndex(1);
//
//        Thread.sleep(2000);
//        System.out.println( select.getFirstSelectedOption().getText());
        WebElement dropdownMonth = browser.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));

        dropdownMonth.click();
        Thread.sleep(4000);
        Select selectMonth = new Select(dropdownMonth);
        List<WebElement> optionsMonth = selectMonth.getOptions();

        for (WebElement option: optionsMonth){
            System.out.println(option.getText());
        }

        selectMonth.selectByVisibleText("March");
        Thread.sleep(2000);

        System.out.println( selectMonth.getFirstSelectedOption().getText());
        WebElement dropdownYear= browser.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        dropdownYear.click();
        Thread.sleep(3000);
        Select selectYear= new Select(dropdownYear);
        List<WebElement> optionsYear = selectYear.getOptions();

        for (WebElement option:optionsYear)
        {
            System.out.println(option.getText());
        }
       selectYear.selectByVisibleText("1996");
        Thread.sleep(3000);
        System.out.println(selectYear.getFirstSelectedOption().getText());

        WebElement dropdownHover = browser.findElement(By.className("w-icon-category"));

        Actions actions = new Actions(browser);
        actions.moveToElement(dropdownHover).perform(); // hover
        Thread.sleep(4000);

        List<WebElement> dropdownHoverLink = browser.findElements(
                By.xpath("//ul[contains(@class, 'vertical-menu')]/li/a")
        );
        List<WebElement> dropdownHoverLinks = browser.findElements(
                By.className("dropdown-box")
        );

        for (WebElement link : dropdownHoverLinks) {
            System.out.println(link.getText());
        }
    }

}