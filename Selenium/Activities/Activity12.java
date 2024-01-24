package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity12 {

    public static void main(String[] args){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("The title of the page is : " + driver.getTitle());

        WebElement txtBox = driver.findElement(By.id("dynamicText"));

        if(txtBox.isEnabled()){
            System.out.println("The text box is enabled");
        }else{
            System.out.println("The text box is not enabled");
            driver.findElement(By.id("toggleInput")).click();
            System.out.println("The text box is enabled");
        }

        driver.quit();
    }
}
