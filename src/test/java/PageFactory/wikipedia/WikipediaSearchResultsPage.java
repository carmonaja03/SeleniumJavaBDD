package PageFactory.wikipedia;

import PageFactory.common.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WikipediaSearchResultsPage extends BasePage {
    private By searchTextBox = By.xpath("//h1/span[normalize-space(text())='Hello']");

    public void validateSearchText(String searchText) {
        By searchLabel = By.xpath("//h1/span[normalize-space(text())='"+searchText+"']");
        verifyText(driver.findElement(searchLabel), searchText);

    }

}
