package testPackage;

import mainPackage.BaseTest;
import mainPackage.pages.ExercisePage;
import mainPackage.pages.LandingPage;
import org.junit.Test;

public class CreateExerciseTests extends BaseTest {

    LandingPage landingPage = new LandingPage();
    ExercisePage exercisePage = new ExercisePage();

    @Test
    public void createExercise() throws InterruptedException {
        landingPage.clickAllow();
        landingPage.clickStartExercise();
        exercisePage.clickStart();
        exercisePage.clickAllowOnceLoc();
        Thread.sleep(3000);
        exercisePage.clickFinish();
        exercisePage.clickDone();
        landingPage.assertNewExercise();
    }

}

