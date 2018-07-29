package test.autotest.anton.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class LocationPage {

    public LocationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy(css = "[class='link geolink link_gray_yes link_geosuggest_yes']")
    private WebElement locationLink;

    public void clickLocationLink() {
        locationLink.click();
    }

    @FindBy(id = "city__front-input")
    private WebElement cityField;

    public void clearCityField() {
        cityField.clear();
    }

    public void inputCiity(String search) {
        cityField.sendKeys(search);
    }

    @FindBy(css = ".popup__content li:first-child")
    private WebElement cityLink;

    public void clickCityLinkLondon() {
        cityLink.click();
    }


    @FindBy(css = ".popup__content li:first-child")
    private WebElement cityLink2;

    public void clickCityLinkParis() {
        cityLink2.click();
    }

    @FindBy(css = "[class='home-link home-link_blue_yes home-tabs__link home-tabs__more-switcher']")
    private WebElement moreLink;

    public void clickMoreLink() {
        moreLink.click();
    }

    @FindBy(css = "[class='home-tabs__more-item']")
    private List<WebElement> moreTop;


    @FindBy(css = "[class='home-tabs__more-item home-tabs__more-item_bottom']")
    private List<WebElement> moreBottom;

    private  int  numbersOfLinks;

    public int numbersOfElementsLondon() {
        numbersOfLinks = moreBottom.size() + moreTop.size();
        return numbersOfLinks;
    }

    public int numbersOfElementsParis() {
        numbersOfLinks = moreBottom.size() + moreTop.size();
        return numbersOfLinks;
    }
}

