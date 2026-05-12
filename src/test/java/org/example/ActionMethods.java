package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;

public class ActionMethods {
    public static void main(String[] args) throws InterruptedException, AWTException{
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

//        findElement
        WebElement username = driver.findElement(By.name("email"));
        Actions ac = new Actions(driver);

        //        moveToElement
        //        perform()
        ac.moveToElement(username).perform();

        //      click
        ac.click(username).perform();

//        sendKeys
        ac.sendKeys("abc78@gmail.com").perform();

        ac.sendKeys(Keys.TAB).perform();
        ac.sendKeys("abc123").perform();
        String dri = driver.getWindowHandle();
        System.out.println(dri);

        System.out.println("current window "+ driver.getWindowHandle());


    }
}
