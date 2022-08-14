package java;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    public static AppiumDriver<MobileElement> appium = null;

    //BaseDriver() throws MalformedURLException {
    static {
        DesiredCapabilities capab = new DesiredCapabilities();
        capab.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        capab.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capab.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
        capab.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.1");
        capab.setCapability(MobileCapabilityType.APP, System.getProperty("user.home") + "/Library/Developer/Xcode/DerivedData/iHeartU-azpqmzkvnuqqzcbjwbkqwkdosuxp/Build/Products/Debug-iphonesimulator/iHeartU.app");

        try{
            appium = new IOSDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capab);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
        appium.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
    }

//    @AfterClass
//    public void driverQuit(){
//        appium.quit();
//    }

}
