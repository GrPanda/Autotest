package test.autotest.anton.Tests;

        import org.testng.annotations.*;
        import test.autotest.anton.pages.SearchPage;

        import static org.testng.Assert.assertTrue;

public class FirstTest extends BaseTest {

    public static SearchPage searchPage;

    @Test
    public  void FirstTest() {
        searchPage = new SearchPage(driver);

        driver.get("https://www.ya.ru/");

        searchPage.inputSearh("погода пенза");
        searchPage.clickSearchButton();
        String linkText = searchPage.getLinkText();

        assertTrue(linkText.contains("Пензе"));
    }

}