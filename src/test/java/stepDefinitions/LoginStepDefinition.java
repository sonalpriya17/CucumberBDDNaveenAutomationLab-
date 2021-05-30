package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
    @Given("^User is on Home Page$")
    public void userIsOnHomePage() {
        System.out.println("userIsOnHomePage");

    }

    @When("^User Navigates to Login Page$")
    public void userNavigatesToLoginPage() {
        System.out.println("User Navigates to Login Page");

    }

    @And("^User enters Username and Password$")
    public void userEntersUsernameAndPassword() {
        System.out.println("User enters Username and Password");
    }

    @Then("^Message displayed Login Successfuly$")
    public void messageDisplayedLoginSuccessfuly() {
        System.out.println("Message displayed Login Successfuly");
    }
}
