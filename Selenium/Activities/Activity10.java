package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity10 {

    public static void main(String[] args){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("The title of the page is : " + driver.getTitle());
        Boolean checkbox = driver.findElement(By.name("toggled")).isDisplayed();
        if (checkbox){
            System.out.println("The checkbox is visible");
            driver.findElement(By.id("toggleCheckbox")).click();
            checkbox = driver.findElement(By.name("toggled")).isDisplayed();
            if(checkbox){
                System.out.println("The checkbox is visible");
            }else{
                System.out.println("The checkbox is not visible");
            }
        }

        driver.quit();
    }
}
