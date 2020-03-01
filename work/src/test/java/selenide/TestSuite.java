package selenide;

import com.codeborne.selenide.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


@RunWith(Suite.class)
@SuiteClasses({
        HeaderTest.class,
        SearchTest.class,
        HoveringTest.class,
        WomenCategoryTest.class,
        ContentTest.class,
        CartTest.class,
        FooterTest.class
})
public class TestSuite {

    @BeforeClass
    public static void suiteSetUp() {
        Configuration.headless=true;
        System.out.println("suiteSetUp");
    }

    @AfterClass
    public static void suiteTearDown() {
        System.out.println("suiteTearDown");
    }

}
