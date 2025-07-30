package last.homework.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage {
    private final By PRODUCT_TITLES = By.cssSelector(".s-productthumbbox .productdescriptionname");
    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    private BaseFunc baseFunc;

    public SearchResultsPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
        LOGGER.info("We are on Search Results Page");
    }

    public void checkResultsContain(String keyword) {
        LOGGER.info("Checking search results");
        List<WebElement> products = baseFunc.findElements(PRODUCT_TITLES);
        Assertions.assertFalse(products.isEmpty(), "The list of products is empty!");

        boolean found = false;
        for (WebElement product : products) {
            if (product.getText().toLowerCase().contains(keyword.toLowerCase())) {
                found = true;
                break;
            }
        }
    }
}
