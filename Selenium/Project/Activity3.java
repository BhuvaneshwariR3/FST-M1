package projects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {

    public static void main(String[] args){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");

        String firstInfoBoxTitle = driver.findElement(By.xpath("(//h3)[1]")).getText();

        if(firstInfoBoxTitle.equals("Actionable Training")){
            System.out.println("The title of the first Info Box is Actionable Training");
            driver.quit();
        }else{
            System.out.println("The title of the first Info Box does not match");
        }

    }
}
