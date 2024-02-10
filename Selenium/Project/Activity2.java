package projects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");

        String heading = driver.findElement(By.tagName("h1")).getText();

        if(heading.equals("Learn from Industry Experts")){
            System.out.println("The heading of the page is Learn from Industry Experts ");
            driver.quit();
        }else{
            System.out.println("The heading does not match");
        }




    }
}
