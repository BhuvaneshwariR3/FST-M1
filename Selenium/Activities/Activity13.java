package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity13 {

    public static void main(String[] args){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/tables");
        System.out.println("The title of the page is : " + driver.getTitle());

        List<WebElement> col = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[1]/td"));

        System.out.println("The column size is : " + col.size());

        List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr"));

        System.out.println("The row size is : "  + rows.size());

        List<WebElement> thirdRow = driver.findElements(By.xpath("//table[contains(@class,'striped')]/tbody/tr[3]/td"));
        System.out.println("Third row cell values: ");
        for( WebElement val : thirdRow){
            System.out.println(val.getText());
        }

        WebElement cellValue = driver.findElement(By.xpath("//table[contains(@class,'striped')]/tbody/tr[2]/td[2]"));
        System.out.println("Second row and Second column value is : " + cellValue.getText());

        driver.quit();

    }
}
