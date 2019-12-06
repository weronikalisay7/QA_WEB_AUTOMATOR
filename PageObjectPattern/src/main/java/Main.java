import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Main {
    public static void main(String []args){
        System.setProperty("webdriver.chrome.driver", "C:/Users/37529/Desktop/учеба/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://en.wikipedia.org");
        WebElement searchInput = driver.findElement(By.id("searchInput"));
        String select = Keys.chord(Keys.CONTROL, "a");
        String cut = Keys.chord(Keys.CONTROL, "x");
        String copy = Keys.chord(Keys.CONTROL, "c");
        String paste = Keys.chord(Keys.CONTROL, "v");
        Actions act=new Actions(driver);
        act
                .click(searchInput)
                .sendKeys("Queen Elizabeth II")
                .keyDown(Keys.CONTROL)
                .sendKeys("a")
                .sendKeys("x")
                .sendKeys("c")
                .sendKeys("v")
                .keyUp(Keys.CONTROL)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();
        driver.quit();

    }
}
