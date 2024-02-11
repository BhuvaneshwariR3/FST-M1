package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.time.Duration;

public class Activity1 {
    // Driver Declaration
    AndroidDriver driver;
    WebDriverWait wait;

    // Set up method
    @BeforeClass
    public void setUp() throws MalformedURLException, URISyntaxException {
        // Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UIAutomator2");
        options.setAppPackage("com.miui.calculator");
        options.setAppActivity(".cal.CalculatorActivity");
        options.noReset();

        // Server Address
     //   URL serverURL = new URL("http://localhost:4723/wd/hub");
        var serverURL=new URI("http://localhost:4723/wd/hub"). toURL() ;
        // Driver Initialization
        driver = new AndroidDriver(serverURL, options);
       wait =new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    // Test method
    @Test
    public void addTest() {
        // Perform the calculation
        wait.until(ExpectedConditions.presenceOfElementLocated(AppiumBy.id("com.miui.calculator:id/btn_8_s")));
        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_8_s")).click();
        driver.findElement(AppiumBy.accessibilityId("plus")).click();
        driver.findElement(AppiumBy.id("btn_4_s")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();

        // Find the result
        String result = driver.findElement(AppiumBy.id("com.miui.calculator:id/result")).getText();

        // Assertion
        Assert.assertEquals(result, "= 12");
    }


    // Tear down method
    @AfterClass
    public void tearDown() {
        // Close the app
        driver.quit();
    }
}