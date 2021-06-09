package resources;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;

public class SchemaValidator {
    String url = "http://www.postalpincode.in/api/pincode/560102";
    @Test
    public void validateJsonSchema(){
        ValidatableResponse res = get(url).then().assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("inputSchema.json"));
        res.toString();
        assertThat(res.toString(),matchesJsonSchemaInClasspath("inputSchema.json"));


    }

}
