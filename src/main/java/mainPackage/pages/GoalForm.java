package java.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.BaseTest;

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

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeCell[@name=\"Selected Days Thu, Fri\"]")
    private MobileElement txaSelectedDays;

    @iOSXCUITFindBy(id = "//XCUIElementTypeSwitch[@name=\"Reminder\"]")
    private MobileElement togReminder;

    WebDriverWait wait = new WebDriverWait(appium, 60);

    public GoalForm inputDateOfBirth(){
        dtpDOB.click();
        txaDate.click();
        vwOutsideDate.click();
        return this;
    }

    public GoalForm inputGoal(String goal){
        tfGoal.click();
        tfGoal.sendKeys(goal);
        return this;
    }

    public GoalForm chooseDays(){
        btnSelectedDays.click();
        txaThursday.click();
        txaFriday.click();
        return this;
    }

    public GoalForm assertSelectedDays(){
        btnBack.click();
        wait.until(ExpectedConditions.visibilityOf(txaSelectedDays));
        txaSelectedDays.isDisplayed();
        return this;
    }

    public GoalForm switchReminder(){
        togReminder.click();
        return this;
    }

    public GoalForm saveGoal(){
        btnSave.click();
        return this;
    }
}
