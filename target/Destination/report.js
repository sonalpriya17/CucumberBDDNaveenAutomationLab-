$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("placeValidation.feature");
formatter.feature({
  "line": 1,
  "name": "Validating Place APIs",
  "description": "",
  "id": "validating-place-apis",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Verify if Place is being successfully added using AddPlaceAPI",
  "description": "",
  "id": "validating-place-apis;verify-if-place-is-being-successfully-added-using-addplaceapi",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@AddPlace"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Add Place Plyload with \"\u003cname\u003e\" \"\u003clangauge\u003e\" \"\u003caddress\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user calls \"addPlaceAPI\" with \"Post\" http request",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "the \"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the \"scope\" in response body is \"APP\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify place_id created maps to \"\u003cname\u003e\" using \"getPlaceAPI\"",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "validating-place-apis;verify-if-place-is-being-successfully-added-using-addplaceapi;",
  "rows": [
    {
      "cells": [
        "name",
        "langauge",
        "address"
      ],
      "line": 12,
      "id": "validating-place-apis;verify-if-place-is-being-successfully-added-using-addplaceapi;;1"
    },
    {
      "cells": [
        "AAHouse",
        "English",
        "WorldCrossCenter"
      ],
      "line": 13,
      "id": "validating-place-apis;verify-if-place-is-being-successfully-added-using-addplaceapi;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "Verify if Place is being successfully added using AddPlaceAPI",
  "description": "",
  "id": "validating-place-apis;verify-if-place-is-being-successfully-added-using-addplaceapi;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@AddPlace"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Add Place Plyload with \"AAHouse\" \"English\" \"WorldCrossCenter\"",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user calls \"addPlaceAPI\" with \"Post\" http request",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "the \"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the \"scope\" in response body is \"APP\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "verify place_id created maps to \"AAHouse\" using \"getPlaceAPI\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "AAHouse",
      "offset": 24
    },
    {
      "val": "English",
      "offset": 34
    },
    {
      "val": "WorldCrossCenter",
      "offset": 44
    }
  ],
  "location": "PlaceValidationStepDefinition.add_Place_Plyload_with(String,String,String)"
});
formatter.result({
  "duration": 1739823948,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "addPlaceAPI",
      "offset": 12
    },
    {
      "val": "Post",
      "offset": 31
    }
  ],
  "location": "PlaceValidationStepDefinition.userCallsWithHttpRequest(String,String)"
});
formatter.result({
  "duration": 1614542439,
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
  "duration": 4690973,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "status",
      "offset": 5
    },
    {
      "val": "OK",
      "offset": 34
    }
  ],
  "location": "PlaceValidationStepDefinition.the_in_response_body_is(String,String)"
});
formatter.result({
  "duration": 666777966,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "scope",
      "offset": 5
    },
    {
      "val": "APP",
      "offset": 33
    }
  ],
  "location": "PlaceValidationStepDefinition.the_in_response_body_is(String,String)"
});
formatter.result({
  "duration": 26969003,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAHouse",
      "offset": 33
    },
    {
      "val": "getPlaceAPI",
      "offset": 49
    }
  ],
  "location": "PlaceValidationStepDefinition.verifyPlace_idCreatedMapsToUsing(String,String)"
});
formatter.result({
  "duration": 2001151046,
  "status": "passed"
});
});