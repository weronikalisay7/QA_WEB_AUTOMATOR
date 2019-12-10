import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CreateAnAccountTest {
    private WebDriver driver;
    private CreateAnAccount create;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/37529/Desktop/учеба/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/join?source=login");
        create=new CreateAnAccount(driver);
    }
    @Test
    public void username(){
        create.inputUsername("Weronika Lisay");
    }
    @Test
    public void emailInput(){
        create.inputEmail("w.lisay.7@gmail.com");
    }
    @Test
    public void pswrdInput(){
        create.inputPassword("test");
    }
    @After
    public void exit(){
        driver.quit();
    }
}
