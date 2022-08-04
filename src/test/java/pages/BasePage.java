package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static variables.GlobalVariables.*;

public class BasePage {
    protected AppiumDriver driver;
    //protected AppiumDriver appdriver;

    public BasePage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void click(WebElement elem) {
        elem.click();
    }

    public WebElement getElement(By by) {
        return driver.findElement(by);
    }

    public List<WebElement> getElements(By by) {
        return driver.findElements(by);
    }

    public String getText(WebElement elem) {
        return elem.getText();
    }

    public void type(WebElement elem, String text) {
        elem.sendKeys(text);
    }
}
