package org.example.intro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class CssDemo extends BaseTest {

    @Test
    public void cssTest1(){
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);
        WebElement appleText = driver.findElement(By.cssSelector("li[id='p_89/Apple']"));
        System.out.println(appleText.getText());

        List<WebElement> allBrands = driver.findElements(By.xpath("//li[contains(@id,'p_89/')]"));

//        System.out.println(appleText.getText());

        for(WebElement e : allBrands) {
            if (e.getText().equals("SAMSUNG")) {
                System.out.println("____________________________");
                e.findElement(By.tagName("i")).click();
                break;

            }
            System.out.println(e.getText());

            }
        }
    }
