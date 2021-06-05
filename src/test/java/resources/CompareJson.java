package resources;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.flipkart.zjsonpatch.JsonDiff;
import com.google.common.collect.Maps;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.mongodb.util.JSON;
import io.restassured.internal.path.json.JSONAssertion;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import pojo.PatchJson;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Paths;
import java.util.Map;


public class CompareJson {
    @Test
    public void testDiffBetweenTwoJson() throws IOException, JSONException {
        jsonCompare();
    }
    public void jsonCompare() throws IOException, JSONException {
        String inputPath= "/Users/sonalpri/CucumberBDDNaveenAutomationLab/src/test/java/input.json";
        String outputPath = "/Users/sonalpri/CucumberBDDNaveenAutomationLab/src/test/java/output.json";
        String expectedJson = FileUtils.readFileToString(new File("/Users/sonalpri/CucumberBDDNaveenAutomationLab/src/test/java/input.json"));
        String actualJson = FileUtils.readFileToString(new File("/Users/sonalpri/CucumberBDDNaveenAutomationLab/src/test/java/output.json"));
        ObjectMapper mapper = new ObjectMapper();

     //JSONAssert.assertEquals(expectedJson, actualJson, JSONCompareMode.STRICT);

        JsonNode inputNode = mapper.readTree(Paths.get(inputPath).toFile());
        JsonNode outputNode = mapper.readTree(Paths.get(outputPath).toFile());

        JsonNode patch = JsonDiff.asJson(inputNode, outputNode);
        System.out.println("Name: "+inputNode.path("name").asText());
        String diff = patch.toString();
        patch.get(1);
        Object parsed = JSON.parse(diff);
        System.out.println("diff : "+diff);
        System.out.println("parsed Json : "+ parsed.toString());
        PatchJson[] patchJson = mapper.readValue(diff,PatchJson[].class);
        String value = patchJson.toString();
        System.out.println("PatchJson POJO Value :"+ patchJson.length);


     /*   JsonNode patch = JsonDiff.asJson(beforeNode, afterNode);
        String diffs = patch.toString();
        System.out.println("diff : "+diffs);*/
/*
        Gson g = new Gson();
        Type mapType = new TypeToken<Map<String, Object>>(){}.getType();
        Map<String, Object> firstMap = g.fromJson(expectedJson, mapType);
        Map<String, Object> secondMap = g.fromJson(actualJson, mapType);
        System.out.println("Map Diff : "+Maps.difference(firstMap, secondMap));*/

    }
}
