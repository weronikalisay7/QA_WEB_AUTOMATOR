package selenide;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class ContentTest {
    @Before
    public void setUp(){
        open("http://automationpractice.com/index.php");
    }
    @Test
    public void saleBannerClick(){
        $(By.xpath("//*[@id='htmlcontent_top']/ul/li[1]/a/img")).click();
    }
    @Test
    public void summerCollectionBannerClick(){
        $(By.xpath("//*[@id='htmlcontent_top']/ul/li[2]/a/img")).click();
    }
    @Test
    public void topTrendsClick(){
        $(By.xpath("//*[@id='htmlcontent_home']/ul/li[1]/a/img")).click();
    }
    @Test
    public void mensCoatsJacketsClick(){
        $(By.xpath("//*[@id='htmlcontent_home']/ul/li[2]/a/img")).click();
    }
    @Test
    public void womenCoatsJacketsClick(){
        $(By.xpath("//*[@id='htmlcontent_home']/ul/li[3]/a/img")).click();
    }
    @Test
    public void sunglassesEyewearClick(){
        $(By.xpath("//*[@id='htmlcontent_home']/ul/li[4]/a/img")).click();
    }
    @Test
    public void hadbagsClick(){
        $(By.xpath("//*[@id='htmlcontent_home']/ul/li[5]/a/img")).click();
    }
    /*@Test
    public void eyeIconClick(){
        $(By.xpath("//*[@id='homefeatured']/li[1]/div/div[1]/div/div[1]/a/i")).click();
    }*/
    @Test
    public void clickByItemName(){
        $(By.xpath("//*[@id='homefeatured']/li[1]/div/div[2]/h5/a")).click();
    }
    @Test
    public void clickByItemImg(){
        $(By.xpath("//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img")).click();
    }
    /*@Test
    public void addToCartClick(){
        $(By.xpath("//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[1]/span")).click();
    }
    @Test
    public void moreClick(){
        $(By.xpath("//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[2]/span")).click();
    }*/

}
