package selenide;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class FooterTest {
    @Before
    public void setUp(){
        open("http://automationpractice.com/index.php");
    }
    @Test
    public void copyrigth(){
        $(By.xpath("//*[@id='footer']/div/section[4]/div/a")).click();

    }
    @Test
    public void emailBox(){
        $(By.xpath("//*[@id='newsletter-input']")).setValue("w.lisay.7@gmail.com");
        $(By.xpath("//*[@id='newsletter_block_left']/div/form/div/button")).click();
        //$(By.xpath("//*[@id='columns']/p")).shouldHave(text(" Newsletter : You have successfully subscribed to this newsletter."));
    }
    @Test
    public void facebookLink() {
        $(By.xpath("//*[@id='social_block']/ul/li[1]")).click();
    }
    @Test
    public void twitterLink(){
        $(By.xpath(("//*[@id='social_block']/ul/li[2]"))).click();
    }
    @Test
    public void youtubeLink(){
        $(By.xpath("//*[@id='social_block']/ul/li[3]")).click();
    }
    @Test
    public void googleLink(){
        $(By.xpath("//*[@id='social_block']/ul/li[4]")).click();
    }
    @Test
    public void categoriesWomenClick(){
        $(By.xpath("//*[@id='footer']/div/section[2]/div/div/ul/li/a")).shouldHave(text("Women")).click();
        $(By.xpath("//*[@id='center_column']/h1/span[1]")).shouldHave(text("Women"));
    }
    @Test
    public void specialsClick(){
        $(By.xpath("//*[@id='block_various_links_footer']/ul/li[1]/a")).shouldHave(text("Specials")).click();
    }
    @Test
    public void newProductClick(){
        $(By.xpath("//*[@id='block_various_links_footer']/ul/li[2]/a")).click();
    }
    @Test
    public void bestSellersClick(){
        $(By.xpath("//*[@id='block_various_links_footer']/ul/li[3]/a")).click();
    }
    @Test
    public void ourStoresClick(){
        $(By.xpath("//*[@id='block_various_links_footer']/ul/li[4]/a")).click();
    }
    @Test
    public void contactUsClick(){
        $(By.xpath("//*[@id='block_various_links_footer']/ul/li[5]/a")).click();
    }
    @Test
    public void termsCondUseClick(){
        $(By.xpath("//*[@id='block_various_links_footer']/ul/li[6]/a")).click();
    }
    @Test
    public void aboutUsClick(){
        $(By.xpath("//*[@id='block_various_links_footer']/ul/li[7]/a")).click();
    }
    @Test
    public void siteMapClick(){
        $(By.xpath("//*[@id='block_various_links_footer']/ul/li[8]/a")).click();
    }
    @Test
    public void myOrderClick(){
        $(By.xpath("//*[@id='footer']/div/section[5]/div/ul/li[1]/a")).click();
    }
    @Test
    public void myCreditSlipsClick() {
        $(By.xpath("//*[@id='footer']/div/section[5]/div/ul/li[2]/a")).click();
    }
    @Test
    public void myAddressesClick(){
        $(By.xpath("//*[@id='footer']/div/section[5]/div/ul/li[3]/a")).click();
    }
    @Test
    public void myPersonalInfoClick(){
        $(By.xpath("//*[@id='footer']/div/section[5]/div/ul/li[4]/a")).click();
    }
}
