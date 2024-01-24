package activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {

    public static void main(String[] args){

        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");

        WebDriverManager.firefoxdriver().setup();

        WebDriver driver = new FirefoxDriver();

        driver.get("https://v1.training-support.net/selenium/target-practice");

        System.out.println("The title of the page is : " + driver.getTitle());

        WebElement thirdHeader = driver.findElement(By.xpath("//h3[text()='Third header']"));

        System.out.println("The 3rd header text is : " + thirdHeader.getText());

        WebElement fifthHeader = driver.findElement(By.xpath("//h5[text()='Fifth header']"));

        System.out.println("The 5th header text is : " + fifthHeader.getText());

        String violetClassValue = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");

        System.out.println("The class attribute value of Violet is : " + violetClassValue);

        String greyText = driver.findElement(By.xpath("//button[text()='Grey']")).getText();

        System.out.println("The text of Violet is : " + greyText);

        driver.quit();


    }
}
