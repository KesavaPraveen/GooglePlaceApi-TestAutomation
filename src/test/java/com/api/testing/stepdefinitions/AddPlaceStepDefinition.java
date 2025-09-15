package com.api.testing.stepdefinitions;

import com.api.testing.pojos.AddPlaceRequest;
import com.api.testing.utils.TestDataBuilder;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class AddPlaceStepDefinition {
    private AddPlaceRequest addPlaceRequest;
    private Response response;
    private static String placeId;
    @Given("The Add Place API payload with required details")
    public void the_add_place_api_payload_with_required_details() {
        addPlaceRequest = TestDataBuilder.createValidAddPlaceRequest();
    }

    @When("User calls the {string} API with POST http request")
    public void user_calls_the_api_with_post_http_request(String apiName) {
    }

    @Then("The API call is successful with status code {int}")
    public void the_api_call_is_successful_with_status_code(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The response contains {string} as {string}")
    public void the_response_contains_as(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The {string} is captured from the response")
    public void the_is_captured_from_the_response(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The response contains a non-empty {string} field")
    public void the_response_contains_a_non_empty_field(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The Add Place API payload with missing mandatory fields or invalid data")
    public void the_add_place_api_payload_with_missing_mandatory_fields_or_invalid_data() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The API call fails with status code {int} or {int}")
    public void the_api_call_fails_with_status_code_or(Integer int1, Integer int2) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The response contains an error message indicating the issue")
    public void the_response_contains_an_error_message_indicating_the_issue() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
