package Pages;

import helpers.LocatorType;
import helpers.PageObject;
import org.openqa.selenium.WebDriver;

public class IteraDashboardPage extends IteraBasePage {
    public IteraDashboardPage(WebDriver driver) {
        super(driver);
    }

    private final PageObject LOGOUT_BUTTON = new PageObject("//*[@id=\"navbarColor01\"]/form/ul/li[2]/a", LocatorType.XPATH);
    private final PageObject SEARCH_FIELD = new PageObject("searching", LocatorType.ID);
    private final PageObject SEARCH_BUTTON = new PageObject("/html/body/div/div/form/input[2]", LocatorType.XPATH);
    private final PageObject MESSAGE_FIELD = new PageObject("/html/body/div/div/table/tbody/tr[2]/td", LocatorType.XPATH);
    private final PageObject CREATE_NEW_CUSTOMER_BUTTON = new PageObject("/html/body/div/div/p[1]/a", LocatorType.XPATH);
    private final PageObject EDIT_BUTTON = new PageObject("/html/body/div/div/table/tbody/tr[2]/td[7]/a[1]", LocatorType.XPATH);
    private final PageObject DELETE_BUTTON = new PageObject("/html/body/div/div/table/tbody/tr[2]/td[7]/a[3]", LocatorType.XPATH);
    private final PageObject PHONE_FIELD = new PageObject("/html/body/div/div/table/tbody/tr[2]/td[5]", LocatorType.XPATH);
    private final PageObject EMAIL_FIELD = new PageObject("/html/body/div/div/table/tbody/tr[2]/td[6]", LocatorType.XPATH);

    public PageObject getPHONE_FIELD() {
        return PHONE_FIELD;
    }

    public PageObject getEMAIL_FIELD() {
        return EMAIL_FIELD;
    }

    public void inputIntoSearchField(String value) {
        insertIntoField(SEARCH_FIELD, value);
    }

    public String getMessageText() {
        return getPageObjectText(MESSAGE_FIELD);
    }

    public void clickLogoutButton() {
        clickPageObject(LOGOUT_BUTTON);
    }

    public void clickSearchButton() {
        clickPageObject(SEARCH_BUTTON);
    }

    public void clickCreateNewCustomerButton() {
        clickPageObject(CREATE_NEW_CUSTOMER_BUTTON);
    }

    public void clickEditButton() {
        clickPageObject(EDIT_BUTTON);
    }

    public void clickDeleteButton() {
        clickPageObject(DELETE_BUTTON);
    }

    public String getPhoneText() {
        return getPageObjectText(PHONE_FIELD);
    }

}
