package test.autotest.anton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

public class BaseTestForFirstTest {
    protected static WebDriver driver;


    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.ya.ru/");
    }
    @AfterSuite
    public static void end() {
        driver.quit();
    }

}
