package Pages;

import helpers.LocatorType;
import helpers.PageObject;
import org.openqa.selenium.WebDriver;

public class IteraConfirmDeletePage extends IteraBasePage {
    public IteraConfirmDeletePage(WebDriver driver) {
        super(driver);
    }

    private final PageObject CONFIRM_DELETE_BUTTON = new PageObject("/html/body/div/div/form/div/input", LocatorType.XPATH);

    public void clickConfirmDeletButton() {
        clickPageObject(CONFIRM_DELETE_BUTTON);
    }
}
