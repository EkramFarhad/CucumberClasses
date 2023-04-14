package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends CommonMethods {

    @Before
    public void preConditions() {
        openBrowserAndLaunchApplication();
    }

    @After
    public void postConditions() {
        closeBrowser();
    }
}
