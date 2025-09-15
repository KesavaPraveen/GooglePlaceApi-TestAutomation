package com.api.testing.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeletePlaceStepDefinition {
    @Given("The {string} is available from the Add Place scenario")
    public void the_is_available_from_the_add_place_scenario(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User calls the {string} API with DELETE http request using place_id")
    public void user_calls_the_api_with_delete_http_request_using_place_id(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
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

    @Given("An invalid or already deleted {string}")
    public void an_invalid_or_already_deleted(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("User calls the {string} API with DELETE http request using invalid place_id")
    public void user_calls_the_api_with_delete_http_request_using_invalid_place_id(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The API call fails with status code {int}")
    public void the_api_call_fails_with_status_code(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The response contains an error message about invalid place_id")
    public void the_response_contains_an_error_message_about_invalid_place_id() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
