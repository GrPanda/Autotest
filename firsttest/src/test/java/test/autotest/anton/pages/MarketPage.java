package test.autotest.anton.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class MarketPage {
    public MarketPage ( WebDriver driver ) {
        PageFactory.initElements ( driver , this );
        this.driver = driver;
    }

    public  String    classWhenSortedDescByPrice = "n-filter-sorter i-bem n-filter-sorter_js_inited n-filter-sorter_sort_desc n-filter-sorter_state_select";
    public  String    classWhenSortedAscByPrice  = "n-filter-sorter i-bem n-filter-sorter_js_inited n-filter-sorter_sort_asc n-filter-sorter_state_select";
    public  WebDriver driver;
    public  ArrayList arrayList;
    private String    classFromSortedPrice;

    @FindBy ( css = "[class='link topmenu__link'][href='/catalog/54425?hid=91009&track=menu']" )
    private WebElement        computersLink;
    @FindBy ( css = "[class='link topmenu__subitem'][href='/catalog/54545/list?hid=6427100&track=menuleaf']" )
    private WebElement        tabletLink;
    @FindBy ( css = "[class='button button_theme_normal button_arrow_down button_size_s select__button i-bem button_js_inited']" )
    private WebElement        viewCountButton;
    @FindBy ( css = ".select__list .select__item:nth-of-type(1)" )
    private WebElement        countButton12;
    @FindBy ( css = ".select__list .select__item:nth-of-type(2)" )
    private WebElement        countButton48;
    @FindBy ( css = "div.n-filter-block_pos_left.i-bem > div:nth-child(3)" )
    public  WebElement        sortedByPrice;
    @FindBy ( css = "[class='n-snippet-card2__title']" )
    private List <WebElement> itemLinks;
    @FindBy ( css = "div[class='price']" )
    private List <WebElement> priceLinks;
    @FindBy ( css = "[class='layout__col i-bem layout__col_search-results_normal'] > div > div >div >div:last-child   div[class='price']:last-child" )
    private WebElement        lastPriceLink;
    @FindBy ( css = "div > div:nth-child(2) > div.n-snippet-card2__hover > div > div > div" )
    private WebElement        secondItemForCompare;
    @FindBy ( css = "div > div:first-child > div.n-snippet-card2__hover > div > div > div" )
    private WebElement        firstItemForCompare;
    @FindBy ( css = "[href='/compare?track=head']" )
    private WebElement        compareLink;
    @FindBy ( css = ".n-compare-head.i-bem.n-compare-head_js_inited > div > div > div >div" )
    public  List <WebElement> compareItemsList;
    @FindBy ( css = ".n-compare-head.i-bem.n-compare-head_js_inited > div > div > div >div:first-child > div > span" )
    private WebElement        firstCompareItemDeleteButton;
    @FindBy ( css = ".n-compare-head.i-bem.n-compare-head_js_inited > div > div > div >div:nth-child(2) > div > span" )
    private WebElement        secondCompareItemDeleteButton;
    @FindBy ( css = ".n-compare-head.i-bem.n-compare-head_js_inited > div > div > div >div:first-child" )
    public  WebElement        firstCompareItem;
    @FindBy ( css = ".n-compare-head.i-bem.n-compare-head_js_inited > div > div > div >div:nth-child(2)" )
    public  WebElement        secondCompareItem;

    public ArrayList <String> obtainedList = new ArrayList <> ( );
    public ArrayList <String> sortedList   = new ArrayList <> ( );

    public void clickFirstCompareItemDeleteButton ( ) {
        WebElement explicitWait = ( new WebDriverWait ( driver , 10 ) )
                .until ( ExpectedConditions.elementToBeClickable ( firstCompareItemDeleteButton ) );
        firstCompareItemDeleteButton.click ( );
    }

    public void clickSecondCompareItemDeleteButton ( ) {
        WebElement explicitWait = ( new WebDriverWait ( driver , 10 ) )
                .until ( ExpectedConditions.elementToBeClickable ( secondCompareItemDeleteButton ) );
        secondCompareItemDeleteButton.click ( );
    }

    public void clickCompareLink ( ) {

        WebElement explicitWait = ( new WebDriverWait ( driver , 10 ) )
                .until ( ExpectedConditions.elementToBeClickable ( compareLink ) );
        compareLink.click ( );
    }

    public void clickSecondItemForCompare ( ) {
        secondItemForCompare.click ( );
    }

    public void clickFirstItemForCompare ( ) {
        firstItemForCompare.click ( );
    }

    public void moveToCompareIemLink2 ( ) {
        Actions actions = new Actions ( driver );
        actions.moveToElement ( secondCompareItemDeleteButton );
        actions.perform ( );
    }

    public void moveToCompareIemLink ( ) {
        Actions actions = new Actions ( driver );
        actions.moveToElement ( firstCompareItemDeleteButton );
        actions.perform ( );
    }

    public void moveToComputersLink ( ) {
        Actions actions = new Actions ( driver );
        actions.moveToElement ( computersLink );
        actions.perform ( );
    }

    public void clickViewCountButton ( ) {
        viewCountButton.click ( );
    }

    public void clickCountButton12 ( ) {
        countButton12.click ( );
    }

    public void clickCountButton48 ( ) {
        countButton48.click ( );
    }

    public void sortByPrice ( ) {
        Boolean explicitWait = ( new WebDriverWait ( driver , 10 ) )
                .until ( ExpectedConditions.invisibilityOf ( priceLinks.get ( 11 ) ) );
        obtainedList.clear ( );
        sortedList.clear ( );
        priceLinks.clear ( );
        for ( WebElement we : priceLinks ) {
            obtainedList.add ( we.getText ( ) );
        }
        for ( String s : obtainedList ) {
            sortedList.add ( s );
        }
    }

    public void clicksortedByPrice ( ) {
        sortedByPrice.click ( );
    }

    public void clickTabletLink ( ) {
        WebElement explicitWait = ( new WebDriverWait ( driver , 10 ) )
                .until ( ExpectedConditions.elementToBeClickable ( tabletLink ) );
        tabletLink.click ( );
    }

    public int getCountItemLinks ( ) {
        Boolean explicitWait = ( new WebDriverWait ( driver , 10 ) )
                .until ( ExpectedConditions.invisibilityOf ( itemLinks.get ( 0 ) ) );
        return itemLinks.size ( );
    }
 }