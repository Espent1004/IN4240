package Pages;

import helpers.LocatorType;
import helpers.PageObject;
import org.openqa.selenium.WebDriver;

public class IteraEditCustomerPage extends IteraBasePage {
    public IteraEditCustomerPage(WebDriver driver) {
        super(driver);
    }

    private final PageObject PHONE_FIELD = new PageObject("Phone", LocatorType.ID);
    private final PageObject SAVE_BUTTON = new PageObject("/html/body/div/form/div/div[7]/div/input", LocatorType.XPATH);

    public void replaceAndInputIntoPhoneField(String value) {
        replaceAndInsertIntoField(PHONE_FIELD, value);
    }

    public void clickSaveButton() {
        clickPageObject(SAVE_BUTTON);
    }
}
