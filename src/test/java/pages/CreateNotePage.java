package pages;


import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static variables.GlobalVariables.*;

public class CreateNotePage {


    /*public CreateNotePage(AppiumDriver driver){
        super(driver);
    }*/

    /*public CreateNotePage(AppiumDriver driver) {
        super(driver);
    }*/

    WebElement createNoteIcon = appdriver.findElement(By.id("com.example.android.testing.notes.mock:id/fab_add_notes"));

    WebElement titleField = appdriver.findElement(By.id("com.example.android.testing.notes.mock:id/add_note_title"));

    WebElement fillBody = appdriver.findElement(By.id("com.example.android.testing.notes.mock:id/add_note_description"));

    WebElement saveNote = appdriver.findElement(By.id("com.example.android.testing.notes.mock:id/fab_add_notes"));


    public void createNote() {
        createNoteIcon.click();
    }

    public void addATitle(){
        titleField.sendKeys("Cheers");
    }

    public void addNoteBody(){
        fillBody.sendKeys("It's the start of a new week");
    }

    public void saveANote(){
        saveNote.click();
    }

}
