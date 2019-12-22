package sample7RULE;
import java.util.List;
import java.util.Set;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.rules.ExternalResource;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFixture {
    protected static WebDriver driver;
    @Rule
    public  ExternalResource driverRule = new ExternalResource() {
        @Override
        protected void before() throws Throwable {
            System.out.println("Login");
            driver.get("http://localhost/someApplication");
            driver.findElement(By.name("username")).sendKeys("admin");
            driver.findElement(By.name("password")).sendKeys("admin");
            driver.findElement(By.name("submit")).click();
        };

        @Override
        protected void after() {
            System.out.println("Logout");
            driver.findElement(By.name("logout")).click();
        };
    };
}