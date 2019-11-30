import java.util.*;
import java.lang.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Main {
    public static void main(String[] args) {
        //Url = "http://google.com";
        System.setProperty("webdriver.chrome.driver","C:/Users/37529/Desktop/учеба/chromedriver.exe");
        ChromeOptions op=new ChromeOptions();
        op.addArguments("--incognito");
        op.addArguments("start-maximized");
        op.addArguments("--disable-search-geolocation-disclosure");
        WebDriver driver=new ChromeDriver(op);
        driver.navigate().to("https://google.com/");
        WebElement go=driver.findElement(By.name("q"));
        go.sendKeys("banana");
        go.sendKeys(Keys.ENTER);
        WebElement img=driver.findElement(By.linkText("Картинки"));
        img.click();
        WebElement tools=driver.findElement(By.linkText("Инструменты"));
        tools.click();
        // by cssSelector  WebElement type=driver.findElement(By.cssSelector(".PKhmud[class='xFo9P']"));
        // by xpath        WebElement type=driver.findElement(By.xpath("//*[contains(@class 'xFo9P']"));
        //type.click();
        driver.quit();
      
    }
}
