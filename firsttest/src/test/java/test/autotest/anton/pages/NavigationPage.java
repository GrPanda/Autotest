package test.autotest.anton.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class NavigationPage {
        public NavigationPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
            this.driver = driver;
        }
        public WebDriver driver;


    @FindBy(css ="a[href='https://market.yandex.ru/?clid=505&utm_source=face_abovesearch&utm_campaign=face_abovesearch']")
    private WebElement marketLink;


        //4 ЗАДАНИЕ
    @FindBy(css = "[data-id='video']")
    private WebElement videoLink;

    @FindBy(css = "[data-id='images']")
    private WebElement imagesLink;

    @FindBy(css = "[data-id='news']")
    private WebElement newsLink;

    @FindBy(css = "[data-id='maps']")
    private WebElement mapsLink;

    @FindBy(css = "[data-id='translate']")
    private WebElement translateLink;

    @FindBy(css = "[data-id='music']")
    private WebElement musicLink;

    @FindBy(css = "[data-id='tvonline']")
    private WebElement tvonlineLink;

    @FindBy(css = "[class='thumb-image__image related-serp__image']")
    public List<WebElement> videoLinks;

    @FindBy(css = "[class='image__image']")
    public List<WebElement> imagesLinks;

    @FindBy(css = "[class='logo logo_type_link logo_name_news-ru-77x26']")
    public List<WebElement> newsMainLink;

    @FindBy(css = "[class='_app_ready _font_loaded _map_ready']")
    public List<WebElement> mapsMainBody;

    @FindBy(css = "[class='logo logo_type_link logo_part_market']")
    public List<WebElement> marketMainLink;

    @FindBy(id = "fakeArea")
    public List<WebElement> translateInputField;

    @FindBy(css = "[class='d-input__field deco-input deco-input_suggest']")
    public List<WebElement> musicInputField;

    @FindBy(css = "[class='stream-watching__player-container']")
    public List<WebElement> tvonlineStreamWindow;

    public void clickMarketLink() {
        marketLink.click();
    }

   public void clickVideoLink() {
        videoLink.click();
    }

    public void clickImagesLink() {
        imagesLink.click();
    }

    public void clickNewsLink() {
        newsLink.click();
    }

    public void clickMapsLink() {
        mapsLink.click();
    }

    public void clickTranslateLink() {
        translateLink.click();
    }

    public void clickMusicLink() {
        musicLink.click();
    }

    public void clickTvonlineLink() {
        tvonlineLink.click();
    }

    public String getUrl() {
                String url = driver.getCurrentUrl();
return url;
    }
}

