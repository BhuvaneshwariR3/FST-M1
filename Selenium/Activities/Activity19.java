package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {
    public static void main(String[] args){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        System.out.println("The title of the page is : " + driver.getTitle());

        driver.findElement(By.id("confirm")).click();

        Alert confirmAlert = driver.switchTo().alert();

        String alertText = confirmAlert.getText();
        confirmAlert.accept();
        driver.quit();



    }
}
