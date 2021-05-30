package resources;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.io.*;
import java.util.Properties;

public class Utils {
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
