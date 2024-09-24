package example.StepDefs;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {



    //Declaring WebDriver object on all levels of project
    public static AppiumDriver driver;

    @BeforeTest
    public void SetUp() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("autoGrantPermissions", "true");
        caps.setCapability(MobileCapabilityType.UDID,"0H73906I241020D1");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        caps.setCapability("avdLaunchTimeout",180800);

        String appURL = System.getProperty("user.dir") + File.separator+"apps/base.apk";

        caps.setCapability(MobileCapabilityType.APP,appURL);

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"),caps);

//        driver.grantPermissions("com.your.app.package", Manifest.permission.ACCESS_FINE_LOCATION);




        try {
            Alert alert = driver.switchTo().alert();
            alert.dismiss();// Clicks "Cancel" or dismisses the alert
            System.out.println("Alert dismissed successfully!");
        } catch (NoAlertPresentException e) { // Alert wasn't present, continue test execution
            System.out.println("No alert present. Continuing..."); }


    }




    @AfterTest
    public void tearDown() throws InterruptedException {
        if (driver!=null){
            Thread.sleep(3000);
            driver.quit();
        }
    }


}
