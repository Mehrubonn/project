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
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));
    }
    @When("user searches for the term on Google")
    public void user_searches_for() {
        googlePage.searchBox.sendKeys(ConfigurationReader.getProperty("term")+ Keys.ENTER);
    }

    @When("user clicks the first returned item on Google")
    public void user_clicks_the_first_returned_item() {
        googlePage.firstResult.click();
    }
    @Then("user sees the term on the title")
    public void user_sees_on_the_title() {
        BrowserUtils.verifyTitleContains(ConfigurationReader.getProperty("term"));
    }
}
