package test.autotest.anton.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.autotest.anton.pages.MarketPage;
import test.autotest.anton.pages.NavigationPage;

public class CompareMarketTest extends BaseTest {
    public static MarketPage marketPage;
    public static NavigationPage navigationPage;

    @Test
    public void CompareTest ( ) {
        marketPage = new MarketPage ( driver );
        navigationPage = new NavigationPage ( driver );
        driver.get ( "https://www.yandex.ru/" );
        navigationPage.clickMarketLink ( );
        marketPage.moveToComputersLink ( );
        marketPage.clickTabletLink ( );
        marketPage.clickFirstItemForCompare ( );
        marketPage.clickSecondItemForCompare ( );
        marketPage.clickCompareLink ( );
        Assert.assertEquals ( marketPage.firstCompareItem.isDisplayed ( ) , marketPage.secondCompareItem.isDisplayed ( ) , "true" );
        marketPage.moveToCompareIemLink ( );
        marketPage.clickFirstCompareItemDeleteButton ( );
        marketPage.moveToCompareIemLink2 ( );
        marketPage.clickSecondCompareItemDeleteButton ( );
        Assert.assertEquals ( marketPage.firstCompareItem.isDisplayed ( ) , marketPage.secondCompareItem.isDisplayed ( ) , "false" );
    }
}