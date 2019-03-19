package Pages;

import helpers.LocatorType;
import helpers.PageObject;
import org.openqa.selenium.WebDriver;

public class IteraCreateNewCustomerPage extends IteraBasePage {
    public IteraCreateNewCustomerPage(WebDriver driver) {
        super(driver);
    }

    private final PageObject NAME_FIELD = new PageObject("Name", LocatorType.ID);
    private final PageObject COMPANY_FIELD = new PageObject("Company", LocatorType.ID);
    private final PageObject ADDRESS_FIELD = new PageObject("Address", LocatorType.ID);
    private final PageObject CITY_FIELD = new PageObject("City", LocatorType.ID);
    private final PageObject PHONE_FIELD = new PageObject("Phone", LocatorType.ID);
    private final PageObject EMAIL_FIELD = new PageObject("Email", LocatorType.ID);
    private final PageObject CREATE_BUTTON = new PageObject("/html/body/div/form/div/div[7]/div/input", LocatorType.XPATH);


    public void inputIntoNameField(String value) {
        insertIntoField(NAME_FIELD, value);
    }

    public void inputIntoCompanyField(String value) {
        insertIntoField(COMPANY_FIELD, value);
    }

    public void inputIntoAddressField(String value) {
        insertIntoField(ADDRESS_FIELD, value);
    }

    public void inputIntoCityField(String value) {
        insertIntoField(CITY_FIELD, value);
    }

    public void inputIntoPhoneField(String value) {
        insertIntoField(PHONE_FIELD, value);
    }

    public void inputIntoEmailField(String value) {
        insertIntoField(EMAIL_FIELD, value);
    }

    public void clickCreateButton() {
        clickPageObject(CREATE_BUTTON);
    }
}
