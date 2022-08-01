package steps;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CreateNoteStep {
    AppiumDriver driver = null;

    @Given("I launch the note application")
    public void i_launch_the_note_application() throws MalformedURLException {
        // Write code here that turns the phrase above into concrete actions
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Galaxy Grand Prime+");
        cap.setCapability("udid", "4200fdd94ef94453");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "6.0.1");
        cap.setCapability("appPackage", "com.example.android.testing.notes.mock");
        cap.setCapability("appActivity", "com.example.android.testing.notes.notes.NotesActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver(url,cap);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        System.out.println("Application is Starting Up");


    }
    @When("I tap on create note")
    public void i_tap_on_create_note() {
        // Write code here that turns the phrase above into concrete actions
        WebElement createNote = driver.findElement(By.id("com.example.android.testing.notes.mock:id/fab_add_notes"));
        createNote.click();
    }
    @When("I fill the title")
    public void i_fill_the_title() {
        // Write code here that turns the phrase above into concrete actions
        //System.out.println("Test is getting started3");
        WebElement fillTitle = driver.findElement(By.id("com.example.android.testing.notes.mock:id/add_note_title"));
        fillTitle.sendKeys("My Head");
    }
    @When("I fill the body with text")
    public void i_fill_the_body_with_text() {
        // Write code here that turns the phrase above into concrete actions
        //System.out.println("Test is getting started3");
        WebElement fillBody = driver.findElement(By.id("com.example.android.testing.notes.mock:id/add_note_description"));
        fillBody.sendKeys("Is finally up");
    }
    @When("I tap on save note")
    public void i_tap_on_save_note() {
        // Write code here that turns the phrase above into concrete actions
        //System.out.println("Test is getting started4");
        WebElement saveNote = driver.findElement(By.id("com.example.android.testing.notes.mock:id/fab_add_notes"));
        saveNote.click();
    }
    @Then("the information should be stored")
    public void the_information_should_be_stored() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test is getting started4");
    }
}
