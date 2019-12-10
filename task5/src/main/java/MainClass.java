import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/37529/Desktop/учеба/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("http://github.com");

        SignInPage sign=new SignInPage(driver);
        sign.signIn().email("w.lisay.7@gmail.com").password("weronika").sign();
        driver.navigate().back();
        sign.forgotPasswordBtn();
        driver.navigate().back();
        sign.createAccBtn();

        CreateAnAccount create=new CreateAnAccount(driver);
        create.inputUsername("testuser").inputEmail("w.lisay.7@gmail.com").inputPassword("qqq8LLL");
        driver.navigate().to("http://github.com");

        ButtonsClick btn=new ButtonsClick(driver);
        btn.enterpriseBtn().backToMainPage().marketplaceBtn().backToMainPage().searchString("weronikalisay7");

    }
}
