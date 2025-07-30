package last.homework.tests;

import last.homework.pages.BaseFunc;
import last.homework.pages.SignInRegisterPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class LoginTests {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private final String EMPTY_EMAIL_ERROR = "Lūdzu, ievadiet savu e-pasta adresi";
    private final String VALID_EMAIL = "liquorice36@gmail.com";
    private final String VALID_PASSWORD = "Lillythebest123";

    @Test
    public void loginWithEmptyPassword() {
        LOGGER.info("This test checks error msg when trying to login with empty email");
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openMainPage()
                .acceptCookies()
                .openSignInRegisterPage()
                .submitEmail();

        LOGGER.info("Checking error messages");

        SignInRegisterPage signInRegisterPage = new SignInRegisterPage(baseFunc);
        signInRegisterPage.checkForErrorMsg(EMPTY_EMAIL_ERROR);
    }

    @Test
    public void successfulLogin() {
        LOGGER.info("This test checks successful login");
        BaseFunc baseFunc = new BaseFunc();
        baseFunc.openMainPage()
                .acceptCookies()
                .openSignInRegisterPage()
                .enterEmail(VALID_EMAIL)
                .submitEmail()
                .enterPassword(VALID_PASSWORD)
                .submitPassword()
                .verifyLoginSuccess();
    }
}