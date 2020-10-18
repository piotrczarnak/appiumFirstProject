package screensMethods;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class FirstScreen extends BaseClass {

    By firstTextId = By.id("textview_first");
    AndroidDriver driver;

    public FirstScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void checkFirstText() {
        if (methods.getText(firstTextId).contains("First")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }



}
