package java.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import java.BaseTest;

public class LandingPage extends BaseTest {

    @iOSXCUITFindBy(id = "Allow")
    private MobileElement btnAllow;

    @iOSXCUITFindBy(id = "Goal")
    private MobileElement btnGoal;

    public LandingPage clickAllow(){
        btnAllow.click();
        return this;
    }

    public LandingPage clickGoal(){
        btnGoal.click();
        return this;
    }

}
