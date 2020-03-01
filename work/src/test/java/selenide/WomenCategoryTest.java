package selenide;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class WomenCategoryTest {
    @Before
    public void setUp(){
        open("http://automationpractice.com/index.php?id_category=3&controller=category");
    }
    @Test
    public void categoriesCheckBox(){
        $(By.xpath("//*[@id='layered_category_4']")).click();
        $(By.xpath("//*[@id='layered_category_8']")).click();
    }
    @Test
    public void sizeBtns(){
        $(By.xpath("//*[@id='layered_id_attribute_group_1']")).click();
        $(By.xpath("//*[@id='layered_id_attribute_group_2']")).click();
        $(By.xpath("//*[@id='layered_id_attribute_group_3']")).click();
    }
    @Test
    public void compositionsTest(){
        $(By.xpath("//*[@id='layered_id_feature_5']")).click();
    }
    @Test
    public void stylesTest(){
        $(By.xpath("//*[@id='layered_id_feature_11']")).click();
    }

    @Test
    public void propertiesTest(){
        $(By.xpath("//*[@id='layered_id_feature_17']")).click();
    }
    @Test
    public void availabilityTest(){
        $(By.xpath("//*[@id='layered_quantity_1']")).click();
    }
    @Test
    public void manufacturerTest(){
        $(By.xpath("//*[@id='layered_manufacturer_1']")).click();
    }
    @Test
    public void conditionTest(){
        $(By.xpath("//*[@id='layered_condition_new']")).click();
    }
    

}
