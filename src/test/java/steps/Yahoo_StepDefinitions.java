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
    @Given("user is on the Bing search page")
    public void user_is_on_the_bing_search_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("yahooUrl"));
    }

    @When("user searches for the term on Bing")
    public void userSearchesForOnBing() {
        yahooPage.searchBox.sendKeys(ConfigurationReader.getProperty("term")+ Keys.ENTER);
        BrowserUtils.waitForVisibilityOf(yahooPage.firstResult);
    }

    @And("user clicks the first returned item on Bing")
    public void userClicksTheFirstReturnedItemOnBing() {
        yahooPage.firstResult.click();
    }
}
