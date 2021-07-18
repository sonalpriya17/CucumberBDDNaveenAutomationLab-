package resources;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.sun.codemodel.JCodeModel;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.jsonschema2pojo.*;
import org.jsonschema2pojo.rules.RuleFactory;
import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.RuleFactory;

import java.io.*;
import java.net.URL;
import java.util.Properties;

public class Utils {
    //new push from my lappy
    public static RequestSpecification reqSpec;

    public RequestSpecification utilsRequestSpecification() throws IOException {
        if(reqSpec==null) {
            PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
            reqSpec = new RequestSpecBuilder().setBaseUri(getGlobalValues("baseUrl"))
                    .addQueryParam("key", "qaclick123")
                    .addFilter(RequestLoggingFilter.logRequestTo(log))
                    .addFilter(ResponseLoggingFilter.logResponseTo(log))
                    .setContentType(ContentType.JSON).build();
            return reqSpec;
        }
        return reqSpec;
    }

    public String getGlobalValues(String key) throws IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("/Users/sonalpri/CucumberBDDNaveenAutomationLab/src/test/java/resources/global.properties");
        properties.load(fis);
        return properties.getProperty(key);

    }
    public String getJsonPath(Response response, String key){
        JsonPath js = new JsonPath(response.asString());
        return js.get(key).toString();

    }






}
