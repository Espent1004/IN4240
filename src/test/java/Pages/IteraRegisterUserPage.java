package Pages;

import helpers.LocatorType;
import helpers.PageObject;
import org.openqa.selenium.WebDriver;

public class IteraRegisterUserPage extends IteraBasePage {
    public IteraRegisterUserPage(WebDriver driver) {
        super(driver);
    }

    private final PageObject FIRST_NAME_FIELD = new PageObject("FirstName", LocatorType.ID);
    private final PageObject SURNAME_FIELD = new PageObject("Surname", LocatorType.ID);
    private final PageObject EMAIL_FIELD = new PageObject("E_post", LocatorType.ID);
    private final PageObject MOBILE_FIELD = new PageObject("Mobile", LocatorType.ID);
    private final PageObject USERNAME_FIELD = new PageObject("Username", LocatorType.ID);
    private final PageObject PASSWORD_FIELD = new PageObject("Password", LocatorType.ID);
    private final PageObject CONFIRM_PASSWORD_FIELD = new PageObject("ConfirmPassword", LocatorType.ID);
    private final PageObject SUBMIT_BUTTON = new PageObject("submit", LocatorType.ID);

    private final PageObject SUCCESS_MESSAGE = new PageObject("/html/body/div/form/div/div[9]/div/label", LocatorType.XPATH);

    public PageObject getSUCCESS_MESSAGE() {
        return SUCCESS_MESSAGE;
    }

    public void inputIntoFirstNameField(String value) {
        insertIntoField(FIRST_NAME_FIELD, value);
    }

    public void inputIntoSurnameField(String value) {
        insertIntoField(SURNAME_FIELD, value);
    }

    public void inputIntoEmailField(String value) {
        insertIntoField(EMAIL_FIELD, value);
    }

    public void inputIntoMobileField(String value) {
        insertIntoField(MOBILE_FIELD, value);
    }

    public void inputIntoUsernameField(String value) {
        insertIntoField(USERNAME_FIELD, value);
    }

    public void inputIntoPasswordField(String value) {
        insertIntoField(PASSWORD_FIELD, value);
    }

    public void inputIntoConfirmPasswordField(String value) {
        insertIntoField(CONFIRM_PASSWORD_FIELD, value);
    }

    public void clickSubmitButton() {
        clickPageObject(SUBMIT_BUTTON);
    }

    public String getSuccessMessage() {
        return getPageObjectText(SUCCESS_MESSAGE);
    }
}
