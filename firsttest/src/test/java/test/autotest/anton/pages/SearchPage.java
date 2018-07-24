package test.autotest.anton.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage  {

    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;

    @FindBy(id = "text")
    private WebElement searchInput;

    @FindBy(css = "button")
    private WebElement searchButton;

    @FindBy(css = "a[href='https://yandex.ru/pogoda/penza?from=serp_title'] div[class='organic__url-text']")
    private WebElement firstLink;

    public void inputSearh(String search) {
        searchInput.sendKeys(search);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public String getLinkText() {
        String linkText = firstLink.getText();
        return linkText;
    }
}