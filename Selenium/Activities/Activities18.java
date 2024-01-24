package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activities18 {
    public static void main(String[] args) {

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/selects");

        System.out.println("Title of the landing page is :" + driver.getTitle());

        WebElement multiSelect = driver.findElement(By.id("multi-select"));
        Select sel = new Select(multiSelect);
        sel.selectByVisibleText("Javascript");
        for(int i=4;i<=6;i++){
            sel.selectByIndex(i);
        }
        sel.selectByValue("node");
        sel.deselectByIndex(5);

        List<WebElement> selectedOptions = sel.getAllSelectedOptions();
        System.out.println("Selected options are :");
        for(WebElement ele : selectedOptions){
            System.out.println(ele.getText());
        }
        driver.quit();

    }
}
