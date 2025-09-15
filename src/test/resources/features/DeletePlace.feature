Feature: Google Place API - Delete Place

  Scenario: Delete the place using valid place_id with verification of success status
    Given The "place_id" is available from the Add Place scenario
    When User calls the "Delete Place" API with DELETE http request using place_id
    Then The API call is successful with status code 200
    And The response contains "status" as "OK"

  Scenario: Delete place using invalid or already deleted place_id should fail
    Given An invalid or already deleted "place_id"
    When User calls the "Delete Place" API with DELETE http request using invalid place_id
    Then The API call fails with status code 404
    And The response contains "status" as "NOT_FOUND"
    And The response contains an error message about invalid place_id
