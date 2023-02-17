package org.example.intro;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SeleniumExceptions1 extends BaseTest{

    @Test
    public void noSuchElementExceptionTest(){
        // NoSuchElementException:
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.findElement(By.xpath("userName")).sendKeys("Hello World");
    }
    @Test
    public void noSuchWindowExceptionTest(){
        // NoSuchWindowException
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.switchTo().window("Hello");
    }

    @Test
    public void noSuchFrameExceptionTest(){
        // NoSuchFrameException
        browserHelper.openURL("https://demoqa.com/text-box");
        driver.switchTo().frame(123);
    }

    @Test
    public void noSuchAlertExceptionTest(){
        // NoSuchAlertException
        browserHelper.openURL("https://demoqa.com/text-box");
        alertHelper.acceptAlert();
    }

}