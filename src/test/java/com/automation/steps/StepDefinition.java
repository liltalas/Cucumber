package com.automation.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
    @Given("user open website")
    public void user_open_website() {
        System.out.println("Open website");
    }

    @Given("verify user is on login page")
    public void verify_user_is_on_login_page() {
        System.out.println("Do Login");
    }

    @When("user enter the valid credentials")
    public void user_enter_the_valid_credentials() {
        System.out.println("Enter Valid Credentials");
    }

    @Then("verify home page is displayed")
    public void verify_home_page_is_displayed() {
        System.out.println("Verify Login Successful");
    }

    @When("user enter the invalid credentials")
    public void user_enter_the_invalid_credentials() {

    }

    @Then("verify invalid login error message is displayed")
    public void verify_invalid_login_error_message_is_displayed() {

    }

}
