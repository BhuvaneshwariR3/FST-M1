package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");

        System.out.println("The Tile of the page is : " + driver.getTitle());

        WebElement removeCheckboxBtn = driver.findElement(By.id("toggleCheckbox"));

        removeCheckboxBtn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.invisibilityOfElementLocated( By.id("dynamicCheckbox")));
        if(removeCheckboxBtn.isDisplayed()) {
            removeCheckboxBtn.click();
        }
        wait.until(ExpectedConditions.visibilityOfElementLocated( By.id("dynamicCheckbox")));
        if(removeCheckboxBtn.isDisplayed()) {
            removeCheckboxBtn.click();
        }
        driver.quit();



    }
}
