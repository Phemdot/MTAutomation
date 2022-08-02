package pages;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import static variables.GlobalVariables.*;

public class CreateNotePage {

    AppiumDriver driver;

    public CreateNotePage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    WebElement createNoteIcon = driver.findElement(By.id("com.example.android.testing.notes.mock:id/fab_add_notes"));

    WebElement titleField = driver.findElement(By.id("com.example.android.testing.notes.mock:id/add_note_title"));

    WebElement fillBody = driver.findElement(By.id("com.example.android.testing.notes.mock:id/add_note_description"));

    WebElement saveNote = driver.findElement(By.id("com.example.android.testing.notes.mock:id/fab_add_notes"));


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
