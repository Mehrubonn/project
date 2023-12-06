package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

public class GooglePage extends TestBasePage{

    @FindBy(xpath = "//textarea[@id='APjFqb']")
    public WebElement searchBox;

    @FindBy(xpath = "(//div[@class='yuRUbf'])[1]")
    public WebElement firstResult;

    public void launchHomePage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));
    }
}
