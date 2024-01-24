package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity17 {

    public static void main(String[] args){

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/selects");

        System.out.println("Title of the landing page is :" + driver.getTitle());

        WebElement dropdown = driver.findElement(By.id("single-select"));

        Select sel = new Select(dropdown);

        sel.selectByVisibleText("Option 2");

        System.out.println("The selected option using visible text is : " + sel.getFirstSelectedOption().getText());

        sel.selectByIndex(3);

        System.out.println("The selected option using Index is : " + sel.getFirstSelectedOption().getText());

        sel.selectByValue("4");
        System.out.println("The selected option using value is : " + sel.getFirstSelectedOption().getText());

        List<WebElement> allOptions = sel.getOptions();
        for(WebElement e : allOptions){
            System.out.println(e.getText());
        }

        driver.quit();





    }
}
