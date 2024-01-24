package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity20 {
    public static void main(String[] args){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/javascript-alerts");
        System.out.println("The title of the page is : " + driver.getTitle());

        driver.findElement(By.id("prompt")).click();

        Alert popUp = driver.switchTo().alert();
        System.out.println("The text displayed on the pop up is :" +popUp.getText());

        popUp.sendKeys("Awesome!");
        popUp.accept();
        driver.quit();
    }
}
