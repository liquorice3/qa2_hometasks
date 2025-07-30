package last.homework.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SignInRegisterPage {
    private final By ERROR_MSG = By.id("Input_EmailAddress-error");
    private final By EMAIL_FIELD = By.id("Input_EmailAddress");
    private final By PASSWORD_FIELD = By.id("Input_Password");
    private final By EMAIL_SUBMIT_BTN = By.id("emailSubmit");
    private final By LOGIN_SUBMIT_BTN = By.id("loginSubmit");

    private BaseFunc baseFunc;

    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    public SignInRegisterPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public SignInRegisterPage checkForErrorMsg(String errorMsg) {
        List<WebElement> errorMsgElements = baseFunc.findElements(ERROR_MSG);
        Assertions.assertFalse(errorMsgElements.isEmpty(), "There are no error messages at all");

        boolean isErrorMsgFound = false;
        for (WebElement we : errorMsgElements) {
            if (we.getText().trim().equals(errorMsg)) {
                isErrorMsgFound = true;
                break;
            }
        }

        Assertions.assertTrue(isErrorMsgFound, "There is no error msg: ");
        return this;
    }

    public SignInRegisterPage enterEmail(String email) {
        baseFunc.findElement(EMAIL_FIELD).sendKeys(email);
        return this;
    }

    public SignInRegisterPage submitEmail() {
        LOGGER.info("Submitting email");
        baseFunc.click(EMAIL_SUBMIT_BTN);
        return this;
    }

    public SignInRegisterPage enterPassword(String password) {
        baseFunc.findElement(PASSWORD_FIELD).sendKeys(password);
        return this;
    }

    public MainPage submitPassword() {
        LOGGER.info("Submitting password");
        baseFunc.click(LOGIN_SUBMIT_BTN);
        return new MainPage(baseFunc);
    }
}
