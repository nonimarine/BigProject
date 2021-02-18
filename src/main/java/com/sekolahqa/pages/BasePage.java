package com.sekolahqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//ini perlu ya, klo create project baru, base pagenya jangan lupa

public class BasePage {
    protected static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public static void inputText(By by, String text) throws InterruptedException {
        WebElement element = driver.findElement(by);
        Thread.sleep(200);
        element.sendKeys(text);
    }

    public static void clickButton(By by) throws InterruptedException {
        WebElement element = driver.findElement(by);
        Thread.sleep(200);
        element.click();
    }

    public static By waitUntilElementIsVisible(By by) throws InterruptedException {
        Thread.sleep(200);
        WebElement element = driver.findElement(by);
        return by;
    }
}

/*
1. input text
2. click
4. scroll down
5. scroll up
6. swich to frame
7. swipe right
8. swipe left
9. waitUntilElementIsVisible
10. waitUntilElementIsInvisible
11. waitUntilElementIsClickAble

 */
