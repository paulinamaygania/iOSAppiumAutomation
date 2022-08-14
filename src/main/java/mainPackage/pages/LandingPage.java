package mainPackage.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import mainPackage.BaseTest;

public class LandingPage extends BaseTest {

    @iOSXCUITFindBy(id = "Allow")
    private MobileElement btnAllow;
    @iOSXCUITFindBy(id = "Goal")
    private MobileElement btnGoal;
    @iOSXCUITFindBy(id = "Start Exercise")
    private MobileElement btnStartExercise;
    @iOSXCUITFindBy(id = "chevron.right")
    private MobileElement btnDetailExercise;

    public LandingPage clickAllow(){
        click(btnAllow);
        return this;
    }

    public LandingPage clickGoal(){
        click(btnGoal);
        return this;
    }

    public LandingPage clickStartExercise(){
        click(btnStartExercise);
        return this;
    }

    public boolean assertNewExercise(){
        btnDetailExercise.isDisplayed();
        return true;
    }

}
