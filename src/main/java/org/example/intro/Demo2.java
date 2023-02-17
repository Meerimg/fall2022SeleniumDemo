package org.example.intro;


import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.By.id;

public class Demo2 {


    static Faker faker = new Faker();
    WebDriver driver = new ChromeDriver();


    @Test
    public void testhomeWork(){


        WebDriverManager.chromedriver().setup();



        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://demoqa.com/text-box");

        WebElement inputName = driver.findElement(id("userName"));
        inputName.sendKeys(name);

        WebElement inputEmail = driver.findElement(id("userEmail"));
        inputEmail.sendKeys(email);

        WebElement inputCurrentAddress = driver.findElement(id("currentAddress"));
        inputCurrentAddress.sendKeys(current);

        WebElement inputPermanentAddress = driver.findElement(id("permanentAddress"));
        inputPermanentAddress.sendKeys(permanent);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)", "");

        WebElement button = driver.findElement(By.id("submit"));
        button.click();

        WebElement actualNameElement = driver.findElement(By.id("name"));
        WebElement actualEmailElement = driver.findElement(By.id("email"));
        WebElement actualCurrentAddressElement = driver.findElement(By.xpath("//p[@id=\"currentAddress\"]"));
        WebElement actualPermanentAddressElement = driver.findElement(By.xpath("//p[@id=\"permanentAddress\"]"));

        String actualNameText = actualNameElement.getText();
        String actualEmailText = actualEmailElement.getText();
        String actualCurrentAddress = actualCurrentAddressElement.getText();
        String actualPermanentAddress = actualPermanentAddressElement.getText();

        Assert.assertEquals(actualNameText,"Name:" + name);
        Assert.assertEquals(actualEmailText,"Email:" + email);
        Assert.assertTrue(actualCurrentAddress.contains(current));
        Assert.assertTrue(actualPermanentAddress.contains(permanent));


    }
    static String name = faker.name().fullName();
    static String email = faker.internet().emailAddress();
    static String current = faker.address().country();
    static String permanent = faker.address().country();

    @AfterClass
    public void exit(){
        driver.close();
        driver.quit();
    }

}
