package test.autotest.anton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import test.autotest.anton.pages.SearchPage;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;
    public static SearchPage searchPage;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
        driver = new ChromeDriver();
        searchPage = new SearchPage(driver);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get("https://ya.ru");
    }
    @AfterSuite
    public static void end() {
        driver.quit();
    }

}

