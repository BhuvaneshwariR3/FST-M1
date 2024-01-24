package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {

    public static void main(String[] args){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/drag-drop");
        System.out.println("The title of the page is : " + driver.getTitle());

        WebElement ball = driver.findElement(By.id("draggable"));
        WebElement dropZone1 = driver.findElement(By.id("droppable"));
        WebElement dropZone2 = driver.findElement(By.id("dropzone2"));

        Actions action = new Actions(driver);
        action.clickAndHold(ball).moveToElement(dropZone1).build().perform();
        action.dragAndDrop(ball,dropZone2).build().perform();

        driver.quit();

    }
}
