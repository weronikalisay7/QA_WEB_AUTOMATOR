import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SignInPageTest {
    private WebDriver driver;
    private SignInPage sign;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/37529/Desktop/учеба/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://github.com");
        sign=new SignInPage(driver);
        sign.signIn();
    }

    @Test
    public void emailInput(){
        sign.email("w.lisay.7@gmail.com");
    }
    @Test
    public void passwordInput(){
        sign.password("weronika");
    }
    @Test
    public void signBtn(){
        sign.sign();
    }
    @Test
    public void forgotPswrdBtn(){
        sign.forgotPasswordBtn();
    }
    @Test
    public void createAccBtn(){
        sign.createAccBtn();
    }
    @After
    public void exit(){
        driver.quit();
    }

}
