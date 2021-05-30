package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import resources.ApiResources;
import resources.TestDataBuild;
import resources.Utils;

import static io.restassured.RestAssured.given;

public class PlaceValidationStepDefinition extends Utils {
    RequestSpecification requestSpecification;
    ResponseSpecification respSpec;
    Response response;
    TestDataBuild testDataBuild = new TestDataBuild();
    static String place_id;

    @Given("^Add Place Plyload with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void add_Place_Plyload_with(String name, String langauge, String address) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Add Place Plyload");
        requestSpecification = given().spec(utilsRequestSpecification())
                .body(testDataBuild.addPlacePayload(name, langauge, address));
    }

    @When("^user calls \"([^\"]*)\" with \"([^\"]*)\" http request$")
    public void userCallsWithHttpRequest(String resource, String method) throws Throwable {
        ApiResources resourceAPI=ApiResources.valueOf(resource);
        System.out.println(resourceAPI.getResource());
        respSpec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
        if (method.equalsIgnoreCase("POST"))
            response = requestSpecification.when().post(ApiResources.valueOf(resource).getResource());
        else if (method.equalsIgnoreCase("GET")) {
            response = requestSpecification.when().get(ApiResources.valueOf(resource).getResource());
        }

    }

    @Then("^the API call got success with status code (\\d+)$")
    public void the_API_call_got_success_with_status_code(int statusCode) throws Throwable {
        System.out.println("the API call got success with status code 200");
        Assert.assertEquals(response.getStatusCode(), statusCode, "Status code is not :" + statusCode);
    }

    @Then("^the \"([^\"]*)\" in response body is \"([^\"]*)\"$")
    public void the_in_response_body_is(String keyValue, String expectedValue) throws Throwable {
        System.out.println("the status in response body is OK");
        getJsonPath(response, keyValue);
        Assert.assertEquals(getJsonPath(response, keyValue), expectedValue);

    }

    @And("^verify place_id created maps to \"([^\"]*)\" using \"([^\"]*)\"$")
    public void verifyPlace_idCreatedMapsToUsing(String expectedName, String resource) throws Throwable {
        place_id = getJsonPath(response, "place_id");
        requestSpecification = given().spec(utilsRequestSpecification()).queryParams("place_id", place_id);
        userCallsWithHttpRequest(resource, "GET");
        Assert.assertEquals(getJsonPath(response, "name"), expectedName, "Name Mismatch");


    }

    @Given("^DeletePlace Payload$")
    public void deleteplace_Payload() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        requestSpecification=given().spec(utilsRequestSpecification()).body(testDataBuild.deletePlacePayload(place_id));
    }
}
