package Pages;

import helpers.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IteraBasePage {
    protected WebDriver driver;

    public IteraBasePage() {
    }

    public IteraBasePage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement findWebElement(PageObject pageObject) {
        switch (pageObject.locatorType) {
            case ID:
                return driver.findElement(By.id(pageObject.locator));
            case NAME:
                return driver.findElement(By.name(pageObject.locator));
            case XPATH:
                return driver.findElement(By.xpath(pageObject.locator));
            default:
                throw new UnsupportedOperationException("Locator type not implemented");
        }
    }

    public void clickPageObject(PageObject pageObject) {
        WebElement webElement = findWebElement(pageObject);
        webElement.click();
    }

    public void insertIntoField(PageObject pageObject, String value) {
        WebElement webElement = findWebElement(pageObject);
        webElement.sendKeys(value);
    }

    public void replaceAndInsertIntoField(PageObject pageObject, String value) {
        WebElement webElement = findWebElement(pageObject);
        webElement.clear();
        webElement.sendKeys(value);
    }

    public String getPageObjectText(PageObject pageObject) {
        return findWebElement(pageObject).getText();
    }
}
