package com.iLab.assessment.StepDefs.API;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class API_StepDef {

    @Given("^User access the API$")
    public void user_access_the_API(){

    }

    @When("^User search for random breed$")
    public void user_search_for_random_breed() {

    }

    @Then("^User should be presented with successful message$")
    public void user_should_be_presented_with_successful_message(){

    }

    //================================================================================

    @When("^User verify dog breed \"([^\"]*)\" is on the list$")
    public void user_verify_dog_breed_is_on_the_list(String arg1){

    }

    @Then("^User should be successful response$")
    public void user_should_be_successful_response(){

    }

    //=================================================================================

    @When("^User retrieve all sub-breeds for bulldogs$")
    public void user_retrieve_all_sub_breeds_for_bulldogs(){

    }

    @Then("^User should get the list and images$")
    public void user_should_get_the_list_and_images(){

    }
}
