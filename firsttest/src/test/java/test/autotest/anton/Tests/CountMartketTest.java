package test.autotest.anton.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.autotest.anton.pages.MarketPage;
import test.autotest.anton.pages.NavigationPage;


public class CountMartketTest extends BaseTest {
    public static MarketPage marketPage;
    public static NavigationPage navigationPage;

    @Test
    public void CountTest ( ) {
        marketPage = new MarketPage ( driver );
        navigationPage = new NavigationPage ( driver );
        driver.get ( "https://www.yandex.ru/" );
        navigationPage.clickMarketLink ( );
        marketPage.moveToComputersLink ( );
        marketPage.clickTabletLink ( );
        marketPage.clickViewCountButton ( );
        marketPage.clickCountButton12 ( );
        Assert.assertEquals ( marketPage.getCountItemLinks ( ) , 12 );
        marketPage.clickViewCountButton ( );
        marketPage.clickCountButton48 ( );
        Assert.assertEquals ( marketPage.getCountItemLinks ( ) , 48 );
    }
}