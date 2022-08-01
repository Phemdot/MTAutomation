package steps;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;

import java.net.MalformedURLException;

import static utils.AppUtility.getAndroidDriver;
import static variables.GlobalVariables.*;

public class CommonStep {


    @Given("I launch the note application")
    public void i_launch_the_note_application() throws MalformedURLException {
        /*try {
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", "Galaxy Grand Prime+");
            cap.setCapability("udid", "4200fdd94ef94453");
            cap.setCapability("platformName", "Android");
            cap.setCapability("platformVersion", "6.0.1");
            cap.setCapability("appPackage", "com.example.android.testing.notes.mock");
            cap.setCapability("appActivity", "com.example.android.testing.notes.notes.NotesActivity");

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver(url, cap);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


           // AppiumDriver driver = AppUtility.getAndroidDriver();

            System.out.println("Application is Starting Up");
        }catch(Exception e){
            e.printStackTrace();

        }*/
        appdriver = getAndroidDriver();


    }
}
