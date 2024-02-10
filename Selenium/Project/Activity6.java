package projects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
    public static void main(String[] args){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
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
            driver.quit();
        }else{
            System.out.println("Log in failed");
        }



    }
}
