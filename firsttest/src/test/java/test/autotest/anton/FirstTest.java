package test.autotest.anton;

import org.testng.annotations.*;
import static org.testng.Assert.assertTrue;

public class FirstTest extends BaseTest {


    @Test
    public  void FirstTest() {
        searchPage.inputSearh("погода пенза");
        searchPage.clickSearchButton();
        String linkText = searchPage.getLinkText();

        assertTrue(linkText.contains("Пензе"));
    }

}
