package test.autotest.anton;

        import org.testng.annotations.*;
        import test.autotest.anton.pages.LocationPage;
        import static org.testng.Assert.assertEquals;

public class Test4 extends BaseTest {
    public static LocationPage locationPage;
    @Test
    public  void Test4() {
        locationPage = new LocationPage(driver);

        driver.get("https://www.yandex.by/");

        locationPage.clickLocationLink();
        locationPage.clearCityField();
        locationPage.inputCiity("Лондон");
        locationPage.clickCityLinkLondon();
        locationPage.clickMoreLink();
        locationPage.numbersOfElementsLondon();

        locationPage.clickLocationLink();
        locationPage.clearCityField();
        locationPage.inputCiity("Париж");
        locationPage.clickCityLinkParis();
        locationPage.clickMoreLink();
        locationPage.numbersOfElementsParis();

        assertEquals (locationPage.numbersOfElementsLondon(),locationPage.numbersOfElementsParis());
        System.out.println(locationPage.numbersOfElementsLondon()+"="+locationPage.numbersOfElementsParis());
    }
}

