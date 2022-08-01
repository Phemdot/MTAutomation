package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppUtility {
    public static AppiumDriver driver;


    private static String appPackage = ConfigFileReader.getConfigPropertyVal("appPackage");
    private static String appActivity = ConfigFileReader.getConfigPropertyVal("appActivity");
    private static String deviceName = ConfigFileReader.getConfigPropertyVal("deviceName");
    private static String udid = ConfigFileReader.getConfigPropertyVal("udid");
    public static AppiumDriver getAndroidDriver(){


        try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", deviceName);
            cap.setCapability("udid", udid);
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "6.0.1");
            cap.setCapability("appPackage", appPackage);
            cap.setCapability("appActivity", appActivity);

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver(url, cap);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            System.out.println("Application is Spinning Up");
        }catch(Exception e){
            e.printStackTrace();
        }

        return driver;
    }

}
