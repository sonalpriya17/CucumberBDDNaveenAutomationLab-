package resources;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import java.io.File;
import java.io.IOException;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;

public class SampleStringResponse {
    String fileName = "input.json";
    String filePath = "/Users/sonalpri/CucumberBDDNaveenAutomationLab/src/test/java/input.json";
    String schemaPath = "/Users/sonalpri/CucumberBDDNaveenAutomationLab/target/classes/inputSchema.json";

    public String sampleResponseWithoutArray() throws IOException {
        String expectedJson = FileUtils.readFileToString(new File(filePath));
        System.out.println(expectedJson);
     return expectedJson;

    }
   @Test
    public void validateJsonSchema() throws IOException {
        String jsonToBeValidated = sampleResponseWithoutArray();
        //matchesJsonSchema(jsonToBeValidated);
        assertThat(jsonToBeValidated,matchesJsonSchemaInClasspath("./target/classes/inputSchema.json"));

    }

}
