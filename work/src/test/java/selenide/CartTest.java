package selenide;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class CartTest {
    @Before
    public void setUp(){
        open("http://automationpractice.com/index.php?id_product=1&controller=product");
    }
    /*@Test
    public void moreClick(){
        $(By.xpath("//*[@id='homefeatured']/li[1]/div/div[2]/div[2]/a[2]")).click();
    }*/
    @Test
    public void quantity(){
        $(By.xpath("//*[@id='quantity_wanted_p']/a[2]")).click();
    }
    @Test
    public void selectSize(){
        $(By.xpath("//*[@id='group_1']")).selectOption("M");
    }
    @Test
    public void selectColor(){
        $(By.xpath("//*[@id='color_14']")).click();
    }
    @Test
    public void addToWishList(){
        $(By.xpath("//*[@id='wishlist_button']")).click();
        $(By.xpath("//*[@id='product']/div[2]/div/div/div/div/p")).shouldBe(visible);
        $(By.xpath("//*[@id='product']/div[2]/div/div/a")).click();
    }
    @Test
    public void addToCartBtn(){
        $(By.xpath("//*[@id='add_to_cart']/button")).click();
    }
    /*@Test
    public void checkOut(){
        $(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a")).click();
    }
    @Test
    public void deleteItem(){
        $(By.xpath("//*[@id='1_1_0_0']")).click();
    }*/

}
