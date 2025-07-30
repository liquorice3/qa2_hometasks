package last.homework.tests;

import last.homework.pages.BaseFunc;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class SearchTests {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());

    @Test
    public void searchForCourtTest() {
        LOGGER.info("This test checks whether entering a keyword into the search field returns at least one relevant result.");
        BaseFunc baseFunc = new BaseFunc();

        baseFunc.openMainPage()
                .acceptCookies()
                .searchFor("Court")
                .checkResultsContain("court");
    }
}
