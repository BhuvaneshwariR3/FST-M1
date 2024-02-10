package projects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.ArrayList;
import java.util.List;

public class Activity7 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");

        driver.findElement(By.xpath("//a[text()='All Courses']")).click();

        List<WebElement> courses = driver.findElements(By.tagName("h3"));

        System.out.println("The number of courses displayed are : " + courses.size());
        System.out.println("The courses names are as below : ");
        for(WebElement topics : courses){
            System.out.println(topics.getText() + "\n");
        }

        driver.quit();
    }

}
