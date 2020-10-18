package screensMethods;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SecondScreen extends BaseClass {

    By secondTextId = By.id("textview_second");

    public SecondScreen(AndroidDriver driver) {
        super(driver);
    }

        public void checkSecondText() {
            if (methods.getText(secondTextId).contains("second")) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
}
