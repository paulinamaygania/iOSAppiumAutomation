package mainPackage.pages;

import io.appium.java_client.MobileElement;
import mainPackage.BaseTest;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ExercisePage extends BaseTest {

    @iOSXCUITFindBy(id = "Start")
    private MobileElement btnStart;
    @iOSXCUITFindBy(id = "Allow Once")
    private MobileElement btnAllowOnce;
    @iOSXCUITFindBy(id = "Finish")
    private MobileElement btnFinish;
    @iOSXCUITFindBy(id = "Done")
    private MobileElement btnDone;


    public ExercisePage clickStart(){
        click(btnStart);
        return this;
    }

    public ExercisePage clickAllowOnceLoc(){
        click(btnAllowOnce);
        return this;
    }

    public ExercisePage clickFinish(){
        click(btnFinish);
        return this;
    }

    public ExercisePage clickDone(){
        click(btnDone);
        return this;
    }



}
