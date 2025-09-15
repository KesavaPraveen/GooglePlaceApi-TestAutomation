Feature: Google Place API - Add Place

  Scenario: Add a new place successfully with multiple response validations
    Given The Add Place API payload with required details
    When User calls the "Add Place" API with POST http request
    Then The API call is successful with status code 200
    And The response contains "status" as "OK"
    And The response contains "scope" as "APP"
    And The "place_id" is captured from the response
    And The response contains a non-empty "reference" field
    And The response contains a non-empty "id" field

  Scenario: Add place with invalid payload should fail
    Given The Add Place API payload with missing mandatory fields or invalid data
    When User calls the "Add Place" API with POST http request
    Then The API call fails with status code 400 or 404
    And The response contains an error message indicating the issue
