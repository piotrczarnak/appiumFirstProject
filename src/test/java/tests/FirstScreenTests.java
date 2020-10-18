package tests;

import io.appium.java_client.android.AndroidDriver;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.remote.DesiredCapabilities;
import screensMethods.BaseClass;

import java.net.MalformedURLException;
import java.net.URL;

@RunWith(JUnit4.class)
public class FirstScreenTests {

    AndroidDriver driver;
    BaseClass baseClass;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("VERSION", "8");
        capabilities.setCapability("deviceName","Emulator");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appPackage", "dev.test.myapplication");
        capabilities.setCapability("appActivity" , ".MainActivity");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        baseClass = new BaseClass(driver);
    }

    @Test
    public void firstTest() {
        baseClass.startFirstScreen()
                .checkFirstText();
    }
}
