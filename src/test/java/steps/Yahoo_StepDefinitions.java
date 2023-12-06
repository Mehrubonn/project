package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.YahooPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Yahoo_StepDefinitions {
    YahooPage yahooPage = new YahooPage();
    @Given("user is on the Yahoo search page")
    public void user_is_on_the_yahoo_search_page() {
        yahooPage.launchHomePage();
    }

    @When("user searches for the {string} on Yahoo")
    public void user_searches_for_the_on_yahoo(String term) {
        yahooPage.searchBox.sendKeys(term+Keys.ENTER);
        BrowserUtils.waitForVisibilityOf(yahooPage.firstResult);
    }
    @When("user sees the {string} on the title")
    public void user_sees_the_on_the_title(String term) {
        BrowserUtils.verifyTitleContains(term);
    }

    @And("user clicks the first returned item on Yahoo")
    public void userClicksTheFirstReturnedItemOnYahoo() {
        yahooPage.firstResult.click();
    }
}