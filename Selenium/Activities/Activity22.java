package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity22 {

    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/popups");

        System.out.println("Title of the landing page is : " + driver.getTitle());

        WebElement signInBtn = driver.findElement(By.className("orange"));



        Actions builder = new Actions(driver);

        builder.moveToElement(signInBtn).build().perform();
        String toolTip = signInBtn.getAttribute("data-tooltip");
        System.out.println("The text on the tooltip is : " + toolTip);
        signInBtn.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));
        username.sendKeys("admin");
        password.sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);
        driver.quit();
    }
    }
