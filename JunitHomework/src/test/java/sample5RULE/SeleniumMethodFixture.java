package sample5RULE;

import org.junit.Rule;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumMethodFixture {
    protected static WebDriver driver;

    @Rule
    public ExternalResource driverRule = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            System.out.println("Chrome browser is working...");
            System.setProperty("webdriver.chrome.driver", "C:/Users/37529/Desktop/учеба/chromedriver.exe");
            driver = new ChromeDriver();
        };

        @Override
        protected void after() {
            System.out.println("Chrome browser is stopping...");
            if (driver != null) {
                driver.quit();
            }
        };
    };
}
