Feature: Validating Place APIs
@AddPlace1
  Scenario Outline: Verify if Place is being successfully added using AddPlaceAPI
    Given Add Place Plyload with "<name>" "<langauge>" "<address>"
    When user calls "addPlaceAPI" with "Post" http request
    Then the API call got success with status code 200
    And the "status" in response body is "OK"
    And the "scope" in response body is "APP"
    And verify place_id created maps to "<name>" using "getPlaceAPI"

    Examples:
    |name   |langauge|address         |
    |AAHouse|English |WorldCrossCenter|
   # |BBHouse|Spanish |Sea Cross Center|

@DeletePlace
  Scenario: Verify if Delete Place functionality is working
    Given DeletePlace Payload
    When user calls "deletePlaceAPI" with "POST" http request
    Then the API call got success with status code 200
    And the "status" in response body is "OK"

  @AddPlace
  Scenario: Verify if Delete Place functionality is working
    Given DeletePlace Payload
    When user calls "goRestAPI" with "GET" http request
    Then the API call got success with status code 200
    And the "total" in response body is "21"
