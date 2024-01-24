package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args){

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/login-form");

        System.out.println("The title of the page is : " + driver.getTitle());

        WebElement usernameTxtBox = driver.findElement(By.id("username"));

        usernameTxtBox.sendKeys("admin");

        WebElement passwordTxtBox = driver.findElement(By.id("password"));

        passwordTxtBox.sendKeys("password");

        WebElement logInBtn = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));

        logInBtn.click();

        driver.close();
    }
}
