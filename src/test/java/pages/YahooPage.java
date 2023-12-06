package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class YahooPage {
    public YahooPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='ybar-sbq']")
    public WebElement searchBox;

    @FindBy(xpath = "(//div[@class='compTitle options-toggle'])[1]")
    public WebElement firstResult;
}
