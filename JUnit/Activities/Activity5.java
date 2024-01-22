package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Activity5 {

    public static void main(String[] args){

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/input-events");

        System.out.println("The title of the page is : " + driver.getTitle());

        Actions action = new Actions(driver);
        action.click().pause(2000).build().perform();
        String sideText = driver.findElement(By.className("active")).getText();
        System.out.println("After left click, the test is : " + sideText);
        action .doubleClick().pause(2000).build().perform();
        sideText = driver.findElement(By.className("active")).getText();
        System.out.println("After double clicking, the text is : " + sideText);
        action.contextClick().pause(2000).build().perform();
        sideText = driver.findElement(By.className("active")).getText();
        System.out.println("After right click, the text is : " + sideText);

        driver.quit();

    }
}
