package helpers;

public class PageObject {
    public String locator;
    public LocatorType locatorType;

    public PageObject(String locator, LocatorType locatorType) {
        this.locator = locator;
        this.locatorType = locatorType;
    }
}
