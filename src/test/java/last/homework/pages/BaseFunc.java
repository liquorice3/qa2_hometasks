package last.homework.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BaseFunc {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    private WebDriver driver;
    private WebDriverWait wait;

    public BaseFunc() {
        LOGGER.info("Opening Web Browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public void goToUrl(String url) {
        LOGGER.info("Opening URL: " + url);
        // !true -> false
        // !false -> true
        if (!url.startsWith("http://") && !url.startsWith("https://")) url = "http://" + url;

        driver.get(url);
    }

    public MainPage openMainPage() {
        LOGGER.info("Opening Main Page");
        goToUrl("sportsdirect.lv");
        return new MainPage(this);
    }

    public void click(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public List<WebElement> findElements(By locator) {
        return driver.findElements(locator);
    }

    public WebElement findElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}