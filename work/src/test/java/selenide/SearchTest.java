package selenide;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class SearchTest {
    @Before
    public void setUp(){
        open("http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=blouse&submit_search=");
    }
    @Test
    public void sortBy(){
        $(By.xpath("//*[@id='selectProductSort']")).selectOption("Price: Highest first");
    }
    @Test
    public void categories(){
        $(By.xpath("//*[@id='categories_block_left']/div/ul/li/span")).click();
        $(By.xpath("//*[@id='categories_block_left']/div/ul/li/ul/li[1]/span")).click();
        $(By.xpath("//*[@id='categories_block_left']/div/ul/li/ul/li[2]/span")).click();
    }
    @Test
    public void infoDeliveryClick(){
        $(By.xpath("//*[@id='informations_block_left_1']/div/ul/li[1]/a")).click();
    }
    @Test
    public void infoLegalNoticeClick(){
        $(By.xpath("//*[@id='informations_block_left_1']/div/ul/li[2]/a")).click();
    }
    @Test
    public void infoTermsCondUseClick(){
        $(By.xpath("//*[@id='informations_block_left_1']/div/ul/li[3]/a")).click();
    }
    @Test
    public void infoAboutUsClick(){
        $(By.xpath("//*[@id='informations_block_left_1']/div/ul/li[4]/a")).click();
    }
    @Test
    public void infoSecurePaymentClick(){
        $(By.xpath("//*[@id='informations_block_left_1']/div/ul/li[5]/a")).click();
    }
    @Test
    public void infoOurStoresClick(){
        $(By.xpath("//*[@id='informations_block_left_1']/div/ul/li[6]/a")).click();
    }
    @Test
    public void fashionManufacturesClick(){
        $(By.xpath("//*[@id='manufacturers_block_left']/div/ul/li/a")).click();
    }
    @Test
    public void selectManufacture(){
        $(By.xpath("//*[@id='manufacturers_block_left']/div/form/div/div/select")).selectOption("Fashion Manufacturer");
    }
    @Test
    public void allSpecialsBtnClick(){
        $(By.xpath("//*[@id='special_block_right']/div/div/a")).click();
    }
    @Test
    public void ourStoresBtnClick(){
        $(By.xpath("//*[@id='stores_block_left']/div/div/a")).click();
    }
    @Test
    public void suplies(){
        $(By.xpath("//*[@id='suppliers_block_left']/div/ul/li/a")).click();
    }
    @Test
    public void selectSupliesOption(){
        $(By.xpath("//*[@id='suppliers_block_left']/div/form/div/div/select")).selectOption("Fashion Supplier");
    }

}
