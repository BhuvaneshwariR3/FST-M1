package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {
    public static void main(String[] args){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/ajax");
        System.out.println("The title of the page is : " + driver.getTitle());

        driver.findElement(By.cssSelector("button.violet")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        String text = driver.findElement(By.tagName("h1")).getText();
        System.out.println(text);
        WebElement delayedText = driver.findElement(By.tagName("h3"));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.tagName("h3"), "I'm late"));
        String lateText = driver.findElement(By.tagName("h3")).getText();
        System.out.println(lateText);
        driver.quit();
    }
}
