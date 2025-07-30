package last.homework.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainPage {
    private final By ACCEPT_COOKIES_BTN = By.id("onetrust-accept-btn-handler");
    private final By REGISTRATION_BTN = By.id("loginMenu");
    private final By ACCOUNT_ICON = By.xpath("(.//span[@class='ico'])[1]");
    private final By SEARCH_INPUT = By.id("txtSearch");
    private final By SEARCH_BTN = By.id("cmdSearch");

    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private BaseFunc baseFunc;

    public MainPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
        LOGGER.info("We are on Main Page");
    }

    public MainPage acceptCookies() {
        LOGGER.info("Accepting Cookies");
        baseFunc.click(ACCEPT_COOKIES_BTN);
        return this;
    }

    public SignInRegisterPage openSignInRegisterPage() {
        LOGGER.info("Opening Sign In and Register Page");
        baseFunc.click(REGISTRATION_BTN);
        return new SignInRegisterPage(baseFunc);
    }

    public void verifyLoginSuccess() {
        LOGGER.info("Checking login success");
        WebElement accountIcon = baseFunc.findElement(ACCOUNT_ICON);
        Assertions.assertTrue(accountIcon.isDisplayed(), "User not authorised - the account icon element not found!");

    }

    public SearchResultsPage searchFor(String query) {
        LOGGER.info("Searching for a word");
        baseFunc.findElement(SEARCH_INPUT).sendKeys(query);
        baseFunc.click(SEARCH_BTN);
        return new SearchResultsPage(baseFunc);
    }
}
