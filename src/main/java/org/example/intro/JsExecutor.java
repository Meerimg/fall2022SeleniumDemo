package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JsExecutor extends BaseTest{
    @Test
    public void test1(){
        browserHelper.openURL("");
        WebElement careersLink = driver.findElement(By.xpath(""));
    }
}
