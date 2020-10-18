package commons;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Methods {

    AndroidDriver driver;

    public Methods(AndroidDriver driver) {
        this.driver = driver;
    }

    public void click (By id) {
        driver.findElement(id).click();
    }

    public String getText(By id) {
       return driver.findElement(id).getText();
    }
}
