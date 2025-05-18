package com.StepDef.wikipedia;

import com.StepDef.common.POInstance;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WikipediaSearchResultsSteps extends POInstance {

    @Then("^user validates that \"(.*)\" is displayed$")
    public void userValidatesThatTheResultIsDisplayed(String searchText) {
        wikipediaSearchResultsPage.validateSearchText(searchText);
    }
}
