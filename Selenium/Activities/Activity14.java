package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity14 {

    public static  void main(String[] args){

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/tables");
        System.out.println("The title of the page is : " + driver.getTitle());


        List<WebElement> col = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));

        System.out.println("The column size is : " + col.size());

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));

        System.out.println("The row size is : "  + rows.size());

        WebElement cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
        System.out.println("Second row and Second column value is : " + cellValue.getText());

        driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr[1]/th[1]")).click();

        System.out.println("Second row and Second column value is : " + cellValue.getText());

        List<WebElement> footerValue = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr[1]/th"));
        System.out.println("The footer values are : ");
        for(WebElement footer : footerValue){
            System.out.println(footer.getText());
        }


    }
}
