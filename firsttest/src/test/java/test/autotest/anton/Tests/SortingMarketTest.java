package test.autotest.anton.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.autotest.anton.pages.MarketPage;
import test.autotest.anton.pages.NavigationPage;
import java.util.Collections;


public class SortingMarketTest extends BaseTest {
    public static MarketPage marketPage;
    public static NavigationPage navigationPage;

    @Test
    public void SortingTest ( ) {
        marketPage = new MarketPage ( driver );
        navigationPage = new NavigationPage ( driver );
        driver.get ( "https://www.yandex.ru/" );
        navigationPage.clickMarketLink ( );
        marketPage.moveToComputersLink ( );
        marketPage.clickTabletLink ( );
        marketPage.clickViewCountButton ( );
        marketPage.clickCountButton12 ( );
        marketPage.clicksortedByPrice ( );
        marketPage.sortByPrice ( );
        Collections.sort ( marketPage.sortedList );
        Assert.assertTrue ( marketPage.sortedList.equals ( marketPage.obtainedList ) );
        Assert.assertEquals ( marketPage.sortedByPrice.getAttribute ( "Class" ) , marketPage.classWhenSortedAscByPrice );
        marketPage.clicksortedByPrice ( );
        marketPage.sortByPrice ( );
        Collections.sort ( marketPage.sortedList );
        Collections.reverse ( marketPage.sortedList );
        Assert.assertTrue ( marketPage.sortedList.equals ( marketPage.obtainedList ) );
        Assert.assertEquals ( marketPage.sortedByPrice.getAttribute ( "Class" ) , marketPage.classWhenSortedDescByPrice );
    }
}