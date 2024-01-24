package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity16 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println("The title of the page is : " + driver.getTitle());

        WebElement username = driver.findElement(By.xpath("//input[contains(@class, '-username')]"));
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, '-password')]"));
        WebElement confirmPassword = driver.findElement(By.xpath("//label[text()='Confirm Password']/following-sibling::input"));
        WebElement email = driver.findElement(By.xpath("//input[contains(@class, 'email-')]"));
        WebElement loginbtn = driver.findElement(By.xpath("//button[text()='Sign Up']"));

        username.sendKeys("admin");
        password.sendKeys("password");
        confirmPassword.sendKeys("password");
        email.sendKeys("test@xyz.com");
        loginbtn.click();

        String confirmationMsg = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("The message displayed is :" + confirmationMsg);

        driver.quit();
    }
}
