package test.autotest.anton.Tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import test.autotest.anton.pages.NavigationPage;


public class NavigationYandexTest extends BaseTest {

    public static NavigationPage navigationPage;

    @Test
    public void NavigationTest ( ) throws InterruptedException {
        navigationPage = new NavigationPage ( driver );

        driver.get ( "https://www.yandex.ru/" );
        navigationPage.clickVideoLink ( );
        Assert.assertEquals ( navigationPage.getUrl ( ) , ( "https://yandex.ru/video/" ) );
        Assert.assertTrue ( ( navigationPage.videoLinks.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        navigationPage.clickImagesLink ( );
        Assert.assertEquals ( navigationPage.getUrl ( ) , ( "https://yandex.ru/images/" ) );
        Assert.assertTrue ( ( navigationPage.imagesLinks.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        navigationPage.clickNewsLink ( );
        Assert.assertEquals ( navigationPage.getUrl ( ) , ( "https://news.yandex.ru/" ) );
        Assert.assertTrue ( ( navigationPage.newsMainLink.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        navigationPage.clickMapsLink ( );
        Assert.assertTrue ( navigationPage.getUrl ( ).contains ( "https://yandex.ru/maps" ) );
        Assert.assertTrue ( ( navigationPage.mapsMainBody.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        navigationPage.clickMarketLink ( );
        Assert.assertTrue ( navigationPage.getUrl ( ).contains ( "https://market.yandex.ru/" ) );
        Assert.assertTrue ( ( navigationPage.marketMainLink.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        navigationPage.clickTranslateLink ( );
        Assert.assertEquals ( navigationPage.getUrl ( ) , ( "https://translate.yandex.ru/" ) );
        Assert.assertTrue ( ( navigationPage.translateInputField.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

        navigationPage.clickMusicLink ( );
        Assert.assertTrue ( navigationPage.getUrl ( ).contains ( "https://music.yandex.ru/" ) );
        Assert.assertTrue ( ( navigationPage.musicInputField.size ( ) ) > 0 );
        driver.navigate ( ).back ( );

    }
}
