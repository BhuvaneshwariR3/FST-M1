package projects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

    public static void main(String[] args){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");

        String secondInfoBoxTitle = driver.findElement(By.xpath("(//h3)[2]")).getText();

        if(secondInfoBoxTitle.equals("Interesting Quizzes")){
            System.out.println("The title of the second Info Box is Interesting Quizzes ");
            driver.quit();
        }else{
            System.out.println("The title of the second Info Box does not match");
        }

    }
}
