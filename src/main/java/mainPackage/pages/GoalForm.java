package mainPackage.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import mainPackage.BaseTest;

public class GoalForm extends BaseTest {

    @iOSXCUITFindBy(id = "Date Picker")
    private MobileElement dtpDOB;
    @iOSXCUITFindBy(id = "Monday, January 12")
    private MobileElement txaDate;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name=\"Date of Birth, Date Picker, Jan 12, 1970\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private MobileElement vwOutsideDate;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name=\"Goal, minutes/week\"]/XCUIElementTypeOther[2]")
    private MobileElement tfGoal;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name=\"Selected Days\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private MobileElement btnSelectedDays;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name=\"Thursday\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private MobileElement txaThursday;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name=\"Friday\"]/XCUIElementTypeOther[2]/XCUIElementTypeOther")
    private MobileElement txaFriday;
    @iOSXCUITFindBy(id = "Back")
    private MobileElement btnBack;
    @iOSXCUITFindBy(id = "Save")
    private MobileElement btnSave;
    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Selected Days Thu, Fri\"]")
    private MobileElement txaSelectedDays;
    @iOSXCUITFindBy(id = "//XCUIElementTypeSwitch[@name=\"Reminder\"]")
    private MobileElement togReminder;

    WebDriverWait wait = new WebDriverWait(appium, 60);

    public GoalForm inputDateOfBirth(){
        click(dtpDOB);
        click(txaDate);
        vwOutsideDate.click();
        return this;
    }

    public GoalForm inputGoal(String goal){
        tfGoal.click();
        tfGoal.sendKeys(goal);
        return this;
    }

    public GoalForm chooseDays(){
        click(btnSelectedDays);
        click(txaThursday);
        click(txaFriday);
        click(btnBack);
        return this;
    }

    public GoalForm switchReminder(){
        click(togReminder);
        return this;
    }

    public GoalForm saveGoal(){
        click(btnSave);
        return this;
    }
}
