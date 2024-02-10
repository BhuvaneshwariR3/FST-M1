package projects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");

        driver.findElement(By.xpath("//a[text()='Contact']")).click();

        driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Test Name");
        driver.findElement(By.id("wpforms-8-field_1")).sendKeys("test@xyz.com");
        driver.findElement(By.id("wpforms-8-field_3")).sendKeys("Test email automation");
        driver.findElement(By.id("wpforms-8-field_2")).sendKeys("test comments");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        String confirmMsg = driver.findElement(By.xpath("//div[@id='wpforms-confirmation-8']/p")).getText();

        System.out.println("The form is submitted is successfully");
        System.out.println("The message displayed is : " + confirmMsg);

        driver.quit();
    }
}