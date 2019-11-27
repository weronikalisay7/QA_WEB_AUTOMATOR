import java.util.*;
import java.lang.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        //Url = "http://google.com";
        System.setProperty("webdriver.chrome.driver","C:/Users/37529/Desktop/учеба/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://google.com/");
        WebElement go=driver.findElement(By.name("q"));
        go.sendKeys("banana");
        go.sendKeys(Keys.ENTER);
        WebElement img=driver.findElement(By.linkText("Картинки"));
        img.click();
        WebElement tools=driver.findElement(By.className("ZXJQ7c"));
        tools.click();
        // by cssSelector  WebElement type=driver.findElement(By.cssSelector(".PKhmud[class='xFo9P']"));
        // by xpath        WebElement type=driver.findElement(By.xpath("//*[contains(@class 'xFo9P']"));
        //type.click();
        driver.quit();
        WebDriver dr=new ChromeDriver();
        dr.get("https://selenium.dev/");
        WebElement home=dr.findElement(By.cssSelector(".hero homepage"));
        System.out.println(home.getSize());
        WebElement down=dr.findElement(By.xpath("//*[contains(@class 'download-button-container'"));
        down.click();
    }
}