$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("placeValidation.feature");
formatter.feature({
  "line": 1,
  "name": "Validating Place APIs",
  "description": "",
  "id": "validating-place-apis",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 24,
  "name": "Verify if Delete Place functionality is working",
  "description": "",
  "id": "validating-place-apis;verify-if-delete-place-functionality-is-working",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@AddPlace"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "DeletePlace Payload",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user calls \"goRestAPI\" with \"GET\" http request",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "the \"total\" in response body is \"21\"",
  "keyword": "And "
});
formatter.match({
  "location": "PlaceValidationStepDefinition.deleteplace_Payload()"
});
formatter.result({
  "duration": 767173261,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "goRestAPI",
      "offset": 12
    },
    {
      "val": "GET",
      "offset": 29
    }
  ],
  "location": "PlaceValidationStepDefinition.userCallsWithHttpRequest(String,String)"
});
formatter.result({
  "duration": 1713567883,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 42
    }
  ],
  "location": "PlaceValidationStepDefinition.the_API_call_got_success_with_status_code(int)"
});
formatter.result({
  "duration": 4216854,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "total",
      "offset": 5
    },
    {
      "val": "21",
      "offset": 33
    }
  ],
  "location": "PlaceValidationStepDefinition.the_in_response_body_is(String,String)"
});
formatter.result({
  "duration": 694368800,
  "error_message": "org.jsonschema2pojo.exception.GenerationException: Could not process JSON in source file\n\tat org.jsonschema2pojo.SchemaGenerator.schemaFromExample(SchemaGenerator.java:52)\n\tat org.jsonschema2pojo.SchemaMapper.readSchema(SchemaMapper.java:104)\n\tat org.jsonschema2pojo.SchemaMapper.generate(SchemaMapper.java:90)\n\tat resources.Utils.convert2JSON(Utils.java:100)\n\tat resources.Utils.convertJsonToPojo(Utils.java:79)\n\tat resources.Utils.getJsonPath(Utils.java:65)\n\tat stepDefinitions.PlaceValidationStepDefinition.the_in_response_body_is(PlaceValidationStepDefinition.java:57)\n\tat ✽.And the \"total\" in response body is \"21\"(placeValidation.feature:28)\nCaused by: java.io.FileNotFoundException: /Users/sonalpri/CucumberBDDNaveenAutomationLab/./input.json (No such file or directory)\n\tat java.io.FileInputStream.open0(Native Method)\n\tat java.io.FileInputStream.open(FileInputStream.java:195)\n\tat java.io.FileInputStream.\u003cinit\u003e(FileInputStream.java:138)\n\tat java.io.FileInputStream.\u003cinit\u003e(FileInputStream.java:93)\n\tat com.fasterxml.jackson.core.JsonFactory._optimizedStreamFromURL(JsonFactory.java:1471)\n\tat com.fasterxml.jackson.core.JsonFactory.createParser(JsonFactory.java:780)\n\tat com.fasterxml.jackson.databind.ObjectMapper.readTree(ObjectMapper.java:2401)\n\tat org.jsonschema2pojo.SchemaGenerator.schemaFromExample(SchemaGenerator.java:49)\n\tat org.jsonschema2pojo.SchemaMapper.readSchema(SchemaMapper.java:104)\n\tat org.jsonschema2pojo.SchemaMapper.generate(SchemaMapper.java:90)\n\tat resources.Utils.convert2JSON(Utils.java:100)\n\tat resources.Utils.convertJsonToPojo(Utils.java:79)\n\tat resources.Utils.getJsonPath(Utils.java:65)\n\tat stepDefinitions.PlaceValidationStepDefinition.the_in_response_body_is(PlaceValidationStepDefinition.java:57)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:33)\n\tat com.intellij.rt.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:230)\n\tat com.intellij.rt.junit.JUnitStarter.main(JUnitStarter.java:58)\n",
  "status": "failed"
});
});