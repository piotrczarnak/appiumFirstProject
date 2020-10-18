package screensMethods;

import commons.Methods;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass {

    AndroidDriver driver;
    Methods methods;

    public BaseClass(AndroidDriver driver) {
        this.driver = driver;
        methods = new Methods(driver);
    }

    public FirstScreen startFirstScreen() {
        return new FirstScreen(driver);
    }

}
