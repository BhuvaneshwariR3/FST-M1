package projects;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

    public static void main(String[] args){
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://alchemy.hguy.co/lms");

        String title = driver.getTitle();

        //Assert.isTrue(title.equals("Alchemy LMS – An LMS Application"));
        //assertEquals(title, "Alchemy LMS – An LMS Application");
        if(title.equals("Alchemy LMS – An LMS Application")){
            System.out.println("The title of the page is Alchemy LMS – An LMS Application");
            driver.quit();
        }else{
            System.out.println("The title does not match");
        }

    }
}
