package test.autotest.anton;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import static org.testng.Assert.assertTrue;

public class FirstTest {

    private static WebDriver driver;

    @Test
    public static void yandex() {
        System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.get("https://ya.ru");

        WebElement searchInput = driver.findElement(By.id("text"));
        searchInput.sendKeys ("погода пенза");

        WebElement loginButton = driver.findElement(By.cssSelector("button"));
        loginButton.click();

        assertTrue(driver.findElement(By.cssSelector("a[href='https://yandex.ru/pogoda/penza?from=serp_title'] div[class='organic__url-text']")).getText().contains("Пензе"));

        driver.quit();
    }
}
