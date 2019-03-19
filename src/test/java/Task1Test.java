import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Task1Test extends Oblig1BaseTest {

    @Test
    public void step001_navigate_to_form() {
        iteraHomePage.clickSignUpButton();
    }

    @Test
    public void step002_fill_in_form() {

        iteraRegisterUserPage.inputIntoFirstNameField("Ola");
        iteraRegisterUserPage.inputIntoSurnameField("Nordmann");
        iteraRegisterUserPage.inputIntoEmailField("ola@nordmann.no");
        iteraRegisterUserPage.inputIntoMobileField("22233344");
        iteraRegisterUserPage.inputIntoUsernameField("OlaNordmann");
        iteraRegisterUserPage.inputIntoPasswordField("password1");
        iteraRegisterUserPage.inputIntoConfirmPasswordField("password1");

        iteraRegisterUserPage.clickSubmitButton();
    }

    @Test
    public void step003_verify_registration() {
        waitForElementToEqual(By.id(iteraRegisterUserPage.getSUCCESS_MESSAGE().locator), "Registration Successful");
    }

    String getTestNumber() {
        return "1";
    }
}