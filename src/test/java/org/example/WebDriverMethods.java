package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class WebDriverMethods {
    public static void main(String[] args) throws InterruptedException, AWTException {
        //1.get
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        //2. getTitle
        System.out.println(driver.getTitle());
        //3. getsrc code
        String sourcecode = driver.getPageSource();
        System.out.println(sourcecode);
        //4. navigate
        driver.navigate().to("https://www.facebook.com/");
        //5. manage
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        WebElement username = driver.findElement(By.name("email"));
        Actions ac = new Actions(driver);
        ac.moveToElement(username).perform();

        ac.click(username).perform();
        ac.sendKeys("abc78@gmail.com").perform();

        ac.sendKeys(Keys.TAB).perform();
        ac.sendKeys("abc123").perform();
        //6.windowHandle
        String dri = driver.getWindowHandle();
        System.out.println(dri);

        System.out.println("current window "+ driver.getWindowHandle());
    }
}
