package selenide;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class HoveringTest {
    @Before
    public void setUp(){
        open("http://automationpractice.com/index.php");
    }
    @Test
    public void womenHover(){
        $(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a")).hover();
    }
    @Test
    public void womenHoverTops()
    {
        $(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a")).hover();
        $(By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/a")).click();
    }
    @Test
    public void womenHoverDresses()
    {
        $(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a")).hover();
        $(By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/a")).click();
    }
    @Test
    public void dressesHover(){
        $(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a")).hover();
    }
    @Test
    public void dressesHoverCasual(){
        $(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a")).hover();
        $(By.xpath("//*[@id='block_top_menu']/ul/li[2]/ul/li[1]/a")).click();
    }
    @Test
    public void dressesHoverEvening(){
        $(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a")).hover();
        $(By.xpath("//*[@id='block_top_menu']/ul/li[2]/ul/li[2]/a")).click();
    }
    @Test
    public void dressesHoverSummer(){
        $(By.xpath("//*[@id='block_top_menu']/ul/li[2]/a")).hover();
        $(By.xpath("//*[@id='block_top_menu']/ul/li[2]/ul/li[3]/a")).click();
    }
    @Test
    public void tshirtsHover(){
        $(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a")).click();
    }
    @Test
    public void cartHover(){
        $(By.xpath("//*[@id='header']/div[3]/div/div/div[3]/div/a")).hover();
    }
}
