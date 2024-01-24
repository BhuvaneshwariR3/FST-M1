package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity11 {

    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println("The title of the page is : " + driver.getTitle());

        WebElement chkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));

        if(chkBox.isSelected()){
            System.out.println("Checkbox is selected");
        }else{
            System.out.println("Checkbox is not selected");
            chkBox.click();
            System.out.println("Checkbox is selected");
        }

        driver.quit();
    }
}
