package steps;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;

import java.net.MalformedURLException;
import static utils.AppUtility.driver;
import static utils.AppUtility.getAndroidDriver;
import static variables.GlobalVariables.*;

public class CommonStep {
    //public static AppiumDriver driver;

    @Given("I launch the note application")
    public void i_launch_the_note_application() throws MalformedURLException {

        appdriver = getAndroidDriver();


    }
}
