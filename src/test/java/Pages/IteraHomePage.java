package Pages;

import helpers.LocatorType;
import helpers.PageObject;
import org.openqa.selenium.WebDriver;

public class IteraHomePage extends IteraBasePage {
    public IteraHomePage(WebDriver driver) {
        super(driver);
    }

    private final PageObject SIGN_UP_BUTTON = new PageObject("//*[@id=\"navbarColor01\"]/form/ul/li[1]/a", LocatorType.XPATH);
    private final PageObject LOGIN_BUTTON = new PageObject("//*[@id=\"navbarColor01\"]/form/ul/li[2]/a", LocatorType.XPATH);

    public void clickSignUpButton() {
        clickPageObject(SIGN_UP_BUTTON);
    }

    public void clickLoginButton() {
        clickPageObject(LOGIN_BUTTON);
    }

}
