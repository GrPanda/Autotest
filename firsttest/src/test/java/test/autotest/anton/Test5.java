package test.autotest.anton;



        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.testng.Assert;
        import org.testng.annotations.Test;
        import test.autotest.anton.pages.MarketPage;
        import test.autotest.anton.pages.NavigationPage;

        import java.util.Collections;


        import static org.testng.Assert.assertEquals;


public class Test5 extends BaseTest {
    public static MarketPage marketPage;
    public static NavigationPage navigationPage;

    @Test
    public void Test5() throws InterruptedException {
        marketPage = new MarketPage(driver);
        navigationPage = new NavigationPage(driver);

        driver.get("https://www.yandex.ru/");
//Первое задание
        navigationPage.clickMarketLink();

        marketPage.moveToComputersLink();
        Thread.sleep(2000);
        marketPage.clickTabletLink();
        Thread.sleep(1000);
/*
        // marketPage.waitForElement(marketPage.tabletLink);

        //   marketPage.moveToComputersLink1();
        //  marketPage.clickViewCountButton();
        Thread.sleep(1000);

*/
   /*     navigationPage.clickMarketLink();

        marketPage.moveToComputersLink();
        Thread.sleep(2000);

        // marketPage.waitForElement(marketPage.tabletLink);
        marketPage.clickTabletLink();
     marketPage.clicksortedByPrice();
       marketPage.clickCountButton12();
        Thread.sleep(1000);

        //      Assert.assertEquals(marketPage.countLinks.size(), 48);
        // Assert.assertEquals(marketPage.countLinks.size(), 12);
        Thread.sleep(1000);
        Thread.sleep(1000);
        Thread.sleep(1000);


  */

// ВТОРОЕ ЗАДАНИЕ
        marketPage.clicksortedByPrice();
        Thread.sleep(1000);
        Thread.sleep(1000);
        marketPage.sortByPrice();
        Collections.sort(marketPage.sortedList);
        System.out.println(marketPage.sortedList + "=" + marketPage.obtainedList);
        Assert.assertTrue(marketPage.sortedList.equals(marketPage.obtainedList));
        marketPage.clicksortedByPrice();
        Thread.sleep(1000);
        Thread.sleep(1000);
        marketPage.sortByPrice();
        Collections.sort(marketPage.sortedList);
        Collections.reverse(marketPage.sortedList);
        System.out.println(marketPage.sortedList + "=" + marketPage.obtainedList);
        Assert.assertTrue(marketPage.sortedList.equals(marketPage.obtainedList));
//3 ЗАДАНИЕ

       // marketPage.moveToCompareLink();
   //     Thread.sleep(1000);

   //
     //   marketPage.clickCompareLink();

      //  Thread.sleep(1000);

     //   Thread.sleep(1000);
        //4 ЗАДАНИЕ
        driver.get("https://www.yandex.ru/");
        navigationPage.clickVideoLink();
        System.out.println(navigationPage.getUrl());
        Assert.assertEquals(navigationPage.getUrl(), ("https://yandex.ru/video/"));
        Assert.assertTrue((navigationPage.videoLinks.size()) > 0);
        driver.navigate().back();

        navigationPage.clickImagesLink();
        System.out.println(navigationPage.getUrl());
        Assert.assertEquals(navigationPage.getUrl(), ("https://yandex.ru/images/"));
        Assert.assertTrue((navigationPage.imagesLinks.size()) > 0);
        driver.navigate().back();

        navigationPage.clickNewsLink();
        System.out.println(navigationPage.getUrl());
        Assert.assertEquals(navigationPage.getUrl(), ("https://news.yandex.ru/"));
        Assert.assertTrue((navigationPage.newsMainLink.size()) > 0);
        driver.navigate().back();

        navigationPage.clickMapsLink();
        System.out.println(navigationPage.getUrl());
        Assert.assertTrue(navigationPage.getUrl().contains("https://yandex.ru/maps"));
        Assert.assertTrue((navigationPage.mapsMainBody.size()) > 0);
        driver.navigate().back();

        navigationPage.clickMarketLink();
        System.out.println(navigationPage.getUrl());
        Assert.assertTrue(navigationPage.getUrl().contains("https://market.yandex.ru/"));
        Assert.assertTrue((navigationPage.marketMainLink.size()) > 0);
        driver.navigate().back();

        navigationPage.clickTranslateLink();
        System.out.println(navigationPage.getUrl());
        Assert.assertEquals(navigationPage.getUrl(), ("https://translate.yandex.ru/"));
        Assert.assertTrue((navigationPage.translateInputField.size()) > 0);
        driver.navigate().back();

        navigationPage.clickMusicLink();
        System.out.println(navigationPage.getUrl());
        Assert.assertTrue(navigationPage.getUrl().contains("https://music.yandex.ru/"));
        Assert.assertTrue((navigationPage.musicInputField.size()) > 0);
        driver.navigate().back();

        navigationPage.clickTvonlineLink();
        Thread.sleep(1000);
        Assert.assertTrue((navigationPage.tvonlineStreamWindow.size()) > 0);
        System.out.println(navigationPage.getUrl());
        Assert.assertEquals(navigationPage.getUrl().contains("stream"), navigationPage.getUrl().contains("https://www.yandex.ru"), "true");
        driver.navigate().back();

    }
}
