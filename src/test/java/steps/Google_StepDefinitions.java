package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.time.Duration;

public class Google_StepDefinitions {

    GooglePage googlePage = new GooglePage();
    @Given("user is on the Google search page")
    public void user_is_on_the_google_search_page() {
        googlePage.launchHomePage();
    }
    @When("user searches for the {string} on Google")
    public void user_searches_for(String term) {
        googlePage.searchBox.sendKeys(term+Keys.ENTER);
    }

    @When("user clicks the first returned item on Google")
    public void user_clicks_the_first_returned_item() {
        googlePage.firstResult.click();
    }
}
