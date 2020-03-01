package selenide;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class HeaderTest {
    @Before
    public void setUp(){
        open("http://automationpractice.com/index.php");
    }
    @Test
    public void saleBannerCheck(){
        $(By.xpath("//*[@id='header']/div[1]/div/div/a/img")).click();
    }
    @Test
    public void contactUs(){
        $(By.xpath("//*[@id='contact-link']/a")).click();
        $(By.xpath("//*[@id='center_column']/h1")).shouldHave(text("Customer service - Contact us"));
    }
    @Test
    public void signIn(){
        $(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
        $(By.xpath("//*[@id='center_column']/h1")).shouldHave(text("Authentication"));
    }
    @Test
    public void logoClick(){
        $(By.xpath("//*[@id='header_logo']/a/img")).click();
    }
    @Test
    public void search(){
        $(By.xpath("//*[@id='search_query_top']")).setValue("blouse");
        $(By.xpath("//*[@id='searchbox']/button")).click();
    }



}
