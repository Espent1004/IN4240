package Pages;

import helpers.LocatorType;
import helpers.PageObject;
import org.openqa.selenium.WebDriver;

public class IteraLoginPage extends IteraBasePage {
    public IteraLoginPage(WebDriver driver) {
        super(driver);
    }

    private final PageObject USERNAME_FIELD = new PageObject("Username", LocatorType.ID);
    private final PageObject PASSWORD_FIELD = new PageObject("Password", LocatorType.ID);
    private final PageObject LOGIN_BUTTON = new PageObject("/html/body/div/div[1]/form/table/tbody/tr[7]/td[2]/input[1]", LocatorType.XPATH);


    public void inputIntoUsernameField(String value) {
        insertIntoField(USERNAME_FIELD, value);
    }

    public void inputIntoPasswordField(String value) {
        insertIntoField(PASSWORD_FIELD, value);
    }

    public void clickLoginButton() {
        clickPageObject(LOGIN_BUTTON);
    }
}
