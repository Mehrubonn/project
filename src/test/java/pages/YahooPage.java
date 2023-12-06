package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class YahooPage extends TestBasePage{
    @FindBy(xpath = "//input[@id='ybar-sbq']")
    public WebElement searchBox;

    @FindBy(xpath = "(//div[@class='compTitle options-toggle'])[1]")
    public WebElement firstResult;

    public void launchHomePage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("yahooUrl"));
    }

}
