package test.autotest.anton.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class MarketPage {
    public MarketPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    public WebDriver driver;
    public ArrayList arrayList;

    private  String classFromSortedPrice;

    @FindBy(css = "[class='link topmenu__link'][href='/catalog/54425?hid=91009&track=menu']")
    private WebElement computersLink;

    @FindBy(css = "[class='link topmenu__subitem'][href='/catalog/54545/list?hid=6427100&track=menuleaf']")
    public WebElement tabletLink;

    @FindBy(css = "[class='button button_theme_normal button_arrow_down button_size_s select__button i-bem button_js_inited']")
    public WebElement viewCountButton;

   @FindBy(id = "uniq15327156811847")
 private WebElement countButton12;

    @FindBy(css = "div.n-filter-block_pos_left.i-bem > div:nth-child(3) > a")
    private WebElement sortedByPrice;


    @FindBy(css = "[class='n-snippet-card2__title']")
    public List<WebElement> countLinks;

    @FindBy(css = "div[class='price']")
    public List<WebElement> priceLinks;

    @FindBy(css = "[class='n-snippet-list n-snippet-list_type_vertical metrika b-zone b-spy-init i-bem metrika_js_inited snippet-list_js_inited b-spy-init_js_inited b-zone_js_inited'] >:first-child > div.n-snippet-card2__hover >div [class='n-product-toolbar__item link link_theme_minor hint n-user-lists_type_compare i-bem n-user-lists_type_compare_in-list_no n-user-lists_type_compare_js_inited hint_js_inited _popup2-destructor _popup2-destructor_js_inited link_js_inited']")

    private WebElement toCompareLink;
// "[class='n-snippet-list n-snippet-list_type_vertical metrika b-zone b-spy-init i-bem metrika_js_inited snippet-list_js_inited b-spy-init_js_inited b-zone_js_inited'] >:first-child > div.n-snippet-card2__hover"
    @FindBy(css = "[class='n-snippet-list n-snippet-list_type_vertical metrika b-zone b-spy-init i-bem metrika_js_inited snippet-list_js_inited b-spy-init_js_inited b-zone_js_inited'] >:first-child > div.n-snippet-card2__hover >div [class='n-product-toolbar__item link link_theme_minor hint n-user-lists_type_compare i-bem n-user-lists_type_compare_in-list_no n-user-lists_type_compare_js_inited hint_js_inited _popup2-destructor _popup2-destructor_js_inited link_js_inited link_hovered_yes']")
    private WebElement compareLink;

    public void moveToCompareLink () {

        Actions actions = new Actions(driver);
        actions.moveToElement(toCompareLink);
        actions.perform();
    }
    public void clickCompareLink() {
        compareLink.click();
    }

    public ArrayList<String> obtainedList = new ArrayList<>();

    public ArrayList<String> sortedList = new ArrayList<>();

    public void moveToComputersLink () {
        Actions actions = new Actions(driver);
        actions.moveToElement(computersLink);
        actions.perform();
    }

    public void clickTabletLink() {
        tabletLink.click();
    }

  //  public void waitForElement(WebElement locator) {
      //  (new WebDriverWait(driver, 2))
    //            .until(ExpectedConditions.presenceOfElementLocated((By) locator));
   // }

    public void clickViewCountButton() {
        viewCountButton.click();
    }

    public void moveToComputersLink1 () {

        Actions actions = new Actions(driver);
        actions.moveToElement(viewCountButton);
        actions.perform();
    }

    public void clickCountButton12() {
        countButton12.click();
    }

    public void clicksortedByPrice() {
        sortedByPrice.click();
    }

    public void sortByPrice(){
       obtainedList.clear();
        for (WebElement we : priceLinks) {
             obtainedList.add(we.getText());
    }
       sortedList.clear();
        for (String s : obtainedList) {
            sortedList.add(s);
        }
    }

}