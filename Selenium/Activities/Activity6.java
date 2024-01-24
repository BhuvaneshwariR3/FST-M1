package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6 {

    public static void main(String[] args){

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        System.out.println("The title of the page is : " + driver.getTitle());
        Actions action = new Actions(driver);
        action.sendKeys("B").build().perform();
        action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        String pressedKey = driver.findElement(By.id("keyPressed")).getText();
        System.out.println(pressedKey);

        driver.quit();
    }
}
