package projects;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity9 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");
        driver.findElement(By.xpath("//a[text()='My Account']")).click();

        String title = driver.getTitle();

        if(title.equals("My Account – Alchemy LMS")){
            System.out.println("The title of the page is My Account – Alchemy LMS");
        }else{
            System.out.println("The title does not match");
        }

        driver.findElement(By.xpath("//a[@href='#login']")).click();

        driver.findElement(By.id("user_login")).sendKeys("root");
        driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
        driver.findElement(By.id("wp-submit")).click();


        if(driver.findElement(By.xpath("(//span[text()='root'])[1]")).isDisplayed()){
            System.out.println("Logged in successfully");
        }else{
            System.out.println("Log in failed");
        }

        driver.findElement(By.xpath("//a[text()='All Courses']")).click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.xpath("//h3[text()='Social Media Marketing']/parent::div/preceding-sibling::a"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        /*WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Social Media Marketing']/parent::div/preceding-sibling::a")));
      */  driver.findElement(By.xpath("//h3[text()='Social Media Marketing']/parent::div/preceding-sibling::a")).click();

        driver.findElement(By.xpath("(//div[@class='ld-item-title'])[1]")).click();

        String title1 = driver.getTitle();

        if(title1.equals("Developing Strategy – Alchemy LMS")){
            System.out.println("The title of the page is Developing Strategy – Alchemy LMS");
        }else{
            System.out.println("The title does not match");
        }

    }
}