package com.StepDef.wikipedia;

import UtilityMethods.UtilMethods;
import com.StepDef.common.POInstance;
import com.StepDef.hooks.GlobalHooks;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.io.IOException;

public class WikipediaHomeSteps extends POInstance {

    @Given("^user navigates to wikipedia home page$")
    public void userNavigatesToWikipediaHomePage() throws ClassNotFoundException {
        wikipediaHomePage.navigateToURL();
    }

    @And("^user \"(.*)\" input \"(.*)\" on the search field$")
    public void userInputOnTheSearchField(String userKey, String searchText) throws Exception {
        String text = userProfileHelper.getValue(userKey,searchText);
        wikipediaHomePage.inputTextOnSearchBox(text);
    }
}
