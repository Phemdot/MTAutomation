package steps;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import noteapi.CreateNoteData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import pages.CreateNotePage;
import static utils.AppUtility.getAndroidDriver;
import static variables.GlobalVariables.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CreateNoteStep {

   // private AppiumDriver driver;

    //CreateNotePage createNotePage;




    @When("I tap on create note")
    public void i_tap_on_create_note() {
        WebElement createNote = appdriver.findElement(By.id("com.example.android.testing.notes.mock:id/fab_add_notes"));
        createNote.click();
        //createNotePage.createNote();
    }


    @When("I fill the title")
    public void i_fill_the_title() {
        WebElement fillTitle = appdriver.findElement(By.id("com.example.android.testing.notes.mock:id/add_note_title"));
        fillTitle.sendKeys("Mr Jack Benjamin");
        //createNotePage.addATitle();
    }


    @When("I fill the body with text")
    public void i_fill_the_body_with_text() {
        WebElement fillBody = appdriver.findElement(By.id("com.example.android.testing.notes.mock:id/add_note_description"));
        fillBody.sendKeys("2011-01-28T13:30:26.247+06:30[Indian/Cocos]");
        //createNotePage.addNoteBody();
    }


    @When("I tap on save note")
    public void i_tap_on_save_note() {
        WebElement saveNote = appdriver.findElement(By.id("com.example.android.testing.notes.mock:id/fab_add_notes"));
        saveNote.click();
        //createNotePage.saveANote();
    }


    @Then("the information should be stored")
    public void the_information_should_be_stored() {
        WebElement getTitle = appdriver.findElement(By.id("com.example.android.testing.notes.mock:id/note_detail_title"));
        Assert.assertEquals(getTitle.getText(),"Mr Jack Benjamin");
        appdriver.quit();
    }

    @When("I add an image to the note")
    public void i_add_an_image_to_the_note() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("the information should be stored with the photo")
    public void the_information_should_be_stored_with_the_photo() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the note should be saved with title only")
    public void the_note_should_be_saved_with_title_only() {
        WebElement getTitle = appdriver.findElement(By.id("com.example.android.testing.notes.mock:id/note_detail_title"));
        Assert.assertEquals(getTitle.getText(),"Mr Jack Benjamin");
    }

    @Then("the note should be save with body only")
    public void the_note_should_be_save_with_body_only() {
        WebElement getNoteBody = appdriver.findElement(By.id("com.example.android.testing.notes.mock:id/note_detail_title"));
        Assert.assertEquals(getNoteBody.getText(),"2011-01-28T13:30:26.247+06:30[Indian/Cocos]");
    }

    @Then("the note should not be saved")
    public void the_note_should_not_be_saved() {
        WebElement fillTitle = appdriver.findElement(By.id("com.example.android.testing.notes.mock:id/add_note_title"));
        Assert.assertTrue(fillTitle.isEnabled());
    }






}
