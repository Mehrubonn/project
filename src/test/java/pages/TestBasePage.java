package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class TestBasePage {

        public TestBasePage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

    }
