package com.StepDef.common;

import PageFactory.wikipedia.WikipediaHomePage;
import PageFactory.wikipedia.WikipediaSearchResultsPage;
import UtilityMethods.UserProfileHelper;

public class POInstance {
    protected WikipediaHomePage wikipediaHomePage = new WikipediaHomePage();
    protected UserProfileHelper userProfileHelper = new UserProfileHelper();
    protected WikipediaSearchResultsPage wikipediaSearchResultsPage = new WikipediaSearchResultsPage();

}
