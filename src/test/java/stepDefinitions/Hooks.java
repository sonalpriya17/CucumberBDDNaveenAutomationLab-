package stepDefinitions;

import cucumber.runtime.java.StepDefAnnotation;
import org.junit.Before;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Hooks {

    @BeforeMethod(dependsOnGroups = "@DeletePlace")
    public void beforeScenario() throws Throwable {
        System.out.println("I am Before Hook");

        PlaceValidationStepDefinition stepDefinition = new PlaceValidationStepDefinition();
        stepDefinition.add_Place_Plyload_with("Arsh","hindi","Plaza Chowk");
        stepDefinition.userCallsWithHttpRequest("addPlaceAPI","GET");
        stepDefinition.verifyPlace_idCreatedMapsToUsing("Arsh","getPlaceAPI");
    }
}
