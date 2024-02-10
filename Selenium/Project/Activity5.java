package projects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
    public static void main(String[] args){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");

        driver.findElement(By.xpath("//a[text()='My Account']")).click();

        String title = driver.getTitle();

        if(title.equals("My Account – Alchemy LMS")){
            System.out.println("The title of the page is My Account – Alchemy LMS");
            driver.quit();
        }else{
            System.out.println("The title does not match");
        }

    }
}
