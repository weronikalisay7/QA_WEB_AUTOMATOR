package sample6RULE;

import org.junit.ClassRule;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClassFixture {

    protected static WebDriver driver;

    @ClassRule
    public static ExternalResource driverRule = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            System.out.println("browser is working...");
            System.setProperty("webdriver.chrome.driver", "C:/Users/37529/Desktop/учеба/chromedriver.exe");
            driver = new ChromeDriver();
        };

        @Override
        protected void after() {
            System.out.println("browser is stopping...");
            if (driver != null) {
                driver.quit();
            }
        };
    };
}
