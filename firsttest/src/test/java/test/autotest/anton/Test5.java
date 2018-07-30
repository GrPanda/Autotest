package test.autotest.anton;

import org.testng.Assert;
import org.testng.annotations.Test;
import test.autotest.anton.pages.MarketPage;
import test.autotest.anton.pages.NavigationPage;

import java.util.Collections;


public class Test5 extends BaseTest {
    public static MarketPage marketPage;
    public static NavigationPage navigationPage;

    @Test
    public void CountTest () throws InterruptedException {
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

        marketPage.clickViewCountButton ( );
        marketPage.clickCountButton12 ( );
        marketPage.clicksortedByPrice ( );
        marketPage.sortByPrice ( );
        Collections.sort ( marketPage.sortedList );
        System.out.println ( marketPage.sortedList + "=" + marketPage.obtainedList );
        Assert.assertTrue ( marketPage.sortedList.equals ( marketPage.obtainedList ) );
        Assert.assertEquals ( marketPage.sortedByPrice.getAttribute ( "Class" ) , marketPage.classWhenSortedAscByPrice );
        marketPage.clicksortedByPrice ( );
        marketPage.sortByPrice ( );
        Collections.sort ( marketPage.sortedList );
        Collections.reverse ( marketPage.sortedList );
        System.out.println ( marketPage.sortedList + "=" + marketPage.obtainedList );
        Assert.assertTrue ( marketPage.sortedList.equals ( marketPage.obtainedList ) );
        Assert.assertEquals ( marketPage.sortedByPrice.getAttribute ( "Class" ) , marketPage.classWhenSortedDescByPrice );

        marketPage.clickFirstItemForCompare ( );
        marketPage.clickSecondItemForCompare ( );
        marketPage.clickCompareLink ( );
        Assert.assertEquals ( marketPage.firstCompareItem.isDisplayed ( ) , marketPage.secondCompareItem.isDisplayed ( ) , "true" );
        marketPage.moveToCompareIemLink ( );
        marketPage.clickFirstCompareItemDeleteButton ( );
        marketPage.moveToCompareIemLink2 ( );
        marketPage.clickSecondCompareItemDeleteButton ( );
        Assert.assertEquals ( marketPage.firstCompareItem.isDisplayed ( ) , marketPage.secondCompareItem.isDisplayed ( ) , "false" );

        driver.get ( "https://www.yandex.ru/" );
        navigationPage.clickVideoLink ( );
        System.out.println ( navigationPage.getUrl ( ) );
        Assert.assertEquals ( navigationPage.getUrl ( ) , ( "https://yandex.ru/video/" ) );
        Assert.assertTrue ( ( navigationPage.videoLinks.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        navigationPage.clickImagesLink ( );
        System.out.println ( navigationPage.getUrl ( ) );
        Assert.assertEquals ( navigationPage.getUrl ( ) , ( "https://yandex.ru/images/" ) );
        Assert.assertTrue ( ( navigationPage.imagesLinks.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        navigationPage.clickNewsLink ( );
        System.out.println ( navigationPage.getUrl ( ) );
        Assert.assertEquals ( navigationPage.getUrl ( ) , ( "https://news.yandex.ru/" ) );
        Assert.assertTrue ( ( navigationPage.newsMainLink.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        navigationPage.clickMapsLink ( );
        System.out.println ( navigationPage.getUrl ( ) );
        Assert.assertTrue ( navigationPage.getUrl ( ).contains ( "https://yandex.ru/maps" ) );
        Assert.assertTrue ( ( navigationPage.mapsMainBody.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        navigationPage.clickMarketLink ( );
        System.out.println ( navigationPage.getUrl ( ) );
        Assert.assertTrue ( navigationPage.getUrl ( ).contains ( "https://market.yandex.ru/" ) );
        Assert.assertTrue ( ( navigationPage.marketMainLink.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        navigationPage.clickTranslateLink ( );
        System.out.println ( navigationPage.getUrl ( ) );
        Assert.assertEquals ( navigationPage.getUrl ( ) , ( "https://translate.yandex.ru/" ) );
        Assert.assertTrue ( ( navigationPage.translateInputField.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        navigationPage.clickMusicLink ( );
        System.out.println ( navigationPage.getUrl ( ) );
        Assert.assertTrue ( navigationPage.getUrl ( ).contains ( "https://music.yandex.ru/" ) );
        Assert.assertTrue ( ( navigationPage.musicInputField.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        navigationPage.clickTvonlineLink ( );
        Thread.sleep ( 1000 );
        System.out.println ( navigationPage.getUrl ( ) );
        Assert.assertTrue ( ( navigationPage.tvonlineStreamWindow.size ( ) ) > 0 );
        Assert.assertEquals ( navigationPage.getUrl ( ).contains ( "stream" ) , navigationPage.getUrl ( ).contains ( "https://www.yandex.ru" ) , "true" );
        driver.navigate ( ).back ( );

    }
}
