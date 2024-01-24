package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Activity21 {

    public static void main(String[] args){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/tab-opener");

        System.out.println("Title of the landing page is : " + driver.getTitle());

        driver.findElement(By.id("launcher")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.numberOfWindowsToBe(2));

        Set<String> numOfWindows1 = driver.getWindowHandles();

        for(String handle : numOfWindows1){
            driver.switchTo().window(handle);
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'New Tab')]")));
        System.out.println("Title of the New tab displayed is : " + driver.getTitle());

        driver.findElement(By.id("actionButton")).click();

        wait.until(ExpectedConditions.numberOfWindowsToBe(3));

        Set<String> numOfWindows2 = driver.getWindowHandles();

        for(String handle : numOfWindows2){
            driver.switchTo().window(handle);
        }

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("content")));

        System.out.println("Title of the 3rd tab displayed is : " + driver.getTitle());

        driver.quit();


    }
}
