Feature: Google Place API - Get Place

  Scenario: Get the place details using valid place_id with multiple field validations
    Given The "place_id" is available from the Add Place scenario
    When User calls the "Get Place" API with GET http request using place_id
    Then The API call is successful with status code 200
    And The response contains the correct "name" as "Your Place Name"
    And The response contains the correct "address" as "Your Address"
    And The response contains "latitude" and "longitude" coordinates
    And The response "accuracy" value should be numeric and valid
    And The response contains "phone_number" field if applicable

  Scenario: Get place details using invalid or non-existent place_id should fail
    Given An invalid or non-existent "place_id"
    When User calls the "Get Place" API with GET http request using invalid place_id
    Then The API call fails with status code 404
    And The response contains "status" as "NOT_FOUND"
    And The response contains an error message about invalid place_id
