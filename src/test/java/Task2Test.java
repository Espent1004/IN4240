import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Task2Test extends Oblig1BaseTest {

    @Test
    public void step001_navigate_to_login() {
        iteraHomePage.clickLoginButton();
    }

    @Test
    public void step002_login() {
        iteraLoginPage.inputIntoUsernameField("OlaNordmann");
        iteraLoginPage.inputIntoPasswordField("passord1");
        iteraLoginPage.clickLoginButton();
    }

    @Test
    public void step003_verify_url() {
        waitForUrlToEqual("https://itera-qa.azurewebsites.net/Dashboard");
    }

    @Test
    public void step004_create_new_customer() {
        iteraDashboardPage.clickCreateNewCustomerButton();

        iteraCreateNewCustomerPage.inputIntoNameField("Ola Kunde");
        iteraCreateNewCustomerPage.inputIntoCompanyField("Norge");
        iteraCreateNewCustomerPage.inputIntoAddressField("Snarøyveien 30");
        iteraCreateNewCustomerPage.inputIntoCityField("Oslo");
        iteraCreateNewCustomerPage.inputIntoPhoneField("22233344");
        iteraCreateNewCustomerPage.inputIntoEmailField("ola@nordmann1337.no");
        iteraCreateNewCustomerPage.clickCreateButton();
    }

    @Test
    public void step005_verify_customer() {
        waitForUrlToEqual("https://itera-qa.azurewebsites.net/Dashboard");
        iteraDashboardPage.inputIntoSearchField("ola@nordmann1337.no");
        iteraDashboardPage.clickSearchButton();
        waitForElementToEqual(By.xpath(iteraDashboardPage.getEMAIL_FIELD().locator), "ola@nordmann1337.no");
        iteraDashboardPage.clickEditButton();
    }

    @Test
    public void step006_edit_customer() {
        iteraEditCustomerPage.replaceAndInputIntoPhoneField("99933322");
        iteraEditCustomerPage.clickSaveButton();
    }

    @Test
    public void step007_verify_customer() {
        waitForUrlToEqual("https://itera-qa.azurewebsites.net/Dashboard");
        iteraDashboardPage.inputIntoSearchField("ola@nordmann1337.no");
        iteraDashboardPage.clickSearchButton();
        waitForElementToEqual(By.xpath(iteraDashboardPage.getPHONE_FIELD().locator), "99933322");
    }

    @Test
    public void step008_delete_customer() {
        iteraDashboardPage.clickDeleteButton();
        iteraConfirmDeletePage.clickConfirmDeletButton();
    }

    @Test
    public void step009_verify_deletion() {
        iteraDashboardPage.inputIntoSearchField("ola@nordmann1337.no");
        iteraDashboardPage.clickSearchButton();
        Assert.assertEquals(iteraDashboardPage.getMessageText(), "No Match");
    }

    @Test
    public void step010_logout() {
        iteraDashboardPage.clickLogoutButton();
        waitForUrlToEqual("https://itera-qa.azurewebsites.net/Login");
    }

    String getTestNumber() {
        return "2";
    }
}