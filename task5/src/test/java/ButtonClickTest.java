import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ButtonClickTest {
    private WebDriver driver;
    private ButtonsClick btn;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/37529/Desktop/учеба/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://github.com");
        btn=new ButtonsClick(driver);
    }
    @Test
    public void clickEnterpriseBtn(){
        btn.enterpriseBtn();
    }
    @Test
    public void clickMarketplaceBtn(){
        btn.marketplaceBtn();
    }
    @Test
    public void clickSearchStr(){
        btn.searchString("weronikalisay7");
    }
    @After
    public void exit(){
        driver.quit();
    }


}
