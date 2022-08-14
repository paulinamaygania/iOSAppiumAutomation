package testPackage;

import org.junit.Test;
import mainPackage.BaseTest;
import mainPackage.pages.GoalForm;
import mainPackage.pages.LandingPage;

public class GoalFormTests extends BaseTest {

    GoalForm goalForm = new GoalForm();
    LandingPage landingPage = new LandingPage();

    @Test
    public void inputGoalForm(){
        landingPage.clickAllow();
        landingPage.clickGoal();
        goalForm.inputDateOfBirth();
        goalForm.inputGoal("15");
        goalForm.chooseDays();
        goalForm.saveGoal();
    }

}
