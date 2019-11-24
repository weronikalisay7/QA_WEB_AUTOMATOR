import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/37529/Desktop/учеба/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://selenium.dev/");
        WebElement queryInput=driver.findElement(By.id("gsc-i-id1"));
        queryInput.sendKeys("Selenium");
        queryInput.submit();
        driver.navigate().refresh();
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        System.out.println("Page title is: "+driver.getTitle());
        List<WebElement> el=driver.findElements(By.className("backer-logo"));
        el.get(2).click();
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
        driver.navigate().back();
        driver.manage().window().maximize();
        WebElement b=driver.findElement(By.id("gs_tti50"));
        System.out.println("Size of our element: "+b.getSize());
        WebElement c=driver.findElement(By.className("getting-started-topic-container")).findElement(By.className("getting-started-topic")).findElement(By.className("download-button-container")).findElement(By.tagName("a"));
        c.click();
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.navigate().back();
        driver.quit();
    }

}
