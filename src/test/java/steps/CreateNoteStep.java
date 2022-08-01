package steps;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static variables.GlobalVariables.*;
import static pages.CreateNotePage.*;
import java.util.concurrent.TimeUnit;

public class CreateNoteStep {

    //public static AppiumDriver driver;

    //CreateNotePage createNotePage = new CreateNotePage();

    /*public void CreateNoteStep(){

    }*/



    @When("I tap on create note")
    public void i_tap_on_create_note() {
        // Write code here that turns the phrase above into concrete actions
        WebElement createNote = appdriver.findElement(By.id("com.example.android.testing.notes.mock:id/fab_add_notes"));
        createNote.click();
        //createNotePage.createNote();






    }
    @When("I fill the title")
    public void i_fill_the_title() {
        // Write code here that turns the phrase above into concrete actions
        //System.out.println("Test is getting started3");
        WebElement fillTitle = appdriver.findElement(By.id("com.example.android.testing.notes.mock:id/add_note_title"));
        fillTitle.sendKeys("My Head");
        //createNotePage.addATitle();
    }
    @When("I fill the body with text")
    public void i_fill_the_body_with_text() {
        // Write code here that turns the phrase above into concrete actions
        //System.out.println("Test is getting started3");
        WebElement fillBody = appdriver.findElement(By.id("com.example.android.testing.notes.mock:id/add_note_description"));
        fillBody.sendKeys("Is finally up");
        //createNotePage.addNoteBody();
    }
    @When("I tap on save note")
    public void i_tap_on_save_note() {
        // Write code here that turns the phrase above into concrete actions
        //System.out.println("Test is getting started4");
        WebElement saveNote = appdriver.findElement(By.id("com.example.android.testing.notes.mock:id/fab_add_notes"));
        saveNote.click();
        //createNotePage.saveANote();
    }
    @Then("the information should be stored")
    public void the_information_should_be_stored() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Test is closing");
        appdriver.quit();
    }
}
